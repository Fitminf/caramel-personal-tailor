package test.com.caramel.tailor.core.util.entity;

import com.caramel.tailor.core.annotation.DocClass;
import com.caramel.tailor.core.exception.DocException;

/**
 * TailorDocDemo
 *
 * @author Fitminf
 * @since 2022-05-14 01:11
 */
@DocClass
public class TailorDocDemo {

    public TailorDocDemo() {
        throw new DocException();
    }
}
