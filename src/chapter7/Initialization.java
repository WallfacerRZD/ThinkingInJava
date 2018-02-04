package chapter7;

public class Initialization {
    private String
            // 在定义处初始化
            str0 = "hello, ",
            str1,
            str2;
    int i;
    public Initialization() {
        // 构造器初始化
        System.out.println("constructor initialization");
        str1 = "world";
    }
    // 实例初始化
    {
        System.out.println("instance initialization");
        i = 2333;
    }

    @Override
    public String toString() {
        // 惰性初始化
        str2 = "!";
        return str0 + str1 + str2;
    }

    public  static void main(String[] args) {
        System.out.println(new Initialization());
    }
}
