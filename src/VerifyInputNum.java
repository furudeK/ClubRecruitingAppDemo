/*
入力された文字列か数値化どうか判定し、
数値の場合はtrueをそれ以外の場合はfalseを返す
 */
public class VerifyInputNum {
    public static boolean isNumber(String str) {
        boolean flag;
        try {
            Integer.parseInt(str); //入力された文字列をintに変換可能か確認
            flag = true;
        } catch (NumberFormatException e) {
            System.out.println("数字を入力してください");
            flag = false;
        }
        return flag;
    }
}

