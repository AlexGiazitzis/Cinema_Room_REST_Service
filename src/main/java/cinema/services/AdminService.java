package cinema.services;

import cinema.dto.StatisticsDTO;

/**
 * @author Alex Giazitzis
 */
public interface AdminService {

    StatisticsDTO getStatistics(String password);
}
