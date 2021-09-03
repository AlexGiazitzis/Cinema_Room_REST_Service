package cinema.controllers;

import cinema.dto.PasswordDTO;
import cinema.dto.StatisticsDTO;
import cinema.exceptions.WrongPasswordException;
import cinema.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex Giazitzis
 */
@RestController
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(final AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/stats")
    public ResponseEntity<StatisticsDTO> getStatistics(@RequestParam(required = false) PasswordDTO password) {
        if (password == null) {
            throw new WrongPasswordException("The password is wrong!");
        }

        return ResponseEntity.ok(adminService.getStatistics(password.getPassword()));
    }
}
