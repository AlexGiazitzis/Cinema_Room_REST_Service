package cinema.converters;

import cinema.dto.CinemaDTO;
import cinema.entities.Cinema;

/**
 * @author Alex Giazitzis
 */
public class CinemaConverter {
    public static CinemaDTO getDTO(Cinema cinema) {
        return new CinemaDTO(cinema.getTotal_rows(), cinema.getTotal_columns(), cinema.getAvailable_seats());
    }
}
