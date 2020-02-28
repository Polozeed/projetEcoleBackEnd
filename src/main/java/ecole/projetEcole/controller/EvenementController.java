package ecole.projetEcole.controller;


import ecole.projetEcole.dto.event.EvenementDto;
import ecole.projetEcole.repository.EvenementRepository;
import ecole.projetEcole.service.ServiceEvenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EvenementController {

    @Autowired
    EvenementRepository evenementRepository;
    @Autowired
    ServiceEvenement serviceEvenement;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/evenement")
    public ResponseEntity<EvenementDto> postEvenement(@RequestBody EvenementDto evenementDto) {
        EvenementDto evenementDtoReturn = serviceEvenement.addEvenement(evenementDto);
        return new ResponseEntity<>( evenementDtoReturn, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/evenement/{id}")
    public ResponseEntity<EvenementDto> getEvenement(@PathVariable("id") int id){
        EvenementDto evenementDto = serviceEvenement.rechercheParId(id);
        return new ResponseEntity<>( evenementDto, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/evenements")
    public ResponseEntity<List<EvenementDto>> getAllEvenement(){
        List<EvenementDto> listEvenementDto = serviceEvenement.listEvenement();
        return new ResponseEntity<>( listEvenementDto, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/evenement/intitule/{intitule}")
    public ResponseEntity<List<EvenementDto>> rechercheParIntitule(@PathVariable("intitule") String intitule){
        List<EvenementDto> ListevenementDto = serviceEvenement.rechercheParIntitule(intitule);
        return new ResponseEntity<>( ListevenementDto, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/evenement/date/{date}")
    public ResponseEntity<String> rechercheParDate(@PathVariable("date") String date ){
        List<EvenementDto> ListevenementDto = serviceEvenement.rechercheParDate(date);
        return new ResponseEntity<>( ListevenementDto.toString(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/evenement/{id}")
    public ResponseEntity<EvenementDto> putEvenement(@PathVariable("id") int id, @RequestBody EvenementDto evenementDto){
        EvenementDto evenementDtoReturn = serviceEvenement.modifierEvenement(id, evenementDto);
        return new ResponseEntity<>( evenementDtoReturn, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/evenement/{id}")
    public ResponseEntity<String> deleteEvenement(@PathVariable("id") int id){
        serviceEvenement.deleteEvenement(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/event")
    public ResponseEntity<List<EvenementDto>> listeEvenement(){
        List<EvenementDto> eventDtoList  = serviceEvenement.listEvenement();
        return new ResponseEntity<>(eventDtoList,HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/eventPage/{limit}/{offset}")
    public ResponseEntity<List<EvenementDto>> listeEvenementParPage(@PathVariable("limit")int limit,@PathVariable("offset")int offset){
        List<EvenementDto> eventDtoList  = serviceEvenement.listEvenementPourChargementParPage(limit,offset);
        return new ResponseEntity<>(eventDtoList,HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/nbEvenement")
    public ResponseEntity<Integer> nbEvenement(){
        int compt = 0;
        List<Integer> valeur  = evenementRepository.findNbOccurenceEvent();
        for (Integer val: valeur ){
            compt = compt + 1;
        }
        return new ResponseEntity<>(compt,HttpStatus.OK);
    }

}
