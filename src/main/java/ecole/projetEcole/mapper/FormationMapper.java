package ecole.projetEcole.mapper;

import ecole.projetEcole.dto.ecole.DiplomeDto;
import ecole.projetEcole.dto.ecole.FormationDto;
import ecole.projetEcole.entity.DiplomeEntity;
import ecole.projetEcole.entity.FormationEntity;
import org.modelmapper.ModelMapper;

public class FormationMapper {

    public static FormationDto convertToDto(FormationEntity formationEntity) {
        ModelMapper modelMapper = new ModelMapper();
        FormationDto formationDto =  modelMapper.map(formationEntity, FormationDto.class);
        return formationDto;
    }

    public static FormationEntity convertToEntity(FormationDto formationdto) {
        ModelMapper modelMapper = new ModelMapper();
        FormationEntity formationEntity =  modelMapper.map(formationdto, FormationEntity.class);
        return formationEntity;
    }

    public static DiplomeDto convertToDiplomeDto(DiplomeEntity diplomeEntity) {
        ModelMapper modelMapper = new ModelMapper();
        DiplomeDto diplomeDto =  modelMapper.map(diplomeEntity, DiplomeDto.class);
        return diplomeDto;
    }

    public static DiplomeEntity convertToDiplomeEntity(DiplomeDto diplomeDto) {
        ModelMapper modelMapper = new ModelMapper();
        DiplomeEntity diplomeEntity =  modelMapper.map(diplomeDto, DiplomeEntity.class);
        return diplomeEntity;
    }
}
