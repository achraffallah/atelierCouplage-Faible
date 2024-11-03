package org.g22.metier;

import org.g22.dao.Etudiant;
import org.g22.dao.EtudiantDAO;
import org.g22.dao.IEtudiantDAO;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EtudiantManager implements IEtudiantManager{
    IEtudiantDAO etudiantDAO;
    //on doit changer ici

    public Set<String> emails;

    public EtudiantManager (IEtudiantDAO etudiantDAO) {
        //on doit changer ici

        this.etudiantDAO = etudiantDAO;
        this.emails = new HashSet<> ();
        for (Etudiant e : etudiantDAO.getAllEtudiants()) {
            emails.add(e.getEmail());
        }
    }

    public Etudiant addEtudiant( Etudiant etudiant){

            if (emails.contains ( etudiant.getEmail () ) )
                return etudiant ;
        //on doit changer ici

        return  etudiantDAO.addEtudiant ( etudiant );
    }
    //on doit changer ici

    public List<Etudiant> getAllEtudiants(){
        return etudiantDAO.getAllEtudiants ();
    }

    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantDAO.updateEtudiant ( etudiant );
    }

}
