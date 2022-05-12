package com.caramel.tailor.core.test;

import cn.hutool.core.io.resource.ResourceUtil;

import java.net.URL;

/**
 * test
 *
 * @author Fitminf
 * @since 2022-01-26 17:16
 */
public class TestFile {

    public static void main(String[] args) {

        String str = ResourceUtil.readUtf8Str("file/abc.txt");
        System.out.println(str);

        URL resource = ResourceUtil.getResource("file/abc.txt");

        System.out.println(resource.getPath());

    }
}
