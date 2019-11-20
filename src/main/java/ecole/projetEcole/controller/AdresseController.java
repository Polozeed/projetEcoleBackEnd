package ecole.projetEcole.controller;

import ecole.projetEcole.dto.AdresseDto;
import ecole.projetEcole.service.ServiceAdresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class AdresseController {



        @Autowired
    ServiceAdresse serviceAdresse;

        @PostMapping("/adresse")
        public ResponseEntity<String> postAdresse(@RequestBody AdresseDto adresse) {

            AdresseDto adresseReturn = serviceAdresse.addAdresse(adresse);
            if (adresse.equals(adresseReturn)) {
                return new ResponseEntity<>( "Insertion OK : " + adresse.toString(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
            }

        }
}
