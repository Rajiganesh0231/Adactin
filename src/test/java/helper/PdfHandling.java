//package helper;
//
//import java.io.BufferedInputStream;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
////import org.apache.pdfbox.pdmodel.PDDocument;
////import org.apache.pdfbox.text.PDFTextStripper;
//import java.io.InputStream;
//
//
//public class PdfHandling {
//	
//		
//		WebDriver driver = null;
//		@BeforeTest
//		public void setUp() {
//		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Deepak\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
//			
//			//instantiate the driver
//			driver = new ChromeDriver();
//		}
//		
//	@Test
//		public void verifyContentInPDf() {
//			
//			String url ="https://www.angelsolutions.co.uk/wp-content/uploads/2018/07/Angel-Solutions-Privacy-Policy-v2.5.pdf";
//			driver.get(url);
//			try {
//				String pdfContent = readPdfContent(url);
//				Assert.assertTrue(pdfContent.contains("Please read this Privacy Policy carefully and ensure that you understand it."));
//			} catch (MalformedURLException e) {
//				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		
//		
//		
//		public static  String readPdfContent(String url) throws IOException {
//			
//			URL pdfUrl = new URL(url);
//			InputStream in = pdfUrl.openStream();
//			BufferedInputStream bf = new BufferedInputStream(in);
//			PDDocument doc = PDDocument.load(bf);
//			int numberOfPages = getPageCount(doc);
//			System.out.println("The total number of pages "+numberOfPages);
//			String content = new PDFTextStripper().getText(doc);
//			doc.close();
//		
//		return content;
//	}
//		
//		public static int getPageCount(PDDocument doc) {
//			
//			int pageCount = doc.getNumberOfPages();
//			return pageCount;
//			
//		}
//
//	}
//
//
