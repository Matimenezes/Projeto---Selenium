package testejv.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
  * base para a criação de novas paginas de PO
  */
public abstract class basePO {
/**
 * driver base que sera usado pelas pages 
 */
    protected WebDriver driver;

    /**
     * construtor do PageFactory
     * @param driver driver da pagona atual
     */
    protected basePO(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
    }






    
}
