package ecole.projetEcole.dto.ecole;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;


public class FormationDto implements Serializable {


    private String intitule;
    private int dureeEtude;
    private Dipome diplome;
    private List<Promotion> promotionList;

    public FormationDto(){

    }

    public FormationDto(String intitule, int anneeEtude, Dipome diplome, List<Promotion> promotionList) {
        this.intitule = intitule;
        this.dureeEtude = anneeEtude;
        this.diplome = diplome;
        this.promotionList = promotionList;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getDureeEtude() {
        return dureeEtude;
    }

    public void setDureeEtude(int dureeEtude) {
        this.dureeEtude = dureeEtude;
    }

    public Dipome getDiplome() {
        return diplome;
    }

    public void setDiplome(Dipome diplome) {
        this.diplome = diplome;
    }

    public List<Promotion> getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List<Promotion> promotionList) {
        this.promotionList = promotionList;
    }

    @Override
    public String toString() {
        return "FormationDto{" +
                "intitule='" + intitule + '\'' +
                ", dureeEtude=" + dureeEtude +
                ", diplome=" + diplome +
                ", promotionList=" + promotionList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormationDto that = (FormationDto) o;
        return dureeEtude == that.dureeEtude &&
                Objects.equals(intitule, that.intitule) &&
                Objects.equals(diplome, that.diplome) &&
                Objects.equals(promotionList, that.promotionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intitule, dureeEtude, diplome, promotionList);
    }
}
