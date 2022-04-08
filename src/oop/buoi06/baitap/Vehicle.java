package oop.buoi06.baitap;

public class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    // constructor
    Vehicle() {
    }

    Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
        this.setTenChuXe(tenChuXe);
        this.setLoaiXe(loaiXe);
        this.setDungTich(dungTich);
        this.setTriGia(triGia);
    }

    // getter setter
    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double getTriGia() {
        return triGia;
    }

    private double tinhThuePhaiNop() {
        if (this.dungTich < 100) {
            return this.triGia * 1 / 100;
        } else if (this.dungTich >= 100 && this.dungTich <= 200) {
            return this.triGia * 3 / 100;
        } else {
            return this.triGia * 5 / 100;
        }
    }

    @Override
    public String toString() {
        return String.format("%-20s %15s %15d %20.2f %20.2f",
                this.getTenChuXe(),
                this.getLoaiXe(),
                this.getDungTich(),
                this.getTriGia(),
                this.tinhThuePhaiNop());
    }
}
