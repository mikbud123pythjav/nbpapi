package nbpapi.pl.nbpapi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ApiController {

    @PostMapping(value="/processForm")
    public String precessForm(@RequestParam("username") String username, @RequestParam("password") String password){
        //co trzeba zrobić
        //tu wpisujesz co chcesz żeby program wypluwał
        //i tu mam wywołanie następnej strony o nazwie result
        return "result";
    }
    @GetMapping("/register")
    public String index(Model model){
        return "register";
    }

    @PostMapping(value="/registerForm")
    public String registerForm(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("returnpassword") String returnpassword){
        return "indexx";
    }
//@Mapping
//@Mapping
//@Mapping
//@Mapping



}
