package baitap.tuan02.guessgame;

public class GuessGame {
    // state là các tham chiếu đến class Player
    // object của GuessGame sẽ giao tiếp với object của Player
    private Player p1;
    private Player p2;
    private Player p3;

    // method
    public void startGame() {
        // Tạo ra ba đấu thủ (player),
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        // 3 giá trị mà 3 player đoán
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        // lưu giá trị đúng sai của 3 player
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        // một số ngẫu nhiên để các đấu thủ cần đoán
        /**
         * Math.random() returns a pseudorandom double type number greater than or equal
         * to 0.0 and less than 1.0
         * khi nhân 10 sẽ trả về ngẫu nhiên các số từ 0 -> 9
         */
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            // các player đoán (gọi phương thức guess()) - Giao tiếp
            p1.guess();
            p2.guess();
            p3.guess();
            // lấy kết quả đoán của player - Giao tiếp
            guessp1 = p1.getNumber(); // encapsulation
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.getNumber(); // encapsulation
            System.out.println("Player one guessed " + guessp2);

            guessp3 = p3.getNumber(); // encapsulation
            System.out.println("Player one guessed " + guessp3);
            // kiểm tra guess của từng người có = targetNumber không
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            // nếu có ít nhất 1 người đoán đúng
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over");
                break;
            } else {
                System.out.println("Players will have to try again.");
            }
        }
    }
}
