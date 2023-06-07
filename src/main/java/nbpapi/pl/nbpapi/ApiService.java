package nbpapi.pl.nbpapi;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ApiService {
    private final RepositoryJdbcApi repositoryJdbcApi;

    public ApiService(RepositoryJdbcApi repositoryJdbcApi) {
        this.repositoryJdbcApi = repositoryJdbcApi;
    }
}



