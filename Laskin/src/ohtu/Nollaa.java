/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import javax.swing.JTextField;

/**
 *
 * @author nargiza
 */
class Nollaa implements Komento {
    private Sovelluslogiikka sovellus;
    private  JTextField tuloskentta;
    private JTextField syotekentta;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
    this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
    }

    @Override
    public void suorita() {
        
        sovellus.nollaa();
        int laskunTulos = sovellus.tulos();
        tuloskentta.setText("" + laskunTulos);
    }

    @Override
    public void peru() {
        syotekentta.setText("");
        System.out.println("undo pressed");
    }
    
}
