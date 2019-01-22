package chapter19;

import java.text.DateFormat;
import java.util.Date;

public enum ConstantSpecificMethod {
    DATE_TIME {
        @Override
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH {
        @Override
        String getInfo() {
            return System.getenv("CLASSPATH");
        }
    },
    VERSION {
        @Override
        String getInfo() {
            return System.getProperty("java.version");
        }
    };

    public static void main(String[] args) {
        for (ConstantSpecificMethod c : ConstantSpecificMethod.values()) {
            System.out.println(c.getInfo());
        }
    }

    abstract String getInfo();
}
