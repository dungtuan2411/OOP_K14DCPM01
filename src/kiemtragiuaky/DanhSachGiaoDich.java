package kiemtragiuaky;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DanhSachGiaoDich {
    // attribute
    private List<GiaoDichNhaDat> listGiaoDich = new ArrayList<>();
    private int slgdDat;
    private int slgdNha;

    // getter setter
    public int getSlgdDat() {
        return slgdDat;
    }

    public int getSlgdNha() {
        return slgdNha;
    }

    // method
    // thêm
    public void add(GiaoDichNhaDat giaoDich) {
        listGiaoDich.add(giaoDich);
    }

    // in danh sách
    public void inDanhSach() {
        if (listGiaoDich.isEmpty()) {
            System.out.println("Danh sach rong!!");
            return;
        }
        for (GiaoDichNhaDat giaoDich : listGiaoDich) {
            System.out.println(giaoDich);
        }
    }

    // tổng số lượng từng loại
    public void tinhTongSLTungLoai() {
        if (listGiaoDich.isEmpty()) {
            System.out.println("Danh sach rong!!");
            return;
        }
        // reset lại về 0 trước khi đếm
        slgdDat = 0;
        slgdNha = 0;

        for (GiaoDichNhaDat giaoDich : listGiaoDich) {
            if (giaoDich instanceof GiaoDichDat)
                this.slgdDat++;
            else
                this.slgdNha++;
        }
        System.out.println("Tong so luong giao dich dat: " + slgdDat);
        System.out.println("Tong so luong giao dich nha: " + slgdNha);
    }

    // trung bình thành tiền của đất
    public double tinhTongTBGDDat() {
        if (listGiaoDich.isEmpty()) {
            System.out.println("Danh sach rong!!");
            return 0.0;
        }
        double tienGDDat = 0.0;
        int dem = 0;
        for (GiaoDichNhaDat giaoDich : listGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                dem++;
                tienGDDat += giaoDich.thanhTien(); // tính tổng thành tiền
            } else
                continue;

        }
        return tienGDDat / dem; // tính trung bình
    }

    // xuất các giao dịch 9/2013
    public List<GiaoDichNhaDat> xuatGiaoDichTheoDate() {
        List<GiaoDichNhaDat> listGDByDate = new ArrayList<>();
        if (listGiaoDich.isEmpty()) {
            System.out.println("Danh sach rong!!");
            return null;
        }
        String date_1 = "1/9/2013";
        String date_2 = "30/9/2013";

        Date startDate;
        Date endDate;
        try {
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(date_1);
            endDate = new SimpleDateFormat("dd/MM/yyyy").parse(date_2);

            for (GiaoDichNhaDat giaoDichNhaDat : listGiaoDich) {
                /**
                 * so sánhgiaoDichNhaDat.getNgayGiaoDich() trong tháng 9/2013
                 * date >= startDate && date <= endDate
                 */
                if ((giaoDichNhaDat.getNgayGiaoDich().equals(startDate)
                        || giaoDichNhaDat.getNgayGiaoDich().after(startDate))
                        && (giaoDichNhaDat.getNgayGiaoDich().equals(endDate)
                                || giaoDichNhaDat.getNgayGiaoDich().before(endDate))) {
                    listGDByDate.add(giaoDichNhaDat);
                } else
                    continue;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return listGDByDate;
    }
}
