package com.asiainfo.chapter2.luomin.view;

import com.asiainfo.chapter2.luomin.entity.Home;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author Luoo
 * @create 2017-09-09 17:22
 */

public class ExcelView extends AbstractExcelView {

    @Override
    protected void buildExcelDocument(Map<String, Object> model,
                                      HSSFWorkbook workbook, HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        List<Home> articles = (List<Home>) model.get("articles");

        HSSFSheet sheet = workbook.createSheet("文章列表");//创建一页
        HSSFRow header = sheet.createRow(0);//创建第一行
        header.createCell(0).setCellValue("标题");
        header.createCell(1).setCellValue("正文");
        for (int i = 0; i < articles.size(); i++) {
            HSSFRow row = sheet.createRow(i + 1);
            Home article = articles.get(i);
            row.createCell(0).setCellValue(article.getId());
            row.createCell(1).setCellValue(article.getName());
        }
    }

}