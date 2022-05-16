package com.caramel.tailor.core.exception;

/**
 * TailorException
 *
 * 定制异常超类
 *
 * @author Fitminf
 * @since 2022-05-17 01:44
 */
public class TailorException extends RuntimeException{

    public TailorException(String message) {
        super(message);
    }
}
