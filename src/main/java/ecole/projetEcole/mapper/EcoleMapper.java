package ecole.projetEcole.mapper;

import ecole.projetEcole.entity.EcoleEntity;
import ecole.projetEcole.dto.ecole.EcoleDto;

public class EcoleMapper {


    public static EcoleEntity dtoToDao(EcoleDto ecoleDto) {
        EcoleEntity ecoleDao = new EcoleEntity();

        ecoleDao.setNom(ecoleDto.getNom());
        ecoleDao.setNbEtudiants(ecoleDto.getNbEtudiants());
        ecoleDao.setAdresse(ecoleDto.getAdresse());
        ecoleDao.setSpecialite(ecoleDto.getSpecialite());


        return ecoleDao;
    }

    public static EcoleDto daoToDto(EcoleEntity ecoleDao) {
        EcoleDto ecoleDto = new EcoleDto();

        ecoleDto.setNom(ecoleDao.getNom());
        ecoleDto.setNbEtudiants(ecoleDao.getNbEtudiants());
        ecoleDto.setAdresse(ecoleDao.getAdresse());
        ecoleDto.setSpecialite(ecoleDao.getSpecialite());


        return ecoleDto;
    }

}
