/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webkauppa;

import com.mycompany.webkauppa.sovelluslogiikka.Ostoskori;

/**
 *
 * @author nargiza
 */
public interface Komento {
    Komento ostoksenLisaysKoriin(Ostoskori haeSessionOstoskori, long tuoteId) ;
   
   void suorita();
}
