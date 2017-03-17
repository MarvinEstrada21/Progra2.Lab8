package marvinestrada_lab8;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Hadas implements Serializable{
    protected String nombre;
    protected double altura;
    protected int edad;
    protected int salud;
    protected int poder;
    private static final long SerialVersionUID = 1412L;

    public Hadas(String nombre, double altura, int edad, int salud, int poder) {
        this.nombre = nombre;
        if (altura < 15) {
            this.altura = altura;
        } else {
            while (altura >= 15) {
                altura = Double.parseDouble(JOptionPane.showInputDialog(
                        "La altura no puede ser mayor a 15, ingresela otra vez"));
            }
        }
        if (edad > 0) {
            this.edad = edad;
        } else {
            while (edad <= 0) {
                edad = Integer.parseInt(JOptionPane.showInputDialog(
                        "La edad no puede ser menor a 0, ingresela otra vez"));
            }
        }
        this.salud = salud;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 15) {
            this.altura = altura;
        } else {
            while (altura >= 15) {
                altura = Double.parseDouble(JOptionPane.showInputDialog(
                        "La altura no puede ser mayor a 15, ingresela otra vez"));
            }
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            while (edad <= 0) {
                edad = Integer.parseInt(JOptionPane.showInputDialog(
                        "La edad no puede ser menor a 0, ingresela otra vez"));
            }
        }
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
