package cinema.dto;

/**
 * @author Alex Giazitzis
 */
public class PasswordDTO {
    private final String password;

    public PasswordDTO(final String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
