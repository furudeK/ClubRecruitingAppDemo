import java.util.ArrayList;
import java.io.*;

class ArticleTopPage {
    ArrayList<String> articleList = new ArrayList<>();
    String articleListCsv = "csv/article.csv";
    File csv = new File(articleListCsv);

    public void showArticleList() {
        ReadCSV csv = new ReadCSV();
        csv.readCSV();
    }

}
