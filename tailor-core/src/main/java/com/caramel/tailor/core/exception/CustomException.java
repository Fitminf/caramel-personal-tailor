package com.caramel.tailor.core.exception;

import com.caramel.tailor.core.constant.SystemEnum;
import lombok.Getter;

/**
 * CustomException
 * <p>
 * 自定义异常
 *
 * @author Fitminf
 * @since 2021-07-14 02:20
 */
@Getter
public class CustomException extends RuntimeException {

    private static final long serialVersionUID = -1232819940876686328L;

    /**
     * 异常码（默认是通用异常码：FAIL）
     */
    private SystemEnum.ExceptionStatus code = SystemEnum.ExceptionStatus.FAIL;

    public CustomException(String msg) {
        super(msg);
    }

    public CustomException(String msg, SystemEnum.ExceptionStatus code) {
        super(msg);
        this.code = code;
    }
}
