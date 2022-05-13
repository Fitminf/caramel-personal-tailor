package test.com.caramel.tailor.core.util;

import com.caramel.tailor.core.annotation.TailorDoc;
import org.junit.jupiter.api.Test;
import test.com.caramel.tailor.core.util.entity.TailorDocDemo;

import java.lang.reflect.Constructor;

/**
 * TailorDocTest
 *
 * @author Fitminf
 * @since 2022-05-14 01:10
 */
public class TailorDocTest {

    /**
     * 测试反射创建 TailorDocDemo
     */
    @Test
    public void testDoc() throws Exception {
        Constructor<TailorDocDemo> constructor = TailorDocDemo.class.getDeclaredConstructor();
        TailorDocDemo docDemo = constructor.newInstance();
        System.out.println(docDemo);
    }

}
