package org.xproce.tp1.presentation;

import org.xproce.tp1.dao.EtudiantDAODictionary;
import org.xproce.tp1.dao.etudiant;
import org.xproce.tp1.dao.etudiantdao;
import org.xproce.tp1.metier.EtudiantManager;

import java.util.List;
import java.util.Map;

public class Presentation {
    public static void main(String[] args) {

        EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();


        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);


        etudiantManager.addEtudiant(new etudiant("1", "Nom1", "Prenom1", "email1@ke.com"));
        etudiantManager.addEtudiant(new etudiant("2", "Nom2", "Prenom2", "email2@jb.com"));
        etudiantManager.addEtudiant(new etudiant("3", "Nom3", "Prenom3", "email3@g.com"));
        etudiantManager.addEtudiant(new etudiant("4", "Nom4", "Prenom4", "email4@ijjm.com"));


        Map<String, etudiant> etudiants = etudiantManager.getAllEtudiants();


        System.out.println("Liste etudiants :");
        for (etudiant etudiant : etudiants.values()) {
            System.out.println("ID: " + etudiant.getId() + ", Nom: " + etudiant.getNom() + ", Prenom: " + etudiant.getPrenom() + ", Email: " + etudiant.getEmail());
        }
    }
}
