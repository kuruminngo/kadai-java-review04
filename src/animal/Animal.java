package animal;

public class Animal {
    // 名前を格納するフィールド
    private String name;
    // 年齢を格納するフィールド
    private int age;

    // コンストラクタ
    //ホビーは考えず対応。
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 名前を取得するメソッド
    public String getName() {
        return name;
    }

    // 年齢を取得するメソッド
    public int getAge() {
        return age;
    }

    // sayメソッド
    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }
}