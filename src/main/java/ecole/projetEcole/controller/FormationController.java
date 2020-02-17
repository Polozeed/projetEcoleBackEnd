package ecole.projetEcole.controller;

import ecole.projetEcole.dto.ecole.DiplomeDto;
import ecole.projetEcole.dto.ecole.FormationDto;
import ecole.projetEcole.service.ServiceFormation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

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

    @GetMapping("/formation/{intitule}")
    public ResponseEntity<List<FormationDto>> getFormation(@PathVariable("intitule") String nom){
        List<FormationDto> formationDtoList;
        formationDtoList= serviceFormation.rechercheParIntitule(nom);
        System.out.println(formationDtoList);
        return new ResponseEntity<>( formationDtoList, HttpStatus.OK);
    }

    @GetMapping("/ecoleS/formation/{intitule}")
    public ResponseEntity<List<FormationDto>> getEcoleFormation(@PathVariable("intitule") String nom){
        List<FormationDto> formationDtoList;
        formationDtoList= serviceFormation.rechercheParIntitule(nom);
        System.out.println(formationDtoList);
        return new ResponseEntity<>( formationDtoList, HttpStatus.OK);
    }

    @GetMapping("/diplome/{intitule}")
    public ResponseEntity<String> getDiplome(@PathVariable("intitule") String nom){
        List<DiplomeDto> diplomeDtoList;
        diplomeDtoList = serviceFormation.rechercheDiplomeParIntitule(nom);
        System.out.println(diplomeDtoList);
        return new ResponseEntity<>( diplomeDtoList.toString(), HttpStatus.OK);
    }
}
