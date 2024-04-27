package animal;

public class Review04 {

    public static void main(String[] args) {
        // Humanクラスのインスタンスを作成し、初期化する
    	//ヒントよりもGPTに聞いた内容のがわかりやすいためこれに沿って作成していく
        Human tanaka = new Human("田中 太郎", 25, "電車");
        Human suzuki = new Human("鈴木 次郎", 30, "野球");
        Human sato = new Human("佐藤 花子", 20, "映画");

        // それぞれのインスタンスでsayメソッドとthinkメソッドを実行する
        // 実行順序は以下のようになる
        // 1. tanaka: say -> think
        // 2. suzuki: say -> think
        // 3. sato: say -> think
        tanaka.say();
        tanaka.think();

        suzuki.say();
        suzuki.think();

        sato.say();
        sato.think();
    }
}