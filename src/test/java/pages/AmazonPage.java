package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


import java.io.FileNotFoundException;

public class AmazonPage {

   /*
        Bu kod bu classtaki ögeleri driver ile iliskilendirir
        Bu sayede classtaki webelementlere erisebilmek icin @FindBy gibi PageFactory ye yardimci olan
        notasyonlari kullanilabilir hale getirir

        PageFactory.initElements(Driver.getDriver(),this); kodu bu classtaki class memberlari webdriver ile eslestirir
     Bu sayede classtaki webelementlere erismek icin PageFactory e yardimci olan  @FindBy notasyonu kullanilabilir
   */


    public AmazonPage() throws FileNotFoundException {
        PageFactory.initElements(Driver.getDriver(),this);

    }



    @FindBy(id = "twotabsearchtextbox")
    public WebElement searcBox;















}
