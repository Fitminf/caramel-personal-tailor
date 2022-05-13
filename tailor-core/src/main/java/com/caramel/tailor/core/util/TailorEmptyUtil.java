package com.caramel.tailor.core.util;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.map.MapUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * TailorEmptyUtil
 * <p>
 * 统一判空入口
 *
 * @author Fitminf
 * @since 2022-05-14 00:23
 */
public class TailorEmptyUtil {

    /**
     * 字符串判空
     *
     * @param s 字符串条件
     * @return boolean
     */
    public static boolean isEmpty(String s) {
        return StringUtils.isEmpty(s);
    }

    /**
     * 字符串判空
     *
     * @param s 字符串条件
     * @return boolean
     */
    public static boolean isNotEmpty(String s) {
        return StringUtils.isNotEmpty(s);
    }

    /**
     * 集合判空
     *
     * @param c 集合条件
     * @return boolean
     */
    public static boolean isEmpty(Collection<?> c) {
        return CollectionUtil.isEmpty(c);
    }

    /**
     * 集合判空
     *
     * @param c 集合条件
     * @return boolean
     */
    public static boolean isNotEmpty(Collection<?> c) {
        return CollectionUtil.isNotEmpty(c);
    }

    /**
     * Map判空
     *
     * @param map Map 条件
     * @return boolean
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return MapUtil.isEmpty(map);
    }

    /**
     * Map判空
     *
     * @param map Map 条件
     * @return boolean
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return MapUtil.isNotEmpty(map);
    }

    /**
     * 数组判空
     *
     * @param objs 数组条件
     * @return boolean
     */
    public static boolean isEmpty(Object[] objs) {
        return ArrayUtils.isEmpty(objs);
    }


    /**
     * 对象判空
     *
     * @param obj 对象条件
     * @return boolean
     */
    public static boolean isEmpty(Object obj) {
        return Objects.isNull(obj);
    }

    /**
     * 对象判空
     *
     * @param obj 对象条件
     * @return boolean
     */
    public static boolean isNotEmpty(Object obj) {
        return Objects.nonNull(obj);
    }
}
