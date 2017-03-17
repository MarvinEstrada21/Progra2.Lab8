package marvinestrada_lab8;

import javax.swing.JOptionPane;

public class Lamias extends Hadas{
    private double Aleta;
    private int Branquias;

    public Lamias(String nombre, double altura, int edad, int salud, int poder, double Aleta, int Branquias) {
        super(nombre, altura, edad, salud, poder);
        if (Aleta > 0 && Aleta <= 5) {
            this.Aleta = Aleta;
        } else {
            while (Aleta <= 0 && Aleta > 5) {
                Aleta = Double.parseDouble(JOptionPane.showInputDialog(
                        "El tamaño no puede ser menor a 0 o mayor a 5, ingreselo otra vez"));
            }
        }
        if (Branquias > 0 && Branquias <= 8) {
            this.Branquias = Branquias;
        } else {
            while (Branquias <= 0 && Branquias > 8) {
                Branquias = Integer.parseInt(JOptionPane.showInputDialog(
                        "La cantidad de branquias no puede ser menor a 0 o mayor a 8, ingreselo otra vez"));
            }
        }
    }

    public double getAleta() {
        return Aleta;
    }

    public void setAleta(double Aleta) {
        if (Aleta > 0 && Aleta <= 5) {
            this.Aleta = Aleta;
        } else {
            while (Aleta <= 0 && Aleta > 5) {
                Aleta = Double.parseDouble(JOptionPane.showInputDialog(
                        "El tamaño no puede ser menor a 0 o mayor a 5, ingreselo otra vez"));
            }
        }
    }

    public int getBranquias() {
        return Branquias;
    }

    public void setBranquias(int Branquias) { 
        if (Branquias > 0 && Branquias <= 8) {
            this.Branquias = Branquias;
        } else {
            while (Branquias <= 0 && Branquias > 8) {
                Branquias = Integer.parseInt(JOptionPane.showInputDialog(
                        "La cantidad de branquias no puede ser menor a 0 o mayor a 8, ingreselo otra vez"));
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
