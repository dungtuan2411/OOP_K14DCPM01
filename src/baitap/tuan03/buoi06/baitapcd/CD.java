package baitap.tuan03.buoi06.baitapcd;

public class CD implements Comparable<CD> {
    // attributes
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private double giaThanh;

    // getter setter
    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }

    // constructor
    public CD() {
    }

    public CD(int maCD, String tuaCD, String caSy, int soBaiHat, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    // toString
    @Override
    public String toString() {
        return "CD [caSy=" + caSy + ", giaThanh=" + giaThanh + ", maCD=" + maCD + ", soBaiHat=" + soBaiHat + ", tuaCD="
                + tuaCD + "]";
    }

    @Override
    public int compareTo(CD o) {
        return this.tuaCD.compareTo(o.tuaCD);
    }

}
