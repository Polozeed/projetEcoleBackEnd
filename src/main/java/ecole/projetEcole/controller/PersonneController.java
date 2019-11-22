package ecole.projetEcole.controller;

import ecole.projetEcole.dto.personne.CollaborateurDto;
import ecole.projetEcole.dto.personne.ContactDto;
import ecole.projetEcole.dto.personne.PersonneDto;
import ecole.projetEcole.service.ServicePersonne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PersonneController {

    @Autowired
    ServicePersonne servicePersonne;

    //--------------------------// Personne Controller //-------------------------------------
    @PostMapping("/personne")
    public ResponseEntity<String> postPersonne(@RequestBody PersonneDto personneDto) {

        PersonneDto personneDtoReturn = servicePersonne.addPersonne(personneDto);
        if (personneDto.equals(personneDtoReturn)) {
            return new ResponseEntity<>("Insertion OK : " + personneDto.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
        }

    }

    //--------------------------// Contact Controller //-------------------------------------
    @PostMapping("/contact")
    public ResponseEntity<String> postContact(@RequestBody ContactDto contactDto) {

        ContactDto contactDtoReturn = servicePersonne.addContact(contactDto);
        if (contactDto.equals(contactDtoReturn)) {
            return new ResponseEntity<>("Insertion OK : " + contactDto.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
        }

    }

    //--------------------------// Collaborateur Controller //-------------------------------------
    @PostMapping("/collaborateur")
    public ResponseEntity<String> postCollaborateur(@RequestBody CollaborateurDto collaborateurDto) {

        CollaborateurDto collaborateurDtoReturn = servicePersonne.addCollaborateur(collaborateurDto);
        if (collaborateurDto.equals(collaborateurDtoReturn)) {
            return new ResponseEntity<>("Insertion OK : " + collaborateurDto.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
        }

    }
}

