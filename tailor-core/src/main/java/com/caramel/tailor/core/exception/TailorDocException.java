package com.caramel.tailor.core.exception;

/**
 * TailorDocException
 *
 * @author Fitminf
 * @since 2022-05-14 01:06
 */
public class TailorDocException extends RuntimeException{

    public TailorDocException() {
        super("无法创建被 @TailorDoc 注解标记的实例");
    }
}
