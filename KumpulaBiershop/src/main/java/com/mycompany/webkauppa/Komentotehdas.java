/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webkauppa;

import com.mycompany.webkauppa.ohjaus.OstoksenLisaysKoriin;
import com.mycompany.webkauppa.sovelluslogiikka.Ostoskori;

/**
 *
 * @author nargiza
 */
public class Komentotehdas implements Komento {
    OstoksenLisaysKoriin lisays;
//    Ostoskori haeSessionOstoskori; 
//    long tuoteId;
//    public Komentotehdas(){
//        lisays = new OstoksenLisaysKoriin(haeSessionOstoskori, tuoteId);
//    }

    @Override
    public Komentotehdas ostoksenLisaysKoriin(Ostoskori haeSessionOstoskori, long tuoteId) {
       this.lisays = new OstoksenLisaysKoriin(haeSessionOstoskori, tuoteId);
       return this;
    }

    @Override
    public void suorita() {
        this.lisays.suorita();
    }


}

