package nbpapi.pl.nbpapi;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Register {
    private char[] login;
    private char[] password;
    private char[] password_1;
}
