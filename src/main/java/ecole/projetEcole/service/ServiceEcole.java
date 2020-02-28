package ecole.projetEcole.service;

import ecole.projetEcole.dto.ecole.EcoleDto;
import ecole.projetEcole.entity.EcoleEntity;
import ecole.projetEcole.mapper.EcoleMapper;
import ecole.projetEcole.repository.AdresseRepository;
import ecole.projetEcole.repository.EcoleRepository;
import ecole.projetEcole.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceEcole {

    @Autowired
    EcoleRepository ecoleRepository;
    @Autowired
    AdresseRepository adresseRepository;
    @Autowired
    FormationRepository formationRepository;

    public EcoleDto addEcole(EcoleDto ecoleDto){
        EcoleEntity ecoleEntity = EcoleMapper.convertToEntity(ecoleDto);
        ecoleEntity = ecoleRepository.save(ecoleEntity);
        EcoleDto ecoleDtoReturn;
        ecoleDtoReturn = EcoleMapper.convertToDto(ecoleEntity);
        return ecoleDtoReturn;
    }

    public void deleteEcole(int id){
        ecoleRepository.deleteById(id);
    }

    public EcoleDto rechercheParId(int id){
        EcoleEntity ecoleEntity = ecoleRepository.findById(id).orElse(null);
        EcoleDto ecoleDtoReturn = EcoleMapper.convertToDto(ecoleEntity);
        return  ecoleDtoReturn;
    }

    public List<EcoleDto> rechercheParNom(String nom){
        List<EcoleEntity> ecoleEntityList = ecoleRepository.findByNom(nom);
        EcoleDto ecoleDtoReturn;
        List<EcoleDto> ecoleDtoReturnList = new ArrayList<>();
        for (EcoleEntity ecole: ecoleEntityList) {
            ecoleDtoReturn = EcoleMapper.convertToDto(ecole);
            ecoleDtoReturnList.add(ecoleDtoReturn);
        }
        return  ecoleDtoReturnList;
    }


    public List<EcoleDto> rechercherParAdresse(String recherche){
        List<EcoleEntity> ecoleEntityList;
        List<EcoleDto> ecoleDtoListReturn = new ArrayList<>();
        ecoleEntityList = ecoleRepository.findByAdresseEntity(recherche);
        while (ecoleEntityList.remove(null));
        for (EcoleEntity ecole: ecoleEntityList) {
            ecoleDtoListReturn.add(EcoleMapper.convertToDto(ecole));
        }
        return  ecoleDtoListReturn;
    }

    public List<EcoleDto> rechercherParFormation(String recherche) {
        List<EcoleEntity> ecoleEntityList;
        List<EcoleDto> ecoleDtoListReturn = new ArrayList<>();
        ecoleEntityList = ecoleRepository.findByFormationEntity(recherche);
        while (ecoleEntityList.remove(null));
        for (EcoleEntity ecole: ecoleEntityList) {
            ecoleDtoListReturn.add(EcoleMapper.convertToDto(ecole));
        }
        return  ecoleDtoListReturn;
    }


    public List<EcoleDto> rechercherParNvEtude(String etude) {
        List<EcoleEntity> ecoleEntityList;
        List<EcoleDto> ecoleDtoListReturn = new ArrayList<>();
        ecoleEntityList = ecoleRepository.findByNvEtude(etude);
        while (ecoleEntityList.remove(null));
        for (EcoleEntity ecole: ecoleEntityList) {
            ecoleDtoListReturn.add(EcoleMapper.convertToDto(ecole));
        }
        return  ecoleDtoListReturn;
    }

    public EcoleDto modifierEcole(int idEcole, EcoleDto ecoleDto){
        EcoleEntity ecoleEntity;
        ecoleEntity = EcoleMapper.convertToEntity(ecoleDto);
        ecoleEntity.setIdEcole(idEcole);
        ecoleRepository.save(ecoleEntity);
        return EcoleMapper.convertToDto(ecoleEntity);
    }

    public List<EcoleDto> listeEcole (){
        List<EcoleDto> ecoleDtoReturn = new ArrayList<>();
        List<EcoleEntity> ecoleEntityList = ecoleRepository.findAll();
        for (EcoleEntity ecoleEntity : ecoleEntityList) {
            ecoleDtoReturn.add(EcoleMapper.convertToDto(ecoleEntity));
        }
        return ecoleDtoReturn;
    }

    public List<EcoleDto> listEcolePourChargementParPage(int limit, int offset){
        List<EcoleDto> ecoleDtoListReturn = new ArrayList<>();
        List<EcoleEntity> ecoleEntityList =  ecoleRepository.findAllByPage(limit, offset);
        for (EcoleEntity ecole: ecoleEntityList) {
            ecoleDtoListReturn.add(EcoleMapper.convertToDto(ecole));
        }
        return  ecoleDtoListReturn;
    }

}
