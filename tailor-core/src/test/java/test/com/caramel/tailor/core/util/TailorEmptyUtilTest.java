package test.com.caramel.tailor.core.util;

import com.caramel.tailor.core.util.TailorEmptyUtil;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TailorEmptyUtilTest
 *
 * @author Fitminf
 * @since 2022-05-14 00:38
 */
public class TailorEmptyUtilTest {

    /**
     * 测试字符串
     */
    @Test
    public void testStringEmpty(){
        String s = "";
        System.out.println(TailorEmptyUtil.isEmpty(s));
    }

    /**
     * 测试集合
     */
    @Test
    public void testCollectionEmpty(){
        List<String> list = new ArrayList<>();
        list.add("");
        System.out.println(TailorEmptyUtil.isEmpty(list));
    }

    /**
     * 测试 Map
     */
    @Test
    public void testMapEmpty(){
        Map<String,String> map = new HashMap<>();
        map.put("", "");
        System.out.println(TailorEmptyUtil.isEmpty(map));
    }

    /**
     * 测试数组
     */
    @Test
    public void testArrayEmpty(){
        String[] nums = new String[0];
        System.out.println(TailorEmptyUtil.isEmpty(nums));
    }

    /**
     * 测试对象
     */
    @Test
    public void testObjectEmpty(){
        Object o = null;
        System.out.println(TailorEmptyUtil.isEmpty(o));
    }

}
