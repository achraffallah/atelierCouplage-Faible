package org.g22.dao;

import java.util.List;

public interface IEtudiantDAO {

    public Etudiant addEtudiant(Etudiant etudiant);
    public List<Etudiant>  getAllEtudiants();
    Etudiant updateEtudiant(Etudiant etudiant);


}
