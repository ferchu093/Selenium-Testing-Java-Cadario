package testradio;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelectRadioButtons {
	 //VARIABLES
	private WebDriver driver;
	private static final String TIPO_DRIVER = "webdriver.chrome.driver";
	private static final String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver.exe";
	private String URL = "https://testautomation.co/webelements";
	
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
		List<WebElement> browserradios = driver.findElements(By.name("browser"));
		//browserradios.get(1).click();
		for (WebElement radio:browserradios)
		{
			System.out.println(radio.getAttribute("value"));
			if (radio.getAttribute("value").equals("safari"))
					{
				radio.click();
					}
		}
	}
	
	@After
	public void tearDown()
	{
		//driver.close();
	}
	
	@AfterClass
	public static void tearDownAfterClass()
	{
		System.out.println("FINALIZARON LOS TESTS");
	}
	

}