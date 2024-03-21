package org.xproce.tp1.metier;

import org.xproce.tp1.dao.EtudiantDAODictionary;
import org.xproce.tp1.dao.etudiant;

import java.util.Map;

public class EtudiantManager {
    private EtudiantDAODictionary etudiantDAO;

    public EtudiantManager(EtudiantDAODictionary etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public etudiant addEtudiant( etudiant etudiant) {

        Map<String,  etudiant> etudiantsMap = etudiantDAO.getAllEtudiants();
        for ( etudiant e : etudiantsMap.values()) {
            if (e.getEmail().equals(etudiant.getEmail())) {
                throw new IllegalArgumentException("L'email est deja utilisé par un autre etudiant.");
            }
        }


        return etudiantDAO.addEtudiant(etudiant);
    }

    public Map<String,  etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
}
