package cinema.controllers;

import cinema.converters.CinemaConverter;
import cinema.dto.CinemaDTO;
import cinema.entities.Cinema;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Giazitzis
 */
@RestController
public class CinemaController {

    @GetMapping("/seats")
    public ResponseEntity<CinemaDTO> getAvailableSeats() {
        return ResponseEntity.ok(CinemaConverter.getDTO(Cinema.cinema));
    }
}
