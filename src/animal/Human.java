package animal;

public class Human extends Animal implements Thinkable {
    // 趣味を保管するフィールド
    private String hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        // スーパークラスのコンストラクタを呼び出して名前と年齢を初期化
        super(name, age);
        this.hobby = hobby;
    }

    // 趣味を取得するメソッド
    public String getHobby() {
        return hobby;
    }

    // thinkメソッドの実装
    //インターフェイスがここで出てくる
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}