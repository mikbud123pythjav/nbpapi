package nbpapi.pl.nbpapi;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class YourCurrency {
    private double currency;
    private String nameOfCurrency;
}

