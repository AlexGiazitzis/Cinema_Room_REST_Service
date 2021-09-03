package cinema.dto;

/**
 * @author Alex Giazitzis
 */
public class ReturnedTicketDTO {
    private final SeatDTO returned_ticket;

    public ReturnedTicketDTO(final SeatDTO returned_ticket) {
        this.returned_ticket = returned_ticket;
    }

    public SeatDTO getReturned_ticket() {
        return returned_ticket;
    }
}
