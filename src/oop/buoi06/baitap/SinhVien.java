package oop.buoi06.baitap;

public class SinhVien {
    // attribute
    private int maSV;
    private String hoTen;
    private float diemLT, diemTH;

    // constructor
    SinhVien() {
    }

    SinhVien(int maSV, String hoTen, float diemLT, float diemTH) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    // getter setter
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float getDiemTH() {
        return diemTH;
    }

    private float tinhDiemTB() {
        return (this.diemLT + this.diemTH) / 2;
    }

    @Override
    public String toString() {
        return String.format("%8d %30s %15.2f %20.2f %20.2f%n",
                this.maSV, this.hoTen, this.diemLT, this.diemTH,
                this.tinhDiemTB());
    }
}
