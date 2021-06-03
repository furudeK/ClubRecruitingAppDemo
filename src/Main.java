import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //メインメニュー
        int flag = 0;
        int menuNum = 0;
        while (flag == 0) {
            System.out.println("何をおこないますか？　1>記事の閲覧　2＞記事の投稿");
            Scanner scanner = new Scanner(System.in);
            menuNum = CheckInputNum.numCheck();

            if (menuNum == 1 || menuNum == 2) {
                flag = 1;
            } else {
                System.out.println("不正な値が入力されています！");
                System.out.println("再度入力してください。");
            }
        }

        switch (menuNum) {
            //記事の閲覧の場合の処理
            case 1:
                System.out.println("記事の閲覧をおこないます。");
                System.out.println();
                ArticleTopPage article = new ArticleTopPage();
                article.showArticleList();
                break;
            //記事の投稿の場合の処理
            case 2:
                String title, body;
                System.out.println("記事の投稿をおこないます。");
                System.out.println();
                PostPage page = new PostPage();
                title = page.writeTitle();
                body = page.writeBody();
                System.out.println();
                System.out.println("以下の記事を投稿しました。");
                System.out.println("タイトル：「" + title + "」");
                System.out.println("本文：「" + body + "」");
                break;
        }
    }
}