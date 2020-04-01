package ecole.projetEcole.service;

import ecole.projetEcole.dto.ecole.PromotionDto;
import ecole.projetEcole.entity.PromotionEntity;
import ecole.projetEcole.mapper.PromotionMapper;
import ecole.projetEcole.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePromotion {

    @Autowired
    PromotionRepository promotionRepository;

    public PromotionDto addPromotion(PromotionDto promotionDto){
        PromotionEntity promotionEntity = PromotionMapper.convertToEntity(promotionDto);
        promotionEntity = promotionRepository.save(promotionEntity);
        PromotionDto promotionDtoReturn = PromotionMapper.convertToDto(promotionEntity);
        return promotionDtoReturn;
    }
}
