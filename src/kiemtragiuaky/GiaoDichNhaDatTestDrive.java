package kiemtragiuaky;

import java.text.ParseException;

public class GiaoDichNhaDatTestDrive {
    public static void main(String[] args) throws ParseException {
        GiaoDichNhaDat[] listGDND = new GiaoDichNhaDat[3];
        for (GiaoDichNhaDat giaoDichNhaDat : listGDND) {
            giaoDichNhaDat.nhap();
        }

        for (GiaoDichNhaDat giaoDichNhaDat : listGDND) {
            giaoDichNhaDat.toString();
        }

        double tongThanhTien = 0;
        for (GiaoDichNhaDat giaoDichNhaDat : listGDND) {
            tongThanhTien += giaoDichNhaDat.thanhTien();
        }
        System.out.println("Trung binh than tien: " + (tongThanhTien / listGDND.length));
    }
}
