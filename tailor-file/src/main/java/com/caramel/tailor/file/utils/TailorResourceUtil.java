package com.caramel.tailor.file.utils;

import org.apache.commons.lang3.StringUtils;

import java.io.File;

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
     * @param childrenProjectName 子工程名称
     * @return 路径
     */
    public static String classpath(String childrenProjectName) {
        return System.getProperty("user.dir") + "/" + childrenProjectName + "/src/main/resources";
    }

    /**
     * 获取项目资源路径
     *
     * @param childrenProjectName 子工程名称
     * @param path                resources 后面的路径
     * @return 路径
     */
    public static String classpath(String childrenProjectName, String path) {
        if (StringUtils.isNotEmpty(path) && !path.startsWith("/")) {
            path = "/" + path;
        }
        return new File("").getAbsolutePath() + "/" + childrenProjectName + "/src/main/resources" + path;
    }

    public static void main(String[] args) {
        System.out.println(classpath("tailor-file"));
    }
}
