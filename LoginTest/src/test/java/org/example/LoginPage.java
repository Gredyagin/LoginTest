package org.example;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
    String note;
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(css = "input[type=\"submit\"]")
    private WebElement loginBtn;

    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickLoginBtn() {
        loginBtn.click();
    }

    /**
     * определение локатора сообщения об ошибке
     */
    @FindBy(className = "formBlock")
    private WebElement notification;

    /**
     * метод для получения текста сообщения об ошибке
     */
    public void getNotification() {
        String note = notification.getAttribute("value");

    }
    /**
     * метод для сравнения текста сообщения об ошибке
     */
    public void assertNotification(){
        Assert.assertEquals(ConfProperties.getProperty("login"), note);
    }
}