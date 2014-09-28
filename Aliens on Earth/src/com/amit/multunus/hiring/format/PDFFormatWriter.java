package com.amit.multunus.hiring.format;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import com.amit.multunus.hiring.entity.Alien;

public class PDFFormatWriter implements FormatWriter {
	
	private static PDFFormatWriter _instance;
	
	private PDFFormatWriter() {
	}
	
	public static PDFFormatWriter getInstance() {
		if(_instance == null) {
			_instance = new PDFFormatWriter();
		}
		return _instance;
	}

	@Override
	public void writeToFile(Alien alien) throws Exception {
		File file = new File("alien.pdf");
		try (PDDocument document = file.exists()? PDDocument.load(file) : new PDDocument()) {
			PDPage page = new PDPage();
			document.addPage(page );
			PDPageContentStream contentStream = new PDPageContentStream(document, page);
			contentStream.beginText();
			PDFont font = PDType1Font.HELVETICA_BOLD;
			contentStream.setFont( font, 12 );
			contentStream.moveTextPositionByAmount( 100, 700 );
			contentStream.drawString(alien.toString());
			contentStream.endText();
			contentStream.close();
			document.save("alien.pdf");
		}
	}

}
