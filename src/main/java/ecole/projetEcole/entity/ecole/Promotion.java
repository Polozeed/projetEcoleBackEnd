package ecole.projetEcole.entity.ecole;

import java.io.Serializable;

public class Promotion implements Serializable {

    private String intitule;

    public Promotion(String intitule) {
        this.intitule = intitule;
    }


    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "intitule='" + intitule + '\'' +
                '}';
    }
}
