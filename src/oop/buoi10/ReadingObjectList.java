package oop.buoi10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
// import java.util.List;

// import oop.buoi08.HangThucPham;

public class ReadingObjectList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inFile = new FileInputStream("data.dat");

        ObjectInputStream objIn = new ObjectInputStream(inFile);

        // List<HangThucPham> list = (List<HangThucPham>) objIn.readObject();

        // for (HangThucPham hangThucPham : list) {
        //     if (hangThucPham.getTenHang().trim().equalsIgnoreCase("Mayonaise")) {
        //         System.out.println(hangThucPham);
        //     }
        // }
        // 5. Đóng stream ObjectInputStream
        objIn.close();
    }
}
