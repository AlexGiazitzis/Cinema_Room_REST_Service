package cinema.services;

import cinema.dto.ReturnedTicketDTO;
import cinema.dto.TicketDTO;
import cinema.entities.Seat;

import java.util.UUID;

/**
 * @author Alex Giazitzis
 */
public interface TicketService {
    TicketDTO purchase(Seat seat);
    ReturnedTicketDTO refund(UUID ticket);
}
