package test.com.caramel.tailor.core.util.entity;

import com.caramel.tailor.core.annotation.TailorDocClass;
import com.caramel.tailor.core.exception.TailorDocException;

/**
 * TailorDocDemo
 *
 * @author Fitminf
 * @since 2022-05-14 01:11
 */
@TailorDocClass
public class TailorDocDemo {

    public TailorDocDemo() {
        throw new TailorDocException();
    }
}
