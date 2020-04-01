package ecole.projetEcole.controller;

import ecole.projetEcole.dto.AdresseDto;
import ecole.projetEcole.service.ServiceAdresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class AdresseController {

    @Autowired
    ServiceAdresse serviceAdresse;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/adresse")
    public ResponseEntity<AdresseDto> postAdresse(@RequestBody AdresseDto adresse) {
        AdresseDto adresseReturn = serviceAdresse.addAdresse(adresse);
        return new ResponseEntity<>( adresseReturn, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/adresse/{id}")
    public ResponseEntity<AdresseDto> putAdresse(@PathVariable("id") int id, @RequestBody AdresseDto adresse) {
        AdresseDto adresseReturn = serviceAdresse.modifierAdresse(id,adresse);
        if (adresse.equals(adresseReturn)) {
            return new ResponseEntity<>( adresse, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(adresse, HttpStatus.CONFLICT);
        }

    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("adresse/{id}")
    public ResponseEntity<AdresseDto> rechercheEcoleId(@PathVariable("id") int id){
        AdresseDto adresseDto = serviceAdresse.rechercheParId(id);
        return new ResponseEntity<AdresseDto>( adresseDto, HttpStatus.OK);
    }
}
