package chapter20.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Integer键
 * 指定键的名字, 键的限制
 *
 * @author WallfacerRZD
 * @date 2018/6/5 11:31
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger {
    String name() default "";

    Constrains constrains() default @Constrains;
}
