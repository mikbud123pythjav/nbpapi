package nbpapi.pl.nbpapi;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Login {
    private char[] login;
    private char[] password;
}
