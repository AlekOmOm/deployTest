package dk.kea.deploytest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test {

    @GetMapping("/")
    public String index() {
        return "home";
    }
}
