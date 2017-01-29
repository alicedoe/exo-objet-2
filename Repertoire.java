/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo.objet.pkg2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ali
 */
public class Repertoire {

    public ArrayList<Repertoire> repertoires;
    public String nom;

    public Repertoire() {
        repertoires = new ArrayList<Repertoire>();
        String nom;
        int niveau = 0;
    }

    
};
