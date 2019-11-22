package ecole.projetEcole.mapper;

import ecole.projetEcole.dto.event.EvenementDto;
import ecole.projetEcole.entity.EvenementEntity;
import org.modelmapper.ModelMapper;

public class EvenementMapper {


    public static EvenementDto convertToDto(EvenementEntity evenementEntity) {
        ModelMapper modelMapper = new ModelMapper();
        EvenementDto evenementDto =  modelMapper.map(evenementEntity, EvenementDto.class);

        return evenementDto;
    }

    public static EvenementEntity convertToEntity(EvenementDto evenementDto) {
        ModelMapper modelMapper = new ModelMapper();
        EvenementEntity evenementEntity =  modelMapper.map(evenementDto, EvenementEntity.class);

        return evenementEntity;
    }
}
