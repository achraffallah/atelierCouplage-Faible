package org.g22.metier;

import org.g22.dao.Etudiant;

import java.util.List;

public interface IEtudiantManager {
    public Etudiant addEtudiant( Etudiant etudiant);
    public List<Etudiant> getAllEtudiants();
    public Etudiant updateEtudiant(Etudiant etudiant);
}
