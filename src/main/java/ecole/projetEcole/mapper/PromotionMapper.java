package ecole.projetEcole.mapper;

import ecole.projetEcole.dto.ecole.PromotionDto;
import ecole.projetEcole.entity.PromotionEntity;
import org.modelmapper.ModelMapper;

public class PromotionMapper {

    public static PromotionDto convertToDto(PromotionEntity promotionEntity) {
        ModelMapper modelMapper = new ModelMapper();
        PromotionDto promotionDto=  modelMapper.map(promotionEntity, PromotionDto.class);
        return promotionDto;
    }

    public static PromotionEntity convertToEntity(PromotionDto promotionDto) {
        ModelMapper modelMapper = new ModelMapper();
        PromotionEntity promotionEntity=  modelMapper.map(promotionDto, PromotionEntity.class);
        return promotionEntity;
    }
}
