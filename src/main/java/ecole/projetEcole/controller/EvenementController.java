package ecole.projetEcole.controller;


import ecole.projetEcole.dto.event.EvenementDto;
import ecole.projetEcole.service.ServiceEvenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EvenementController {




    @Autowired
    ServiceEvenement serviceEvenement;


    @PostMapping("/evenement")
    public ResponseEntity<String> postEvenement(@RequestBody EvenementDto evenementDto) {

        EvenementDto evenementDtoReturn = serviceEvenement.addEvenement(evenementDto);
        if (evenementDto.equals(evenementDtoReturn)) {
            return new ResponseEntity<>( "Insertion OK : " + evenementDto.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
        }

    }

}
