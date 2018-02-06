package chapter12;

class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "A very important exception";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "A trivial Exception";
    }
}

public class LostMessage {
    static void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    static void g() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            // f()抛出的异常丢失, 被g()抛出的异常取代
            try {
                f();
            } finally {
                g();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // 捕获到异常也不会有输出
        try {
            int[] i = null;
            int x = i.length;
        } finally {
            return;
        }
    }
}


