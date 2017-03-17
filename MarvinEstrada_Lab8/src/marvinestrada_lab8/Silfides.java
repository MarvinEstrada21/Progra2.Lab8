package marvinestrada_lab8;

import javax.swing.JOptionPane;

public class Silfides extends Hadas{
    private int Alas;

    public Silfides(String nombre, double altura, int edad, int salud, int poder, int Alas) {
        super(nombre, altura, edad, salud, poder);
        if (Alas >= 6) {
            this.Alas = Alas;
        } else {
            while (Alas < 6) {
                Alas = Integer.parseInt(JOptionPane.showInputDialog(
                        "La cantidad de alas no puedes ser menor a 6, ingrese el dato de nuevo"));
            }
        }
    }

    public int getAlas() {
        return Alas;
    }

    public void setAlas(int Alas) {
        if (Alas >= 6) {
            this.Alas = Alas;
        } else {
            while (Alas < 6) {
                Alas = Integer.parseInt(JOptionPane.showInputDialog(
                        "La cantidad de alas no puedes ser menor a 6, ingrese el dato de nuevo"));
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
