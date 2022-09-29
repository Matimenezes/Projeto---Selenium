package testejv.test;


import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class baseTest {

    protected static WebDriver driver;
    private static final String URL_BASE = "https://www.saucedemo.com/";
    private static final String CAMINHO_DRIVER = "src/test/java/testejv/resource/chromedriver.exe";

    @BeforeClass
    public static void iniciar(){
        System.setProperty("webdriver.chrome.driver",CAMINHO_DRIVER);
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);

    }

 // @AfterClass
  //  public static void fecharJanela(){
//driver.quit();

}
    
//}
