package ecole.projetEcole.mapper;

import ecole.projetEcole.entity.AdresseEntity;
import ecole.projetEcole.dto.AdresseDto;

public class AdresseMapper {


    public static AdresseEntity dtoToDao(AdresseDto adresseDto) {
        AdresseEntity adresseDao = new AdresseEntity();

        adresseDao.setNomVille(adresseDto.getNomVille());
        adresseDao.setCodePostal(adresseDto.getCodePostal());
        adresseDao.setDepartement(adresseDto.getDepartement());
        adresseDao.setGps(adresseDto.getGps());
        adresseDao.setNomRue(adresseDto.getNomRue());
        adresseDao.setNumRue(adresseDto.getNumRue());
        adresseDao.setPays(adresseDto.getPays());

        return adresseDao;
    }

    public static AdresseDto daoToDto(AdresseEntity adresseEntity) {
        AdresseDto adresseDto = new AdresseDto();

        adresseDto.setNomVille(adresseEntity.getNomVille());
        adresseDto.setCodePostal(adresseEntity.getCodePostal());
        adresseDto.setDepartement(adresseEntity.getDepartement());
        adresseDto.setGps(adresseEntity.getGps());
        adresseDto.setNomRue(adresseEntity.getNomRue());
        adresseDto.setNumRue(adresseEntity.getNumRue());
        adresseDto.setPays(adresseEntity.getPays());


        return adresseDto;
    }
}

