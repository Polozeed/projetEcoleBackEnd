package ecole.projetEcole.controller;

import ecole.projetEcole.dto.ecole.PromotionDto;
import ecole.projetEcole.service.ServicePromotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PromotionController {

    @Autowired
    ServicePromotion servicePromotion;

    @PostMapping("/promotion")
    public ResponseEntity<String> postPromotion(@RequestBody PromotionDto promotionDto) {

        PromotionDto promotionDtoReturn = servicePromotion.addPromotion(promotionDto);
        if (promotionDto.equals(promotionDtoReturn)) {
            return new ResponseEntity<>("Insertion OK : " + promotionDto.toString(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Erreur", HttpStatus.CONFLICT);
        }

    }
}
