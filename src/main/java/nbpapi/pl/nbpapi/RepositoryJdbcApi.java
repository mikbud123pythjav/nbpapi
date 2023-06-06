package nbpapi.pl.nbpapi;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class RepositoryJdbcApi {
    @Autowired
    private Login login;
    @Autowired
    YourCurrency yourCurrency;
    private final JdbcTemplate jdbcTemplate;

    RepositoryJdbcApi(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setRegister(Login login, String password, String password1){
        if(password == password1)
        jdbcTemplate.queryForRowSet("".formatted(login, password, password1));
    }




    //method which creates us LOGIN mechanism
    public void setLogin(String login, String password){
        jdbcTemplate.queryForRowSet("INSERT INTO some-postgres(login, password) VALUES (%s, %s)".formatted(login, password));
    }





    public void setAccountCurrenct(){

    }












}
