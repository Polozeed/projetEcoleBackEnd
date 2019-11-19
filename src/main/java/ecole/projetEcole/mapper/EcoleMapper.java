package ecole.projetEcole.mapper;

import ecole.projetEcole.dao.Ecole;
import ecole.projetEcole.dto.ecole.EcoleDto;

public class EcoleMapper {


    public static Ecole dtoToDao( EcoleDto ecoleDto) {
        Ecole ecoleDao = new Ecole();

        ecoleDao.setNom(ecoleDto.getNom());
        ecoleDao.setNbEtudiants(ecoleDto.getNbEtudiants());
        ecoleDao.setAdresse(ecoleDto.getAdresse());


        return ecoleDao;
    }

    public static EcoleDto daoToDto(Ecole ecoleDao) {
        EcoleDto ecoleDto = new EcoleDto();

        ecoleDto.setNom(ecoleDao.getNom());
        ecoleDto.setNbEtudiants(ecoleDao.getNbEtudiants());
        ecoleDto.setAdresse(ecoleDao.getAdresse());


        return ecoleDto;
    }
}
