package com.caramel.tailor.core.test;

import lombok.Data;

/**
 * TestObj
 *
 * @author Fitminf
 * @since 2022-01-12 17:30
 */
@Data
public class TestObj {

    private String id;

    private String name;

    public void msg(){
        System.out.println("id：" + id);
        System.out.println("name：" + name);
    }
}
