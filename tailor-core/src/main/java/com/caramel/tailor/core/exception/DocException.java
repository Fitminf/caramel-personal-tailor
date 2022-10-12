package com.caramel.tailor.core.exception;

/**
 * DocException
 * <p>
 * 文档实例异常
 *
 * @author Fitminf
 * @since 2022-05-14 01:06
 */
public class DocException extends CustomException {

    public DocException() {
        super("无法创建继承 DocHandler 的实例，该类是一个 doc，请不要乱 new ！！！");
    }
}
