package com.caramel.tailor.core.annotation;

import java.lang.annotation.*;

/**
 * TailorDocAnnotation
 * <p>
 * 该注解用于标记一个仅仅用于作为解释说明的注解
 *
 * @author Fitminf
 * @since 2022-05-17 01:39
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
@Documented
public @interface TailorDocAnnotation {
}
