import java.util.ArrayList;

class ArticleTopPage {
    ArrayList<String> articleList = new ArrayList<>();

    //TODO：投稿記事を反映する(データベースとの連携？とりあえずcsv読み込みでも良いかも）
    void getArticleList() {
        articleList.add("記事例1");
        articleList.add("記事例2");
        articleList.add("記事例3");
    }

    public void showArticleList() {
        getArticleList();
        articleList.forEach(System.out::println);
    }

}
