package org.xproce.tp1.dao;

import java.util.HashMap;
import java.util.Map;

public class EtudiantDAODictionary {
    private Map<String, etudiant> etudiantsMap;

    public EtudiantDAODictionary() {
        etudiantsMap = new HashMap<>();
    }

    public etudiant addEtudiant(etudiant etudiant) {
        etudiantsMap.put(String.valueOf(etudiant.getId()), etudiant);
        return etudiant;
    }

    public Map<String, etudiant> getAllEtudiants() {
        return etudiantsMap;
    }
}
