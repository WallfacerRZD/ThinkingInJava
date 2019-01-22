package chapter8;

public class Super {
    public int field = 0;

    static void f() {
        System.out.println("Super.f()");
    }

    public static void main(String[] args) {
        Super sup = new Sub();
        Sub sub = new Sub();
        // 非static方法动态绑定
        System.out.println(sup.getField());
        // static方法不会动态绑定
        f();
        Sub.f();
        // 输出:1
        //      Super.f()
        //      Sub.f()
    }

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    /**
     * Sub包含两个称为field的域.
     * 在Sub中引用field的默认域是Sub的域
     * 为了得到Super的field域, 必须显示指明super.field
     */
    public int field = 1;

    static void f() {
        System.out.println("Sub.f()");
    }

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }

}
