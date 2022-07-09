package com.caramel.tailor.core.util;


/**
 * TailorEnumUtil
 * <p>
 * 枚举工具
 *
 * @author Fitminf
 * @since 2022-06-07 00:06
 */
public class TailorEnumUtil {

    /**
     * 由于枚举 toString 方法默认返回枚举名称，当想输出 Object 的 toString 时使用。
     *
     * @param e 枚举对象
     * @return toString
     */
    public static String getObjectToString(Enum<?> e) {
        return TailorObjectUtil.getObjectToString(e);
    }
}
