package Exercise1.example.baseUtilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pomBaseClass {
    public  WebDriver driver;
    public pomBaseClass(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
