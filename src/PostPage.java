import java.util.Scanner;

public class PostPage implements PageTemplate {

    //YかNが正しく入力されているか確認する
    public static boolean YesNoCheck() {
        boolean YesNo = false;
        while (!YesNo) {
            System.out.println("はい>>Y　いいえ>> N ");
            System.out.print(">> ");
            String input = new Scanner(System.in).nextLine();

            if (input.equals("Y") || input.equals("y")) {
                YesNo = true;
            } else if (input.equals("N") || input.equals("n")) {
                YesNo = false;
                break; //FIXME 書き方に工夫ができる気がする。上の行(YesNo = false）を消せば良いのかもしれない
            } else {
                System.out.println("YまたはNを入力してください。");
            }
        }
        return YesNo;
    }

    private void pageCheck(String tag, String str) {
        System.out.println(str);
        System.out.println("でよろしいですか？");
        boolean confirmation = YesNoCheck();

        if (!confirmation) {
            //TODO 再入力の際は、入力前の値を表示して、それを編集できるようにする
            if (tag.equals("Title")) {
                writeTitle(); //タイトルの再入力を促す
            } else if (tag.equals("Body")) {
                writeBody();//本文の際入力を促す
            }
        } else {
            System.out.println(tag + "は" + str + "です。"); //todo tagをそのままではなくタイトル、本文と日本語に置き換えたい
            System.out.println();
        }
    }

    @Override
    public String writeTitle() {
        String tag = "Title";
        System.out.print("タイトルを入力してください>>");
        String title = new Scanner(System.in).nextLine();
        System.out.println();
        System.out.println("タイトル↓↓↓");
        pageCheck(tag, title);
        return title;

    }

    @Override
    public String writeBody() {
        String tag = "Body";
        System.out.print("本文を入力してください>>");
        String body = new Scanner(System.in).nextLine();
        System.out.println();
        System.out.println("本文↓↓↓");
        pageCheck(tag, body);
        return body;
    }
}
