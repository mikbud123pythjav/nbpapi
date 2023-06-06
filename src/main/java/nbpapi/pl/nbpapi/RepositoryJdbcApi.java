package nbpapi.pl.nbpapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositoryJdbcApi {
    @Autowired
    Login login;

    @Autowired
    YourCurrency yourCurrency;

    private void setLogin(Login login) {
        this.login = login;
    }
    private void setYourCurrency(YourCurrency yourCurrency){
        this.yourCurrency = yourCurrency;
    }






}
