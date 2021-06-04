import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //メインメニュー
        Scanner scanner = new Scanner(System.in);
        enum Menu{
            VIEW,
            POST;
        }

        int menuNum = 0;
        while (true) {
            System.out.println("何をおこないますか？　1>記事の閲覧　2＞記事の投稿");
            menuNum = VerifyInputNum.numCheck(scanner);
            if (menuNum == 1 || menuNum == 2) {
                break;
            } else {
                System.out.print("不正な値が入力されています！\n再度入力してください。\n");
            }
        }

        switch (menuNum) {
            //記事の閲覧の場合の処理
            case 1: //FIXME caseに長々と処理を描かない
                System.out.println("記事の閲覧をおこないます。");
                System.out.println();
                ArticleTopPage article = new ArticleTopPage();
                article.showArticleList();
                break;
            //記事の投稿の場合の処理
            case 2:
                System.out.println("記事の投稿をおこないます。\n");
                PostPage page = new PostPage();
                final String title = page.inputTitle(); //FIXME もっと良い名前はないのだろうか
                final String body = page.inputBody();
                System.out.println(); //FIXME これは必要なのか？もっとスマートに書こう
                System.out.println("以下の記事を投稿しました。");
                System.out.println("タイトル：「" + title + "」");
                System.out.println("本文：「" + body + "」");
                break;
        }
    }
}