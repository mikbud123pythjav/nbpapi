package nbpapi.pl.nbpapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ApiController {
    @Autowired
    RepositoryJdbcApi repositoryJdbcApi;

    private void setRepositoryJdbcApi(RepositoryJdbcApi repositoryJdbcApi){
        this.repositoryJdbcApi = repositoryJdbcApi;
    }



}
