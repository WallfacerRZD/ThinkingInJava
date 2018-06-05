package chapter20.database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据库表中键的限制
 * 指定键是否为主键, 是否允许为空, 是否是唯一
 * @author WallfacerRZD
 * @date 2018/6/5 11:27
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constrains {
    boolean primaryKey() default false;

    boolean allowNull() default true;

    boolean unique() default false;
}
