package ecole.projetEcole.entity.event;

import ecole.projetEcole.entity.AdresseDto;

import java.io.Serializable;

public class Evenement implements Serializable {



    private String intitule;
    private AdresseDto lieu;
    private String horaireDebut;
    private String horaireFin;
    private String description;

    public Evenement(String intitule, AdresseDto lieu, String horaireDebut, String horaireFin, String description) {
        this.intitule = intitule;
        this.lieu = lieu;
        this.horaireDebut = horaireDebut;
        this.horaireFin = horaireFin;
        this.description = description;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public AdresseDto getLieu() {
        return lieu;
    }

    public void setLieu(AdresseDto lieu) {
        this.lieu = lieu;
    }

    public String getHoraireDebut() {
        return horaireDebut;
    }

    public void setHoraireDebut(String horaireDebut) {
        this.horaireDebut = horaireDebut;
    }

    public String getHoraireFin() {
        return horaireFin;
    }

    public void setHoraireFin(String horaireFin) {
        this.horaireFin = horaireFin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "intitule='" + intitule + '\'' +
                ", lieu=" + lieu +
                ", horaireDebut='" + horaireDebut + '\'' +
                ", horaireFin='" + horaireFin + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
