package oop.buoi10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oop.buoi08.HangThucPham;

public class WritingListObject {
    public static void main(String[] args) throws IOException {
        // Ghi đối tượng vào file - mỗi lần ghi sẽ xóa cũ đổi mới
        // 1. Tạo đối tượng FileOutputStream và chỉ định file để ghi dữ liệu
        FileOutputStream outFile = new FileOutputStream("data.dat");
        // 2. Tạo đối tượng ObjectOutputStream. Constructor của nó nhận vào
        // FileOutputStream
        ObjectOutputStream objOut = new ObjectOutputStream(outFile);
        // 3. Đọc các đối tượng. VD: Hang Thuc Pham
        HangThucPham htp = new HangThucPham("HTP01", "Mi Hao Hao", 3_500, new Date(),
                new Date());

        HangThucPham htp2 = new HangThucPham("HTP02", "Mayonaise", 6_900, new Date(),
                new Date());


        List<HangThucPham> list = new ArrayList<>();
        list.add(htp);
        list.add(htp2);

        // phương thức writeObject để ghi đối tượng
        // objOut.writeObject(htp);
        // objOut.writeObject(htp2);

        // ghi danh sách object
        objOut.writeObject(list);

        // System.out.println(htp);

        // 4. Close objOut
        objOut.close();
    }
}
