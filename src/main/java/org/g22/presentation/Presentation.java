package org.g22.presentation;

import org.g22.dao.Etudiant;
import org.g22.dao.EtudiantDAO;
import org.g22.dao.EtudiantDAODictionary;
import org.g22.metier.EtudiantManager;
import org.g22.metier.IEtudiantManager;

import java.util.List;

public class Presentation {
    public static void main ( String[] args ) {
        IEtudiantManager etudiantManager = new EtudiantManager (new EtudiantDAODictionary ());

        etudiantManager.addEtudiant ( new Etudiant ( 1L,"achraf","fellah","achraffellah@gmail.com"));
        etudiantManager.addEtudiant ( new Etudiant ( 2L,"hamid","sabiri","hamidsabiri@gmail.com"));
        etudiantManager.addEtudiant ( new Etudiant ( 3L,"achraf","ferhan","achraffellah@gmail.com"));
        etudiantManager.addEtudiant ( new Etudiant ( 4L,"together","forever","togetherforever@gmail.com"));
        //on doit changer ici

        List<Etudiant> etudiants = etudiantManager.getAllEtudiants ();
        for ( Etudiant e:
               etudiants) {
            System.out.println (e.getEmail () );

        }
        Etudiant operation = etudiantManager.updateEtudiant ( new Etudiant ( 2L,"nizar","sabiri","nizarsabiri@gmail.com" ) );
        if (operation != null)
        {
            System.out.println ("Upadate Done");

        }else {
            System.out.println ("update not succed" );
        }

        etudiants = etudiantManager.getAllEtudiants ();
        for ( Etudiant e:
                etudiants) {
            System.out.println (e.getEmail () );

        }

    }
}
