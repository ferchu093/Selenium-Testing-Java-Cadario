package testyoutube;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestYoutubeMusic {
	 //VARIABLES
	private WebDriver driver;
	private static final String TIPO_DRIVER = "webdriver.chrome.driver";
	private static final String PATH_DRIVER = "./src/test/resources/webDriver/chromedriver.exe";
	private String URL = "https://www.youtube.com";
	
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
		String textSend = "shakira te felicito";
		WebElement txtSourch = driver.findElement(By.name("search_query"));
		txtSourch.sendKeys(textSend);
		txtSourch.submit();
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
	}
	
	@After
	public void tearDown()
	{
		System.out.println("FINALIZARON LOS TESTS");
	}
	
	@AfterClass
	public static void tearDownAfterClass()
	{
		System.out.println("FINALIZARON LOS TESTS");
	}
	
	

}