package chapter19;

public enum OzWitch {
    // 实例必须在方法前定义
    WEST("WEST description"),
    NORTH("NORTH description"),
    EAST("EAST description"),
    SOUTH("SOUTH description");

    private String description;

    // 只能在enum内部构造enum实例, private声明可以去掉
    OzWitch(String description) {
        this.description = description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch + ": " + witch.getDescription());
        }
    }

    public String getDescription() {
        return description;
    }

}
