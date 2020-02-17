package ecole.projetEcole.dto.event;

import ecole.projetEcole.dto.ecole.EcoleDto;
import ecole.projetEcole.dto.ecole.FormationDto;
import lombok.Data;

import java.io.Serializable;


@Data
public class EventEcoleDto extends EvenementDto implements Serializable {

    private EcoleDto ecole;
    private FormationDto formation;
}
