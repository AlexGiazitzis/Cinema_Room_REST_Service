package cinema.converters;

import cinema.dto.SeatDTO;
import cinema.entities.Seat;

/**
 * @author Alex Giazitzis
 */
public class SeatConverter {
    public static Seat getSeat(SeatDTO dto) {
        return new Seat(dto.getRow(), dto.getColumn());
    }

    public static SeatDTO getDTO(Seat seat) {
        return new SeatDTO(seat.getRow(), seat.getColumn(), seat.getPrice());
    }
}
