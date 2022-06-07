package com.caramel.tailor.core.util;

/**
 * TailorObjectUtil
 * <p>
 * 对象工具
 *
 * @author Fitminf
 * @since 2022-06-08 00:17
 */
public class TailorObjectUtil {

    /**
     * 当重写 toString 方法时，当想输出 Object 的 toString 时使用。
     *
     * @param obj 实体对象
     * @return toString
     */
    public static String getObjectToString(Object obj) {
        return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
    }
}
