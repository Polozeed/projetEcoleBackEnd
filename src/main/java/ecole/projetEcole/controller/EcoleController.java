package ecole.projetEcole.controller;

import ecole.projetEcole.dto.ecole.EcoleDto;
import ecole.projetEcole.service.ServiceEcole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EcoleController {

    @Autowired
    ServiceEcole serviceEcoleTest;

   @GetMapping( "/ville")
    public String getTestVille() {
       serviceEcoleTest.getClass();
        System.out.println("je suis dans le controller");
        return "ville";
    }


    @PostMapping("/ecole")
    public ResponseEntity<String> postEcole(@RequestBody EcoleDto ecole) {

        EcoleDto ecolereturn = serviceEcoleTest.addecole(ecole);
        if (ecole.equals(ecolereturn)) {
            return new ResponseEntity<>( "Insertion OK : " + ecole.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
        }

    }

}
