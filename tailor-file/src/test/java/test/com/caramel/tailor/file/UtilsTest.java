package test.com.caramel.tailor.file;

import com.caramel.tailor.file.office.convertor.HTMLToPDFUtil;
import com.caramel.tailor.file.utils.TailorResourceUtil;
import com.itextpdf.text.DocumentException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * UtilsTest
 *
 * @author Fitminf
 * @version 1.0
 * @since 2021-04-27 00:06
 */
public class UtilsTest {

    /**
     * 测试 HTML 转 PDF
     */
    @Test
    public void testHTMLToPDF() throws DocumentException, IOException {
        String htmlPath = "src/main/resources/test/html-to-pdf/test.html";
        String outPath = "src/main/resources/test/html-to-pdf/test.pdf";
        // String htmlPath = Objects.requireNonNull(HTMLToPDFUtil.class.getResource("test/html-to-pdf/test.html")).toString();
        // String outPath = Objects.requireNonNull(HTMLToPDFUtil.class.getResource("test/html-to-pdf/test.pdf")).toString();
        HTMLToPDFUtil.htmlToPdf(htmlPath, outPath);
    }

    /**
     * 测试
     */
    @Test
    public void testTailorResourceUtil(){
        System.out.println(TailorResourceUtil.classpath("asd/sss"));
    }
}
