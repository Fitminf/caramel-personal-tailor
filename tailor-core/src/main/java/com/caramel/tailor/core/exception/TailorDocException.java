package com.caramel.tailor.core.exception;

/**
 * TailorDocException
 *
 * 文档实例异常
 *
 * @author Fitminf
 * @since 2022-05-14 01:06
 */
public class TailorDocException extends TailorException{

    public TailorDocException() {
        super("无法创建被 @TailorDocClass 注解标记的实例");
    }
}
