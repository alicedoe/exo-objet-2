/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo.objet.pkg2;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Ali
 */
public class ExoObjet2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Repertoire d = new Repertoire();
//        d.nom = "d";
//        Repertoire multimedia = new Repertoire();
//        multimedia.nom = "multimedia";
//        Repertoire documents = new Repertoire();
//        documents.nom = "documents";
//
//        d.listerepertoire.add(multimedia);
//        d.listerepertoire.add(documents);
//
//        System.out.println(d.nom);
//        for (Repertoire repertoire : d.listerepertoire) {
//            System.out.println("\t" + repertoire.nom);
//        }

        Repertoire racine = new Repertoire();
        racine.nom = "D:";
        Repertoire multi = new Repertoire();
        multi.nom = "multimedia";
        Repertoire docu = new Repertoire();
        docu.nom = "document";
        Repertoire pdf = new Repertoire();
        pdf.nom = "pdf";
        Repertoire ebook = new Repertoire();
        ebook.nom = "ebook";
        Repertoire images = new Repertoire();
        images.nom = "images";
        Repertoire videos = new Repertoire();
        videos.nom = "videos";
        Repertoire downloads = new Repertoire();
        downloads.nom = "downloads";
        racine.repertoires.add(multi);
        racine.repertoires.add(docu);
        racine.repertoires.add(downloads);
        multi.repertoires.add(images);
        multi.repertoires.add(videos);
        docu.repertoires.add(pdf);
        pdf.repertoires.add(ebook);

        NbNiveau(racine, 0);
        
        System.out.println(racine.nom);
        System.out.println(afficheNom(racine));

//        System.out.println(racine.nom);
//        for (Repertoire r : racine.listerepertoire) {
//            System.out.println("\t" + r.nom);
//            for (Repertoire r1 : r.listerepertoire) {
//                System.out.println("\t\t" + r1.nom);
//                for (Repertoire r2 : r1.listerepertoire) {
//                System.out.println("\t\t\t" + r2.nom);
//            }
//            }
//        }
    }

    public static void NbNiveau(Repertoire nomrep, int i) {
        i++;

        for (Repertoire r : nomrep.repertoires) {

            r.niveau = i;

            NbNiveau(r, i);
        }

    }

    public static String afficheNom(Repertoire nomrep) {

        for (Repertoire r : nomrep.repertoires) {

            for (int j = 0; j <= r.niveau; j++) {
                System.out.print("\t");
            }
            System.out.println(r.nom);
            afficheNom(r);
        }

        return "Fin";

    }
}
