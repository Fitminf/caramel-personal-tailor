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
        super("无法创建继承 TailorDocHandler 的实例，该类是一个 doc，请不要乱 new ！！！");
    }
}
