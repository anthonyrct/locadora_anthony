package webapp.locadora_anthony.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class indexController {
    
    @GetMapping("/home")
    public String acessoHomePage() {
        return "index";
    }
    
}
