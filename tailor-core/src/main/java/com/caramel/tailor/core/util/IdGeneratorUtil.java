package com.caramel.tailor.core.util;

import cn.hutool.core.lang.UUID;

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
     * 生成 uuid
     *
     * @return uuid
     */
    public static String getUuid() {
        return UUID.randomUUID().toString(true);
    }
}
