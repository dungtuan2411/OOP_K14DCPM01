package oop.buoi04;

public class Book {
    public static void main(String[] args) {
        // tạo 2 biến tham chiếu đối tượng Book
        // 2 đối tượng Book sẽ tồn tại trong HEAP
        Book b = new Book(); // 1
        Book c = new Book(); // 2

        // Tạo reference d và gán giá trị (chuỗi bit) của c cho d
        // Lúc này cả 2 biến c và d đều cùng chiếu đến Book 2
        Book d = c;

        // Gán lại giá trị của d cho b.
        // Lúc này cả b, c và d đều cùng chiếu đến Book 2
        // Có 3 reference, 1 object được điều khiển, 1 object bị bỏ rơi
        // Book 1 không còn ai chiếu tới => GC thu hồi vùng nhớ
        b = d;

        c = null; // remote c được gán cho giá trị null
        // null chỉ gán được cho biến reference, không gán được biến primitive
        // biến tham chiếu c không thể tham chiếu đến đối tượng nào nữa
        // nhưng c vẫn còn là 1 biến reference và vẫn có thể gán 1 object Book khác cho
        // nó
        // 1 đối tượng chỉ bị thu hồi khi không còn reference nào chiếu tới nó
        System.out.println(b);
    }
}
