package baitap.tuan02.buoi03;

public class PracticeThisTestDrive {
    public static void main(String[] args) {
        // gọi tham số mặc định
        PracticeThis myInteger = new PracticeThis();
        System.out.println(myInteger.getValue()); // 0

        myInteger.setValue(6); // sửa value là 6

        PracticeThis myInteger2 = new PracticeThis(myInteger);
        System.out.println(myInteger2.getValue()); // 6

        // myInteger2 hiện tại có value = 6
        // so sánh value của myInteger2 với myInteger3
        PracticeThis myInteger3 = new PracticeThis(8);

        boolean isGreaterThan = myInteger2.greaterThan(myInteger3);
        System.out.println(isGreaterThan);

        boolean isLessThan = myInteger2.lessThan(myInteger3);
        System.out.println(isLessThan);

        // tăng value của object lên 1
        // do trả về 1 tham chiếu đối tượng nên có thể gọi tiếp method
        myInteger2.increment().increment();
        System.out.println(myInteger2.getValue());
    }
}
