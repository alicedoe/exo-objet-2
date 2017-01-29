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

        System.out.println(racine.nom);
        System.out.println(listeArbo(racine, 0));

    }

    public static String afficheNom () { System.out.println(this.nom) }

    public static String listeArbo(Repertoire nomrep, int i) {
        
        i++;
        for (Repertoire r : nomrep.repertoires) {

            for (int j = 0; j <= i; j++) {
                System.out.print("\t");
            }
            System.out.println(r.nom);
            listeArbo(r, i);
        }

        return "Fin";

    }
}
