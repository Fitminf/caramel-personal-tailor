package com.caramel.tailor.core.util;

import com.caramel.tailor.core.constant.SystemEnum;
import com.caramel.tailor.core.exception.CustomException;
import lombok.extern.slf4j.Slf4j;

/**
 * AssertUtil
 * <p>
 * 业务断言
 *
 * @author Fitminf
 * @since 2021-07-24 17:03
 */
@Slf4j
public class AssertUtil {

    /**
     * 校验条件
     * <p>
     * 校验失败抛异常
     *
     * @param flag   条件
     * @param errMsg 异常信息
     */
    public static void check(boolean flag, String errMsg) {
        if (flag) {
            log.error("报错：" + errMsg);
            throw new CustomException(errMsg, SystemEnum.ExceptionStatus.FAIL);
        }
    }

    /**
     * 校验条件 + 异常信息
     * <p>
     * 校验失败抛异常
     * <p>
     * 如果想在抛出异常的同时给出自定义的日志可调用此方法
     *
     * @param flag    条件
     * @param errMsg  异常信息
     * @param logInfo 日志
     */
    public static void check(boolean flag, String errMsg, String logInfo) {
        if (flag) {
            log.error("报错：" + logInfo);
            throw new CustomException(errMsg, SystemEnum.ExceptionStatus.FAIL);
        }
    }

    /**
     * 校验条件 + 异常信息 + 自定义异常码
     * <p>
     * 校验失败抛异常
     * <p>
     * 如果想在抛出异常的同时给出自定义的日志可调用此方法
     *
     * @param flag    条件
     * @param errMsg  异常信息
     * @param logInfo 日志
     * @param code    异常码
     */
    public static void check(boolean flag, String errMsg, String logInfo, SystemEnum.ExceptionStatus code) {
        if (flag) {
            log.error("报错：" + logInfo);
            throw new CustomException(errMsg, code);
        }
    }
}
