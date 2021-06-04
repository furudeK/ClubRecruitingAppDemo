import java.util.Scanner;

public class VerifyInputNum {
    public static int numCheck(Scanner scanner) {
        int num = 0;
        while (num == 0) {
            try {
                System.out.print("入力してください>>");
                String str = scanner.nextLine();
                num = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください");
            }
        }
        return num;
    }
}

