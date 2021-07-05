package test;

import main.VerifyInputNum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestVerifyInputNum {
    String i;
    boolean expected;
    boolean actual;
    @Test
    @DisplayName("文字列の0を入れたらtrueが返ってくる")
    void testName() {
        // 4フェーズテスト
        //1段階目：setup →　メソッドが実行に必要なものを準備
        i = "0";
        expected = true;
        //2段階目：execute →　実際にメソッドを実行
        actual = VerifyInputNum.isNumber(i);
        //3段階目：verify　→　返値を確認する
        assertThat(actual, is(expected));
        //4段階目：teardown　→　他テストメソッドに影響を与えてしまったものを元に戻す
        //なし
    }
    @Test
    @DisplayName("文字列の-1を入れたらtrueが返ってくる")
    void testName2() {
        // 4フェーズテスト
        //1段階目：setup →　メソッドが実行に必要なものを準備
        i = "-1";
        expected = true;
        //2段階目：execute →　実際にメソッドを実行
        actual = VerifyInputNum.isNumber(i);
        //3段階目：verify　→　返値を確認する
        assertThat(actual, is(expected));
        //4段階目：teardown　→　他テストメソッドに影響を与えてしまったものを元に戻す
        //なし
    }
    @Test
    @DisplayName("文字列「あ」を入れたらfalseが返ってくる")
    void testName3() {
        // 4フェーズテスト
        //1段階目：setup →　メソッドが実行に必要なものを準備
        i = "あ";
        expected = false;
        //2段階目：execute →　実際にメソッドを実行
        actual = VerifyInputNum.isNumber(i);
        //3段階目：verify　→　返値を確認する
        assertThat(actual, is(expected));
        //4段階目：teardown　→　他テストメソッドに影響を与えてしまったものを元に戻す
        //なし
    }
}
