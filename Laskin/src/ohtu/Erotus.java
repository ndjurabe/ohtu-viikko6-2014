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
class Erotus implements Komento {

    private Sovelluslogiikka sovellus;
    private JTextField tuloskentta;
    private JTextField syotekentta;

    public Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        this.syotekentta = syotekentta;
        this.tuloskentta = tuloskentta;
    }

    @Override
    public void suorita() {
        int arvo = Integer.parseInt(syotekentta.getText());
        int currentarvo = Integer.parseInt(tuloskentta.getText());
        sovellus.miinus(arvo);

        tuloskentta.setText("" + sovellus.tulos());
        sovellus.miinus(currentarvo);
        syotekentta.setText("");
    }

    @Override
    public void peru() {
        syotekentta.setText("");
        System.out.println("undo pressed");
    }
}
