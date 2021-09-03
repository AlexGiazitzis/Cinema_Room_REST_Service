package cinema.converters;

import cinema.dto.ReturnedTicketDTO;
import cinema.entities.Ticket;

/**
 * @author Alex Giazitzis
 */
public class ReturnedTicketConverter {
    public static ReturnedTicketDTO getReturnedTicket(Ticket ticket) {
        return new ReturnedTicketDTO(SeatConverter.getDTO(ticket.getTicket()));
    }
}
