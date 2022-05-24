package testlogin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidationLogin {
	    //VARIABLES
		private WebDriver driver;
		private static final String TIPO_DRIVER = "webdriver.chrome.driver";
		private static final String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver.exe";
		private String URL = "https://food-delivery-customer.smartersvision.com/login";
		
		@BeforeClass
		public static void setUpBeforeClass()
		{
			System.out.println("INICIO DE TESTS");
			System.setProperty(TIPO_DRIVER, PATH_DRIVER);
		}
		@Before
		public void setUp()
		{
			//ABRE EL NAVEGADOR
			driver = new ChromeDriver();
			driver.get(URL);
		}
		@Test
		public void testSourch()
		{
			driver.findElement(By.id("email")).sendKeys("client@demo.com");
			//CONTRASEÑA CORRECTA 123456
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[6]/button")).click();
			String u=driver.getCurrentUrl();
			if(u.equals("https://food-delivery-customer.smartersvision.com/"))
			{
				System.out.println("Test Correcto");
				
			}
			else
			{
				
				System.out.println("Test Fallido");
			}
		}
		
		@After
		public void tearDown()
		{
			driver.close();
		}
		
		@AfterClass
		public static void tearDownAfterClass()
		{
			System.out.println("FINALIZARON LOS TESTS");
		}
		
		

	}