package ecole.projetEcole.service;

import ecole.projetEcole.dto.Adresse;
import ecole.projetEcole.dto.ecole.Dipome;
import ecole.projetEcole.dto.ecole.Ecole;
import ecole.projetEcole.dto.ecole.Formation;
import ecole.projetEcole.dto.ecole.Promotion;
import ecole.projetEcole.dto.personne.Contact;

import java.util.ArrayList;
import java.util.List;

public class ServiceEcoleTest {

    public ServiceEcoleTest() {
        Adresse eseoAdresse = new Adresse("Test rue", 10, "Angers",
                "49000", "pays de loire", "france", "test gps");
        Contact dirctEseo = new Contact("Mr Directeur", "alain", "directeur",
                "maildirecteur@gmail.com", "05040708", "15/05/1975", "commentaire");
        Contact respEntESEO = new Contact("Mr Resp Event", "Franck", "Resp Event",
                "mailrespEvent@gmail.com", "050809060", "14/02/1985", "commentaire");
        Dipome ingenieur = new Dipome("Ingenieur Generaliste", "Ingenieur commentaire");


        Promotion A1 = new Promotion("Apprentissage 1er année Eseo");
        Promotion A2 = new Promotion("Apprentissage 2eme année Eseo");
        List<Promotion> promoEseo = new ArrayList<>();
        promoEseo.add(A1);
        promoEseo.add(A2);


        Formation apprentissage = new Formation("apprentissage", 3, ingenieur, promoEseo);
        Formation initial = new Formation("initiale", 5, ingenieur, promoEseo);
        List<Formation> formationListEseo = new ArrayList<>();
        formationListEseo.add(apprentissage);
        formationListEseo.add(initial);


        Ecole eseo = new Ecole("eseo", 1456, eseoAdresse,
                dirctEseo, respEntESEO, "electronique Informatique", formationListEseo);


        System.out.println(eseo);
    }

    public static String returnTexteEssai(){
        return "apelle fct service Test ";
    }

}
