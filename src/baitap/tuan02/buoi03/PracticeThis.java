package baitap.tuan02.buoi03;

public class PracticeThis {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // constructor
    public PracticeThis(int initialValue) {
        value = initialValue;
    }

    public PracticeThis() {
        // Gọi đến constructor 1 tham số int và set cứng argument là 0
        this(0);
    }

    public PracticeThis(PracticeThis other) {
        // Consturtor là có 1 tham số chính là tham chiếu đến đối tượng này
        // Vì vậy nó sẽ có thuộc tính value thuộc kiểu int
        // Gọi đến constructor 1 tham số int và set argument là value của tham chiếu
        this(other.value);
    }

    public boolean greaterThan(PracticeThis other) {
        // lấy ra value của chính object đó (this), sau đó so sánh với nhau để trả về
        // giá trị boolean
        return (this.value > other.value);
    }

    public boolean lessThan(PracticeThis other) {
        return (other.greaterThan(this));
    }

    public PracticeThis increment() {
        // hàm trả về 1 object (giá trị có kiểu dữ liệu tham chiếu PracticeThis)
        value++;
        return this;
    }
}
