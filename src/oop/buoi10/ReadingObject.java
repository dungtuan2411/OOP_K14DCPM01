package oop.buoi10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import oop.buoi08.HangThucPham;

public class ReadingObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream inFile = new FileInputStream("data.dat");
        /**
         * 2. Tạo đối tượng ObjectInputStream. Constructor của nó nhận vào
         * FileInputStream. chuyển dạng nhị phân sang đối tượng
         */
        ObjectInputStream objIn = new ObjectInputStream(inFile);
        /**
         * 3. dùng đối tượng ObjectInputStream đọc từ stream sang đối tượng,
         * sau đó gán nó vào 1 biến tham chiếu có kiểu là cha lớn nhất Obect
         * Trong trường hợp này readObject() trả về 1 đối tượng có kiểu
         * HangThucPham
         */
        // 4. Ép kiểu từ Object sang một kiểu nào đó
        HangThucPham htp = (HangThucPham) objIn.readObject();
        HangThucPham htp2 = (HangThucPham) objIn.readObject();

        System.out.println(htp);
        System.out.println(htp2);
        // 5. Đóng stream ObjectInputStream
        objIn.close();
    }
}
