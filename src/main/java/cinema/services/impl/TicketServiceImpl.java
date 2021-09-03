package cinema.services.impl;

import cinema.converters.ReturnedTicketConverter;
import cinema.converters.TicketConverter;
import cinema.dto.ReturnedTicketDTO;
import cinema.dto.TicketDTO;
import cinema.entities.Cinema;
import cinema.entities.Seat;
import cinema.entities.Ticket;
import cinema.exceptions.InvalidSeatException;
import cinema.exceptions.WrongTokenException;
import cinema.services.TicketService;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Alex Giazitzis
 */
@Service
public class TicketServiceImpl implements TicketService {

    @Override
    public TicketDTO purchase(final Seat seat) {
        if (!Cinema.cinema.getAvailable_seats().contains(seat)) {
            throw new InvalidSeatException("The ticket has been already purchased!");
        }
        Ticket ticket = new Ticket(UUID.randomUUID(), seat);
        Cinema.cinema.getTickets_sold().add(ticket);
        Cinema.cinema.getAvailable_seats().remove(seat);
        return TicketConverter.getDTO(ticket);
    }

    @Override
    public ReturnedTicketDTO refund(final UUID ticket_token) {
        Ticket returned_ticket = Cinema.cinema.getTickets_sold().stream().filter(t -> t.getToken().equals(ticket_token))
                                              .findFirst().orElse(null);
        if (returned_ticket == null) {
            throw new WrongTokenException("Wrong token!");
        }
        Cinema.cinema.getTickets_sold().remove(returned_ticket);
        Cinema.cinema.getAvailable_seats().add(returned_ticket.getTicket());
        return ReturnedTicketConverter.getReturnedTicket(returned_ticket);
    }
}
