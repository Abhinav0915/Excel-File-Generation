package com.example.ExcelFileGeneration.util;

import com.example.ExcelFileGeneration.entity.User;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class ExcelFileExporter {

    public static void exportUsersToExcel(HttpServletResponse response, List<User> users) throws IOException {
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=users.xlsx");

        // Create a new workbook and sheet
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Users");

        // Create header row
        Row headerRow = ((Sheet) sheet).createRow(0);
        ((Row) headerRow).createCell(0).setCellValue("User ID");
        headerRow.createCell(1).setCellValue("User Name");
        headerRow.createCell(2).setCellValue("City");
        headerRow.createCell(3).setCellValue("Email");

        // Populate data rows
        int rowNum = 1;
        for (User user : users) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(user.getUserId());
            row.createCell(1).setCellValue(user.getUserName());
            row.createCell(2).setCellValue(user.getCity());
            row.createCell(3).setCellValue(user.getEmail());
        }

        // Write to response stream
        try (OutputStream outputStream = response.getOutputStream()) {
            workbook.write(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        workbook.close();
    }
}
