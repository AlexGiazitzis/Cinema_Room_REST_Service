package cinema.converters;

import cinema.dto.TicketDTO;
import cinema.entities.Ticket;

/**
 * @author Alex Giazitzis
 */
public class TicketConverter {
    public static TicketDTO getDTO(Ticket ticket) {
        return new TicketDTO(ticket.getToken(), ticket.getTicket());
    }
}
