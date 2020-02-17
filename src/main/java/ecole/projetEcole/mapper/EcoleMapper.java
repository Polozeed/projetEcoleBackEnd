package ecole.projetEcole.mapper;

import ecole.projetEcole.dto.ecole.EcoleDto;
import ecole.projetEcole.entity.EcoleEntity;
import org.modelmapper.ModelMapper;

public class EcoleMapper {

    public static EcoleDto convertToDto(EcoleEntity ecoleEntity) {
        ModelMapper modelMapper = new ModelMapper();
        EcoleDto ecoleDto =  modelMapper.map(ecoleEntity, EcoleDto.class);
        return ecoleDto;
    }

    public static EcoleEntity convertToEntity(EcoleDto ecoleDto) {
        ModelMapper modelMapper = new ModelMapper();
        EcoleEntity ecoleEntity =  modelMapper.map(ecoleDto, EcoleEntity.class);
        return ecoleEntity;
    }
}
