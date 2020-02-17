package ecole.projetEcole.mapper;

import ecole.projetEcole.dto.AdresseDto;
import ecole.projetEcole.entity.AdresseEntity;
import org.modelmapper.ModelMapper;

public class AdresseMapper {

    public static AdresseDto convertToDto(AdresseEntity adresseEntity) {
        ModelMapper modelMapper = new ModelMapper();
        AdresseDto adresseDto =  modelMapper.map(adresseEntity, AdresseDto.class);
        return adresseDto;
    }

    public static AdresseEntity convertToEntity(AdresseDto adresseDto) {
        ModelMapper modelMapper = new ModelMapper();
        AdresseEntity adresseEntity =  modelMapper.map(adresseDto, AdresseEntity.class);
        return adresseEntity;
    }
}

