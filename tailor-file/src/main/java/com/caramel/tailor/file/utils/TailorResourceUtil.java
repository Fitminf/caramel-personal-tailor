package com.caramel.tailor.file.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * TailorResourceUtil
 * <p>
 * 资源相关工具
 *
 * @author Fitminf
 * @since 2022-06-05 13:59
 */
public class TailorResourceUtil {

    /**
     * 获取项目资源路径
     *
     * @return 路径
     */
    public static String classpath() {
        return System.getProperty("user.dir") + "/src/main/resources";
    }

    /**
     * 获取项目资源路径
     *
     * @param path resources 后面的路径
     * @return 路径
     */
    public static String classpath(String path) {
        if (StringUtils.isNotEmpty(path) && !path.startsWith("/")) {
            path = "/" + path;
        }
        return System.getProperty("user.dir") + "/src/main/resources" + path;
    }

}
