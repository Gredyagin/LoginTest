package com.github.gredyagin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

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
    @FindBy(css = "input[type='submit']")
    private WebElement loginBtn;

    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public LoginPage clickLoginBtn() {
        loginBtn.click();
        return this;
    }

    /**
     * определение локатора сообщения об ошибке
     */
    @FindBy(className = "formBlock")
    private WebElement notification;

    /**
     * метод для получения текста сообщения об ошибке
     */
    public String getNotification() {
        return notification.getAttribute("value");
    }
}
