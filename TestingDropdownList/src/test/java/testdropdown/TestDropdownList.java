package testdropdown;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropdownList {
	    //VARIABLES
		private WebDriver driver;
		private static final String TIPO_DRIVER = "webdriver.chrome.driver";
		private static final String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver.exe";
		private String URL = "https://demoqa.com/select-menu";
		
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
			driver.manage().window().maximize();
			
			Select oldStyleMenu = new Select(driver.findElement(By.id("oldSelectMenu")));
			//Old Style Select Menu
			//oldStyleMenu.selectByValue("7");
			oldStyleMenu.selectByVisibleText("Magenta");
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