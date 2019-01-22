package chapter20.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * String键
 * 指定值的长度, 键的名字, 键的限制
 *
 * @author WallfacerRZD
 * @date 2018/6/5 11:28
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
    int value() default 0;

    String name() default "";

    Constrains constrains() default @Constrains;
}
