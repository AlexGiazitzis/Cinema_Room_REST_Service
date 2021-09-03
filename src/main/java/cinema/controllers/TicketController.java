package cinema.controllers;

import cinema.converters.SeatConverter;
import cinema.dto.ReturnedTicketDTO;
import cinema.dto.SeatDTO;
import cinema.dto.TicketDTO;
import cinema.dto.TokenDTO;
import cinema.entities.Cinema;
import cinema.exceptions.InvalidSeatException;
import cinema.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Alex Giazitzis
 */
@RestController
public class TicketController {
    private final TicketService ticketService;

    @Autowired
    public TicketController(final TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/purchase")
    public ResponseEntity<TicketDTO> purchase(@RequestBody SeatDTO dto) {
        if (dto.getColumn() > Cinema.cinema.getTotal_columns() || dto.getColumn() <= 0 ||
            dto.getRow() > Cinema.cinema.getTotal_rows() || dto.getRow() <= 0) {
            throw new InvalidSeatException("The number of a row or a column is out of bounds!");
        }

        return ResponseEntity.ok(ticketService.purchase(SeatConverter.getSeat(dto)));
    }

    @PostMapping("/return")
    public ResponseEntity<ReturnedTicketDTO> refund(@RequestBody TokenDTO token) {
        UUID argToken;
        try {
            argToken = UUID.fromString(token.getToken());
        } catch (IllegalArgumentException ignored) {
            throw new InvalidSeatException("Wrong token!");
        }

        return ResponseEntity.ok(ticketService.refund(argToken));

    }
}
