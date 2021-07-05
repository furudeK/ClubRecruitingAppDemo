import java.util.Scanner;

public class PostPage implements PageTemplate {
    private void pageCheck(String tag, String str) {
        System.out.println(str);
        System.out.println("でよろしいですか？");
        boolean confirmation = CheckYesNo.ynCheck();

        if (!confirmation) {
            //TODO 再入力の際は、入力前の文字を表示して、それを編集できるようにする
            if (tag.equals("Title")) {
                typeTitle(); //タイトルの再入力を促す
            } else if (tag.equals("Body")) {
                typeBody();//本文の際入力を促す
            }
        } else {
            System.out.println( str + "です。");
            System.out.println("を登録します。");
            System.out.println();
        }
    }

    @Override
    public String typeTitle() {
        String tag = "Title";
        System.out.print("タイトルを入力してください>>");
        String title = new Scanner(System.in).nextLine();
        System.out.println();
        System.out.println("タイトル↓↓↓");
        pageCheck(tag, title);
        return title;

    }

    @Override
    public String typeBody() {
        String tag = "Body";
        System.out.print("本文を入力してください>>");
        String body = new Scanner(System.in).nextLine();
        System.out.println();
        System.out.println("本文↓↓↓");
        pageCheck(tag, body);
        return body;
    }
}
