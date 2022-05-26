package com.caramel.tailor.core.annotation;

import java.lang.annotation.*;

/**
 * TailorDoc
 * <p>
 * 该注解用于标记一个仅仅用于作为解释说明的类
 *
 * @author Fitminf
 * @since 2022-05-14 01:02
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface TailorDocClass {
}
