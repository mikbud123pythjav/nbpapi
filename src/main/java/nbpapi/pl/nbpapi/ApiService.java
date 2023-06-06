package nbpapi.pl.nbpapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    @Autowired
    private RepositoryJdbcApi repositoryJdbcApi;

    public ApiService(RepositoryJdbcApi repositoryJdbcApi) {
        this.repositoryJdbcApi = repositoryJdbcApi;
    }



}
