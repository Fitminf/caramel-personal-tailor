package com.caramel.tailor.core.handler;

import com.caramel.tailor.core.exception.TailorDocException;

/**
 * TailorDocHandler
 * <p>
 * 该处理器用于标记一个仅仅用于作为解释说明的 class
 * 为了防止这一类 class 在业务逻辑代码中出现
 * 限制他们无法被实例化
 *
 * @author Fitminf
 * @since 2022-05-26 18:58
 */
@SuppressWarnings("all")
public class TailorDocHandler {
    public TailorDocHandler() {
        throw new TailorDocException();
    }
}
