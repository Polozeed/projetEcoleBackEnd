package ecole.projetEcole.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcoleController {



    @GetMapping("test")
    public String testEcole() {
        System.out.println("je suis dans le controller");
        return "salut";
    }
}
