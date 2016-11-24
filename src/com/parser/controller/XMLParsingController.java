package com.fenintechnologies.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fenintechnologies.beans.ArrayOfBA;
import com.fenintechnologies.beans.ArrayOfBA.BA;
import com.fenintechnologies.beans.ArrayOfBA.BA.SCSS;
import com.fenintechnologies.beans.ArrayOfBA.BA.SSS;
import com.fenintechnologies.client.FenintechnoClient;
import com.fenintechnologies.contant.Constant;

public class XMLParsingController {

	public static void main(String[] args) {

		String response = FenintechnoClient.getResponse(Constant.WEB_URL);
		response = response.substring(1, response.length());
		try {
			if (response != null && !response.isEmpty()) {
				StreamSource streamSource = new StreamSource(new StringReader(
						response));
				JAXBContext jaxbContext = JAXBContext
						.newInstance(ArrayOfBA.class);
				Unmarshaller jaxbUnmarshaller1 = jaxbContext
						.createUnmarshaller();
				ArrayOfBA arrayOfBA = (ArrayOfBA) jaxbUnmarshaller1
						.unmarshal(streamSource);
				List<BA> list = arrayOfBA.getBA();
				createReports(list);
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void createReports(List<BA> dataSet) {

		int id = 2;
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Reports");
		Map<String, Object[]> data = new LinkedHashMap<String, Object[]>();
		data.put("1",
				new Object[] { "FirstName", "LastName", "Email", "SSS - AS",
						"SSS - BS", "SSS - CS", "SSS - DS", "SSS - ES",
						"SCSS - AS", "SCSS - BS", "SCSS - CS", "SCSS - DS",
						"SCSS - ES" });
		Iterator<BA> itr = dataSet.iterator();
		while (itr.hasNext()) {
			BA ba = itr.next();

			SSS sss;
			if (ba.getSSS().isEmpty()) {
				sss = new SSS();
			} else {

				sss = ba.getSSS().get(0);
			}
			SCSS scss;
			if (ba.getSCSS().isEmpty()) {
				scss = new SCSS();
			} else {

				scss = ba.getSCSS().get(0);
			}

			data.put(
					"" + id,
					new Object[] { ba.getFirstName(), ba.getLastName(),
							ba.getEmail(), sss.getAS(),sss.getBS(),sss.getCS(),sss.getDS(),sss.getES(),
							scss.getAS(),scss.getBS(),scss.getCS(),scss.getDS(),scss.getES()});
			id++;
		}
		
		generateCSVReport(data,sheet,workbook);
	     try {
            	
            	FileOutputStream outputStream = new FileOutputStream("reports"+System.currentTimeMillis()+".xlsx");
				workbook.write(outputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
		System.out.println("file created successfully !!!!!!!! ");
	}
	
	private static void generateCSVReport(Map<String, Object[]> data, XSSFSheet sheet,
			XSSFWorkbook workbook) {

		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {
			Row row = sheet.createRow(rownum++);
			Object[] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String)
					cell.setCellValue((String) obj);
				else if (obj instanceof Integer)
					cell.setCellValue((Integer) obj);
				else if (obj instanceof Float)
					cell.setCellValue((Float) obj);
				else if (obj instanceof Double)
					cell.setCellValue((Double) obj);
				else if (obj instanceof Short)
					cell.setCellValue((Short) obj);
				else if (obj instanceof Byte)
					cell.setCellValue((Byte) obj);
				else if (obj instanceof Long)
					cell.setCellValue((Long) obj);

			}
		}
	}
}
