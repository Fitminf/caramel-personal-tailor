package test.com.caramel.tailor.file;

import com.caramel.tailor.file.office.convertor.HTMLToPDFUtil;
import com.caramel.tailor.file.utils.TailorResourceUtil;
import com.itextpdf.text.DocumentException;
import org.junit.jupiter.api.Test;

import java.io.File;
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
    public void testTailorResourceUtil() throws IOException {
        // 1.获取当前文件所在的路径
        System.out.println(this.getClass().getResource("").getPath());
        // 2.获取再 target 下 classpath 路径
        System.out.println(this.getClass().getResource("/").getPath());
        // 3.也是获取 classpath 的绝对路径
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("").getPath());
        // 4.也是获取 classpath 的绝对路径
        System.out.println(this.getClass().getClassLoader().getResource("").getPath());
        // 5.也是获取 classpath 的绝对路径
        System.out.println(ClassLoader.getSystemResource("").getPath());
        // 6.获取当前项目路径（此方法与 7 效果相同，但是可以将路径转为标准形式，会处理“.”和“..”）
        System.out.println(new File("").getCanonicalPath());
        // 7.获取项目绝对路径（不会处理“.”和“..”）
        System.out.println(new File("").getAbsolutePath());

        System.out.println("-----------"+TailorResourceUtil.classpath("tailor-file"));
    }
}
