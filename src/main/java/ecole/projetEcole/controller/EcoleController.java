package ecole.projetEcole.controller;

import ecole.projetEcole.dto.ecole.EcoleDto;
import ecole.projetEcole.repository.EcoleRepository;
import ecole.projetEcole.service.ServiceEcole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EcoleController {

    @Autowired
    ServiceEcole serviceEcole;
    @Autowired
    EcoleRepository ecoleRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/ecole")
    public ResponseEntity<EcoleDto> postEcole(@RequestBody EcoleDto ecole) {
        EcoleDto ecoleReturn = serviceEcole.addEcole(ecole);
            return new ResponseEntity<EcoleDto>( ecoleReturn, HttpStatus.OK);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("ecole/{id}")
    public ResponseEntity<EcoleDto> rechercheEcoleId(@PathVariable("id") int id){
        EcoleDto ecoleDto = serviceEcole.rechercheParId(id);
        return new ResponseEntity<EcoleDto>( ecoleDto, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("ecole/nom/{nom}")
    public ResponseEntity<List<EcoleDto>> rechercheEcoleNom(@PathVariable("nom") String nom){
        List<EcoleDto> ecoleDtoList = serviceEcole.rechercheParNom(nom);
        return new ResponseEntity<>( ecoleDtoList, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("ecole/adresse/{adresse}")
    public ResponseEntity<List<EcoleDto>> rechercheEcoleParAdresse(@PathVariable("adresse") String adresse){
        List<EcoleDto> ecoleDtoList;
        ecoleDtoList = serviceEcole.rechercherParAdresse(adresse);
        return new ResponseEntity<>( ecoleDtoList, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("ecole/formation/{formation}")
    public ResponseEntity<List<EcoleDto>> rechercheEcoleParFormation(@PathVariable("formation") String formation){
        List<EcoleDto> ecoleDtoList;
        ecoleDtoList = serviceEcole.rechercherParFormation(formation);
        return new ResponseEntity<>( ecoleDtoList, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("ecole/niveauEtude/{niveauEtude}")
    public ResponseEntity<List<EcoleDto>> rechercheEcoleParNvEtude(@PathVariable("niveauEtude") String etude){
        List<EcoleDto> ecoleDtoList;
        ecoleDtoList = serviceEcole.rechercherParNvEtude(etude);
        return new ResponseEntity<>( ecoleDtoList, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/ecole/{id}")
    public ResponseEntity<EcoleDto> modifierEcole(@PathVariable("id") int idEcole, @RequestBody EcoleDto ecoleDto){
        EcoleDto ecoleDtoReturn;
        ecoleDtoReturn = serviceEcole.modifierEcole(idEcole, ecoleDto);
        return new ResponseEntity<>(ecoleDtoReturn , HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/ecole/{id}")
    public ResponseEntity<String> deleteEcole(@PathVariable("id") int id){
        serviceEcole.deleteEcole(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/ecole")
    public ResponseEntity<List<EcoleDto>> listeEcoles(){
        List<EcoleDto> ecolesDtoList  = serviceEcole.listeEcole();
        return new ResponseEntity<>(ecolesDtoList,HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/nbEcoles")
    public ResponseEntity<Integer> nbEcoles(){
        int compt = 0;
        List<Integer> valeur  = ecoleRepository.findNbOccurenceEcole();
        for (Integer val: valeur ){
            compt = compt + 1;
        }
        return new ResponseEntity<>(compt,HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/ecolesPage/{limit}/{offset}")
    public ResponseEntity<List<EcoleDto>> listeEcolesParPage(@PathVariable("limit")int limit, @PathVariable("offset")int offset){
        List<EcoleDto> ecoleDtoList  = serviceEcole.listEcolePourChargementParPage(limit,offset);
        return new ResponseEntity<>(ecoleDtoList,HttpStatus.OK);
    }


}
