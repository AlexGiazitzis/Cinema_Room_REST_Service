package cinema.entities;

import java.util.Objects;
import java.util.UUID;

/**
 * @author Alex Giazitzis
 */
public class Ticket {
    private final UUID token;
    private final Seat ticket;

    public Ticket(final UUID token, final Seat seat) {
        this.token = token;
        this.ticket = seat;
    }

    public UUID getToken() {
        return token;
    }

    public Seat getTicket() {
        return ticket;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(token, ticket.token) && Objects.equals(this.ticket, ticket.ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, ticket);
    }
}
