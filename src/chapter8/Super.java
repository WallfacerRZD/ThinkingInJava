package chapter8;

public class Super {
    static void f() {
        System.out.println("Super.f()");
    }

    public int field = 0;

    public int getField() {
        return field;
    }


    public static void main(String[] args) {
        Super sup = new Sub();
        Sub sub = new Sub();
        // 非static方法动态绑定
        System.out.println(sup.getField());
        // static方法不会动态绑定
        sup.f();
        sub.f();
        // 输出:1
        //      Super.f()
        //      Sub.f()
    }
}

class Sub extends Super {
    static void f() {
        System.out.println("Sub.f()");
    }

    /**
     * Sub包含两个称为field的域.
     * 在Sub中引用field的默认域是Sub的域
     * 为了得到Super的field域, 必须显示指明super.field
     */
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }

}
