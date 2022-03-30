package baitap.tuan03.buoi06.bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPhamTestDrive {
    public static void main(String[] args) {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date ngaySX = ngayVietNam.parse("19/03/2022");
            Date ngayHetHan = ngayVietNam.parse("30/03/2022");

            HangThucPham hangThucPham = new HangThucPham("1234", "Hentai", 69000, ngaySX, ngayHetHan);

            if (hangThucPham.kiemTraHanSuDung())
                System.out.println("Het han");
            else
                System.out.println("Con han");

            System.out.println(hangThucPham);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
