package marvinestrada_lab8;

public class Hamadriades extends Hadas{
    private double salud_arbol;

    public Hamadriades(String nombre, double altura, int edad, int salud, int poder, double salud_arbol) {
        super(nombre, altura, edad, salud, poder);
    }

    public double getSalud_arbol() {
        return salud_arbol;
    }

    public void setSalud_arbol(double salud_arbol) {
        if (salud_arbol <= 0) {
            this.salud_arbol = 0;
        } else {
            this.salud_arbol = salud_arbol;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
