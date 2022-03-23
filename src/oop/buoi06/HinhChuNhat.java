package oop.buoi06;

public class HinhChuNhat {
    // attributes
    private float chieuDai;
    private float chieuRong;

    // getter setter
    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    // method
    public float tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }

    public float tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    @Override
    public String toString() {
        String str = "Chieu dai: " + this.chieuDai + " chieu rong: " + this.chieuRong;

        str += " chu vi: " + this.tinhChuVi()
                + " dien tich: " + this.tinhDienTich();
        return str;
    }
}
