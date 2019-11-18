package ecole.projetEcole.dto.ecole;

import java.io.Serializable;
import java.util.List;

public class Formation implements Serializable {


    private String intitule;
    private int anneeEtude;
    private Dipome diplome;
    private List<Promotion> promotionList;

    public Formation(String intitule, int anneeEtude, Dipome diplome, List<Promotion> promotionList) {
        this.intitule = intitule;
        this.anneeEtude = anneeEtude;
        this.diplome = diplome;
        this.promotionList = promotionList;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getAnneeEtude() {
        return anneeEtude;
    }

    public void setAnneeEtude(int anneeEtude) {
        this.anneeEtude = anneeEtude;
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
        return "Formation{" +
                "intitule='" + intitule + '\'' +
                ", anneeEtude=" + anneeEtude +
                ", diplome=" + diplome +
                ", promotionList=" + promotionList +
                '}';
    }
}
