package com.caramel.tailor.core.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * SystemConstant
 *
 * 系统常量
 *
 * @author Fitminf
 * @since 2022-10-12 16:26
 */
public class SystemEnum {

    /**
     * 异常码
     *
     * @author Fitminf
     * @since 2022-10-12 15:55
     */
    @Getter
    @AllArgsConstructor
    public enum ExceptionStatus {
        FAIL(500, "系统崩溃");

        private final int code;
        private final String msg;
    }
}
