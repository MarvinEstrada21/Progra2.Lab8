package marvinestrada_lab8;

import javax.swing.JProgressBar;

public class adminPelea extends Thread{
    private JProgressBar laif1;
    private JProgressBar laif2;
    private Hadas hada1;
    private Hadas hada2;
    private boolean vive;
    private boolean runs;

    public adminPelea(JProgressBar laif1, JProgressBar laif2, Hadas hada1, Hadas hada2) {
        this.laif1 = laif1;
        this.laif2 = laif2;
        this.hada1 = hada1;
        this.hada2 = hada2;
        vive = true;
        runs = true;
    }

    public JProgressBar getLaif1() {
        return laif1;
    }

    public void setLaif1(JProgressBar laif1) {
        this.laif1 = laif1;
    }

    public JProgressBar getLaif2() {
        return laif2;
    }

    public void setLaif2(JProgressBar laif2) {
        this.laif2 = laif2;
    }

    public Hadas getHada1() {
        return hada1;
    }

    public void setHada1(Hadas hada1) {
        this.hada1 = hada1;
    }

    public Hadas getHada2() {
        return hada2;
    }

    public void setHada2(Hadas hada2) {
        this.hada2 = hada2;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isRuns() {
        return runs;
    }

    public void setRuns(boolean runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        return "adminPelea{" + "laif1=" + laif1 + ", laif2=" + laif2 + ", hada1=" + hada1 + ", hada2=" + hada2 + ", vive=" + vive + ", runs=" + runs + '}';
    }

    @Override
    public void run() {
        while (vive) {
            if (runs) {
                if (hada1 instanceof Salamandras && ((hada2 instanceof Hamadriades))) {
                    hada2.setSalud((int) (hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.37))));
                } else if (((hada1 instanceof Lamias) || (hada1 instanceof Silfides)) && (hada2 instanceof Hamadriades)) {
                    if (hada1 instanceof Lamias) {
                        hada2.setSalud((int) (hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.42))));
                    }
                    if (hada1 instanceof Silfides) {
                        hada2.setSalud((int) (hada2.getSalud() - (hada1.getPoder() + (hada1.getPoder() * 0.37))));
                    }
                } else {
                    hada2.setSalud(hada2.getSalud() - (hada1.getPoder()));
                }
                if (hada2 instanceof Salamandras && ((hada1 instanceof Hamadriades))) {
                    hada1.setSalud((int) (hada1.getSalud() - (hada1.getPoder() + (hada2.getPoder() * 0.37))));
                } else if (((hada2 instanceof Lamias) || (hada2 instanceof Silfides)) && (hada1 instanceof Hamadriades)) {
                    if (hada2 instanceof Lamias) {
                        hada1.setSalud((int) (hada1.getSalud() - (hada2.getPoder() + (hada2.getPoder() * 0.42))));
                    }
                    if (hada2 instanceof Silfides) {
                        hada1.setSalud((int) (hada1.getSalud() - (hada2.getPoder() + (hada2.getPoder() * 0.37))));
                    }
                } else {
                    hada1.setSalud(hada1.getSalud() - (hada2.getPoder()));
                }
            }
        }
    }
}
