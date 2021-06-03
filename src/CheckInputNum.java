import java.util.Scanner;

public class CheckInputNum {
    public static int numCheck() {
        int num = 0;
        do {
            try {
                System.out.print("入力してください>>");
                String str = new Scanner(System.in).nextLine();
                num = Integer.parseInt(str);

            } catch (NumberFormatException e) {
                System.out.println("数字を入力してください");
            }
        } while (num < 0); //マイナスの値が入力された際に、再度入力を促す
        return num;
    }
}
