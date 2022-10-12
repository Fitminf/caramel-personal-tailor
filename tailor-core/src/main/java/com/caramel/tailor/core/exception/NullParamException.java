package com.caramel.tailor.core.exception;

/**
 * NullParamException
 * <p>
 * 参数为空的特殊异常订制
 *
 * @author Fitminf
 * @since 2022-06-02 00:14
 */
public class NullParamException extends ParameterException {

    public NullParamException(String message) {
        super("传个空的参数进来你想干什么？" + message);
    }
}
