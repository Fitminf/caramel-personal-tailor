package com.caramel.tailor.all.test;

import com.caramel.tailor.core.test.TestObj;
import org.apache.commons.lang3.StringUtils;

/**
 * AllTestObj
 *
 * @author Fitminf
 * @since 2022-01-13 01:09
 */
public class AllTestObj {

    public void msg(){
        TestObj obj = new TestObj();
        obj.setId("123");
        obj.setName("小猪");
        obj.msg();
    }

    public void utilTest(){
        String name = "fitminf";

        System.out.println(StringUtils.isNotBlank(name));
    }
}
