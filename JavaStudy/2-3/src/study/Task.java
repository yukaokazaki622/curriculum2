package study;


// ① TaskクラスにCalculatorクラスを継承させなさい。
    public class Task extends Calculator{
    /**
     * タスクの実行
     */
    public void doTask() {

        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。

    	int a = Calculator.plus(10);
    	int b = Calculator.plus(10, 20);
    	int c = Calculator.plus(10, 20, 30);

    	System.out.println("plusメソッドの引数が一つの場合:" + a);
    	System.out.println("plusメソッドの引数が二つの場合:" + b);
    	System.out.println("plusメソッドの引数が三つの場合:" + c);

    }
}