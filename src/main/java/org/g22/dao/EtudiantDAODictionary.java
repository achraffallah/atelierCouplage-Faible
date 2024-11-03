package org.g22.dao;

import com.sun.nio.sctp.AbstractNotificationHandler;

import java.io.StringReader;
import java.rmi.StubNotFoundException;
import java.util.*;

public class EtudiantDAODictionary implements IEtudiantDAO {
    Map<Long,Etudiant> etudiantMap;

    public EtudiantDAODictionary (  ) {
        this.etudiantMap = new HashMap<> ();
    }
    public Etudiant addEtudiant ( Etudiant etudiant)
    {
        etudiantMap.put ( etudiant.getId (),etudiant );
        return etudiant;
    }
    public List<Etudiant> getAllEtudiants(){

        return new ArrayList<>(etudiantMap.values());

    }

    @Override
    public Etudiant updateEtudiant ( Etudiant etudiant ) {

        if ( etudiantMap.containsKey ( etudiant.getId () ))
        {
                etudiantMap.put ( etudiant.getId (),etudiant );
            return etudiant;
        }
        return null;

    }
}
