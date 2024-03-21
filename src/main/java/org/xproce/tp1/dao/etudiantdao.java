package org.xproce.tp1.dao;

import java.util.ArrayList;
import java.util.List;

public class etudiantdao {
    private List<etudiant> etudiants;


    public etudiantdao() {
        etudiants = new ArrayList<>();
    }


    public etudiant addEtudiant(etudiant etudiant) {
        etudiants.add(etudiant);
        return etudiant;
    }


    public List<etudiant> getAllEtudiants() {
        return etudiants;
    }
}
