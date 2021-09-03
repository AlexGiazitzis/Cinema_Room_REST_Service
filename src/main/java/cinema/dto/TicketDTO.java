package cinema.dto;

import cinema.entities.Seat;
import cinema.entities.Ticket;

import java.util.UUID;

/**
 * @author Alex Giazitzis
 */
public class TicketDTO {
    private final UUID token;
    private final Seat ticket;

    public TicketDTO(final UUID token, final Seat ticket) {
        this.token = token;
        this.ticket = ticket;
    }

    public TicketDTO(Ticket ticket) {
        this.token = ticket.getToken();
        this.ticket = ticket.getTicket();
    }

    public UUID getToken() {
        return token;
    }

    public Seat getTicket() {
        return ticket;
    }
}
