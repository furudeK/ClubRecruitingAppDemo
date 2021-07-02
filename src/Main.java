import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //メインメニュー
        Scanner scanner = new Scanner(System.in);
        enum TopMenu {
            VIEW,
            POST;
        }

        TopMenu menu;
        while (true) {
            System.out.println("何をおこないますか？　1 >記事の閲覧　2 ＞記事の投稿");
            System.out.print("入力してください>>");
            String userInput = scanner.nextLine();
            boolean verifyNum = VerifyInputNum.isNumber(userInput);
            System.out.println(userInput);

            if (!verifyNum) {
                System.out.print("不正な値が入力されています！\n再度入力してください。\n");
            } else {
                if (userInput.equals("1")) {
                    menu = TopMenu.VIEW;
                    break;
                } else if (userInput.equals("2")) {
                    menu = TopMenu.POST;
                    break;
                }
            }
        }

        switch (menu) {
            case VIEW -> {
                System.out.println("記事の閲覧をおこないます。");
                System.out.println();
                ArticleTopPage article = new ArticleTopPage();
                article.showArticleList();
            }
            case POST -> {
                System.out.println("記事の投稿をおこないます。\n");
                PostPage page = new PostPage();
                final String title = page.typeTitle();
                final String body = page.typeBody();
                System.out.println("以下の記事を投稿しました。\n" + "タイトル：「" + title + "」\n" + "本文：「" + body + "」");
            }
        }
    }
}