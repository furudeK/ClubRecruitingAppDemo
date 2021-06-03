import java.util.Scanner;

public class CheckYesNo {
    //YかNが正しく入力されているか確認する
    public static boolean ynCheck() {
        boolean YesNo = false;
        while (!YesNo) {
            System.out.println("はい>>Y　いいえ>> N ");
            System.out.print(">> ");
            String input = new Scanner(System.in).nextLine();

            if (input.equals("Y") || input.equals("y")) {
                YesNo = true;
            } else if (input.equals("N") || input.equals("n")) {
                break;
            } else {
                System.out.println("YまたはNを入力してください。");
            }
        }
        return YesNo;
    }
}
