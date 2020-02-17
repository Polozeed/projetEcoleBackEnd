package ecole.projetEcole.controller;

import ecole.projetEcole.dto.personne.CollaborateurDto;
import ecole.projetEcole.dto.personne.ContactDto;
import ecole.projetEcole.dto.personne.PersonneDto;
import ecole.projetEcole.service.ServicePersonne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PersonneController {

    @Autowired
    ServicePersonne servicePersonne;


    @PostMapping("/personne")
    public ResponseEntity<String> postPersonne(@RequestBody PersonneDto personneDto) {

        PersonneDto personneDtoReturn = servicePersonne.addPersonne(personneDto);
        if (personneDto.equals(personneDtoReturn)) {
            return new ResponseEntity<>("Insertion OK : " + personneDto.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
        }
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/personne")
    public ResponseEntity<List<PersonneDto>> listePersonne(){
        List<PersonneDto> personneDtoList  = servicePersonne.listePersonne();
        return new ResponseEntity<>(personneDtoList,HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/collaborateur")
    public ResponseEntity<String> postCollaborateur(@RequestBody CollaborateurDto collaborateurDto) {
        CollaborateurDto collaborateurDtoReturn = servicePersonne.addCollaborateur(collaborateurDto);
        if (collaborateurDto.equals(collaborateurDtoReturn)) {
            return new ResponseEntity<>("Insertion OK : " + collaborateurDto.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
        }
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/contact")
    public ResponseEntity<String> postContact(@RequestBody ContactDto contactDto) {
        ContactDto contactDtoReturn = servicePersonne.addContact(contactDto);
        if (contactDto.equals(contactDtoReturn)) {
            return new ResponseEntity<>("Insertion OK : " + contactDto.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
        }
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/personne/{type}/{id}")
    public ResponseEntity<List<PersonneDto>> rechercherPersonneParId(@PathVariable ("type") String type ,@PathVariable ("id") int id){
        List<PersonneDto> personneDtoList  = servicePersonne.rechercheParId(id, type);
        return new ResponseEntity<>(personneDtoList,HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{type}/{nom}")
    public ResponseEntity<List<PersonneDto>> getContactByNom(@PathVariable ("type") String type ,@PathVariable ("nom") String nom){
        List<PersonneDto> personneDtoList = servicePersonne.rechercheParNomPrenom(nom,type);
        return new ResponseEntity<>(personneDtoList, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/personne/formation/{formation}")
    public ResponseEntity<String> rechercherPersonneParFormation(@PathVariable ("formation") String formation){
        List<PersonneDto> personneDtoList  = servicePersonne.rechercheParIntituleFormation(formation);
        return new ResponseEntity<>(personneDtoList.toString(),HttpStatus.OK);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/collaborateur/{id}")
    public ResponseEntity<CollaborateurDto> modiferCollaborateur(@PathVariable("id")int id, @RequestBody CollaborateurDto collaborateurDto){
        CollaborateurDto collaborateurDtoReturn;
        collaborateurDtoReturn = servicePersonne.modifierCollaborateur(id, collaborateurDto);
        return new ResponseEntity<>(collaborateurDtoReturn, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/contact/{id}")
    public ResponseEntity<ContactDto> modiferContact(@PathVariable("id")int id, @RequestBody ContactDto contactDto){
        ContactDto contactDtoReturn;
        contactDtoReturn = servicePersonne.modifierContact(id, contactDto);
        return new ResponseEntity<>(contactDtoReturn, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/collaborateur/{id}")
    public ResponseEntity<String> supprimerCollaborateur(@PathVariable("id")int id ){
        servicePersonne.deleteCollaborateur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/contact/{id}")
    public ResponseEntity<String> supprimerContact(@PathVariable("id")int id ){
        servicePersonne.deleteContact(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}

