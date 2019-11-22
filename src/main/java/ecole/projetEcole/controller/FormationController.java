package ecole.projetEcole.controller;

import ecole.projetEcole.dto.ecole.DiplomeDto;
import ecole.projetEcole.dto.ecole.FormationDto;
import ecole.projetEcole.service.ServiceFormation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class FormationController {



        @Autowired
        ServiceFormation serviceFormation;


        @PostMapping("/formation")
        public ResponseEntity<String> postFormation(@RequestBody FormationDto formationDto) {

            FormationDto formationReturn = serviceFormation.addformation(formationDto);
            if (formationDto.equals(formationReturn)) {
                return new ResponseEntity<>( "Insertion OK : " + formationDto.toString(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
            }

        }

    @PostMapping("/diplome")
    public ResponseEntity<String> postDiplome(@RequestBody DiplomeDto diplomeDto) {

        DiplomeDto diplomeDtoReturn = serviceFormation.addDiplome(diplomeDto);
        if (diplomeDto.equals(diplomeDtoReturn)) {
            return new ResponseEntity<>( "Insertion OK : " + diplomeDto.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
        }

    }
}
