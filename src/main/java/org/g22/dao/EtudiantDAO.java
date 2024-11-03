package org.g22.dao;

import javax.security.auth.kerberos.KerberosTicket;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class EtudiantDAO implements IEtudiantDAO{
    private List<Etudiant> etudiants;

    public EtudiantDAO (  ) {
        this.etudiants = new ArrayList<> ();
    }

    public Etudiant addEtudiant ( Etudiant etudiant)
    {
        etudiants.add ( etudiant );
        return etudiant;
    }
    public List<Etudiant> getAllEtudiants(){
        return etudiants;
    }
    public Etudiant updateEtudiant(Etudiant etudiant) {

        return etudiant;
    }
}
