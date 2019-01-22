package chapter8;

class Glyph {
    Glyph() {
        System.out.println("Glyph() before draw()");
        // 创建子类时会调用子类的draw
        // 且此时子类还未初始化(子类的内存里是二进制0)
        draw();
        System.out.println("Glyph() after draw()");
    }

    void draw() {
        System.out.println("Glyph.draw()");
    }
}

/**
 * 输出:
 * Glyph() before draw()
 * RoundGlyph .draw() radius = 0
 * Glyph() after draw()
 * RoundGlyph() radius = 5
 */
public class RoundGlyph extends Glyph {
    private int radius = 1;

    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph() radius = " + radius);
    }

    public static void main(String[] args) {
        new RoundGlyph(5);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph .draw() radius = " + radius);
    }
}
