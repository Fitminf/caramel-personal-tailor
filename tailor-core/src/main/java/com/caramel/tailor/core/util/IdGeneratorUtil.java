package com.caramel.tailor.core.util;

import cn.hutool.core.util.IdUtil;

/**
 * IdGeneratorUtil
 * <p>
 * 主键 id 生成器
 *
 * @author Fitminf
 * @since 2022-10-01 17:03
 */
public class IdGeneratorUtil {

    /**
     * 获取唯一 id（UUID）
     * <p>
     * 去除横线
     *
     * @return uuid
     */
    public static String getIdByUUID() {
        return IdUtil.fastSimpleUUID();
    }

    /**
     * 获取唯一 id（雪花算法）
     *
     * @return uuid
     */
    public static Long getIdBySnowflake() {
        return IdUtil.getSnowflakeNextId();
    }

}
