package com.caramel.tailor.file.office.convertor;

import cn.hutool.core.io.resource.ResourceUtil;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * HTMLToPDFUtil
 * <p>
 * - HTML 转 PDF 工具
 * <p>
 * - 需要依赖：
 * -    转换工具：
 * -        <dependency>
 * -            <groupId>com.itextpdf</groupId>
 * -            <artifactId>itextpdf</artifactId>
 * -            <version>5.5.6</version>
 * -        </dependency>
 * -    字体处理：
 * -        <dependency>
 * -            <groupId>com.itextpdf.tool</groupId>
 * -            <artifactId>xmlworker</artifactId>
 * -            <version>5.5.6</version>
 * -        </dependency>
 * -    字体依赖：
 * -        <dependency>
 * -           <groupId>com.itextpdf</groupId>
 * -           <artifactId>itext-asian</artifactId>
 * -           <version>5.2.0</version>
 * -        </dependency>
 *
 * @author Fitminf
 * @since 2022-01-26 11:36
 */
public class HTMLToPDFUtil {

    /**
     * HTML 转 PDF
     * <p>
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     * +                                                                           +
     *          该方法有一个小 bug，不能识别 html 中的单标签如<img>、<br>等，
     *          所以 html 中如有图片，则转换失败
     * +                                                                           +
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
     *
     * @param htmlPath 需要转换的 html 文件路径
     * @param outPath  转成 pdf 文件的输出路径
     */
    public static void htmlToPdf(String htmlPath, String outPath) throws IOException, DocumentException {
        InputStream htmlFileStream = new FileInputStream(htmlPath);
        // 创建一个 document 对象实例
        Document document = new Document();
        // 为该 Document 创建一个Writer实例
        PdfWriter pdfwriter = PdfWriter.getInstance(document, new FileOutputStream(outPath));
        pdfwriter.setViewerPreferences(PdfWriter.HideToolbar);
        // 打开当前的 document
        document.open();
        XMLWorkerHelper.getInstance().parseXHtml(pdfwriter, document, htmlFileStream, null, null, new MyFontsProvider());
        document.close();
        System.out.println("=====>> 转换成功！");
    }

    /**
     * 处理字体
     */
    private static class MyFontsProvider extends XMLWorkerFontProvider {

        /**
         * 字体配置
         */
        @Override
        public Font getFont(String s, String s1, boolean embedded, float size, int style, BaseColor baseColor) {
            // 配置字体
            Font font = null;
            try {
                // 方案一：使用本地字体(本地需要有字体)
                // BaseFont bf = BaseFont.createFont("c:/Windows/Fonts/simsun.ttc,0", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
                // BaseFont bf = BaseFont.createFont("C:/Windows/Fonts/seguisym.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
                // 方案二：使用jar包：iTextAsian，这样只需一个jar包就可以了
                BaseFont bf = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.EMBEDDED);
                font = new Font(bf, size, style, baseColor);
                font.setColor(baseColor);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return font;
        }
    }

    public static void main(String[] args) throws Exception {
        String htmlPath = ResourceUtil.getResource("test/html-to-pdf/test.html").getPath();
        String outPath = "/Users/fitminf/Downloads/test.pdf";
        // String htmlPath = Objects.requireNonNull(HTMLToPDFUtil.class.getResource("test/html-to-pdf/test.html")).toString();
        // String outPath = Objects.requireNonNull(HTMLToPDFUtil.class.getResource("test/html-to-pdf/test.pdf")).toString();
        HTMLToPDFUtil.htmlToPdf(htmlPath, outPath);
    }

}
