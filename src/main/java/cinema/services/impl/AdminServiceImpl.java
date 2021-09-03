package cinema.services.impl;

import cinema.dto.StatisticsDTO;
import cinema.entities.Cinema;
import cinema.entities.Ticket;
import cinema.exceptions.WrongPasswordException;
import cinema.services.AdminService;
import org.springframework.stereotype.Service;

/**
 * @author Alex Giazitzis
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Override
    public StatisticsDTO getStatistics(final String password) {
        if (!"super_secret".equals(password)) {
            throw new WrongPasswordException("The password is wrong!");
        }
        int income = 0;

        for (Ticket t : Cinema.cinema.getTickets_sold()) {
            income += t.getTicket().getPrice();
        }

        return new StatisticsDTO(income, Cinema.cinema.getAvailable_seats().size(), Cinema.cinema.getTickets_sold().size());
    }
}
