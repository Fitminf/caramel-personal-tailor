package com.caramel.tailor.core.constant;


import com.caramel.tailor.core.util.AssertUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * BusinessConstant
 * <p>
 * 业务枚举
 *
 * @author Fitminf
 * @since 2022-10-12 14:04
 */
public class BusinessEnum {

    /**
     * YesOrNo
     * <p>
     * 是不是呢
     *
     * @author Fitminf
     * @since 2022-10-12 15:54
     */
    @Getter
    @AllArgsConstructor
    public enum YesOrNo {

        YES("Y", "是"), NO("N", "否");

        private final String code;
        private final String msg;

        /**
         * 反一下
         *
         * @return YesOrNo
         */
        public YesOrNo reverseGetEnum(String code) {
            AssertUtil.check(check(code), "请检查参数！", "请检查参数！");
            return code.equals(YES.getCode()) ? NO : YES;
        }

        /**
         * 反一下
         *
         * @return String
         */
        public String reverseGetString(String code) {
            AssertUtil.check(check(code), "请检查参数！", "请检查参数！");
            return code.equals(YES.getCode()) ? NO.code : YES.code;
        }

        /**
         * boolean 转 YesOrNo
         *
         * @param flag boolean
         * @return YesOrNo
         */
        public YesOrNo convertEnumForBoolean(boolean flag) {
            return flag ? YES : NO;
        }

        /**
         * boolean 转 YesOrNo
         *
         * @param flag boolean
         * @return String
         */
        public String convertStringForBoolean(boolean flag) {
            return flag ? YES.code : NO.code;
        }

        /**
         * code 检查
         */
        public boolean check(String code) {
            return YesOrNo.YES.getCode().equals(code) || YesOrNo.NO.getCode().equals(code);
        }
    }

    /**
     * Gender
     * <p>
     * 性别
     *
     * @author Fitminf
     * @since 2022-10-12 16:40
     */
    @Getter
    @AllArgsConstructor
    public enum Gender {
        MAN("MAN", "男"),
        WOMAN("WOMAN", "女");

        private final String code;
        private final String msg;
    }


}