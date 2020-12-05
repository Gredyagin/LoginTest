package com.github.gredyagin.test;

import com.github.gredyagin.page.LoginPage;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LoginTest extends BaseTest {

    /**
     * тестовый метод для проверки сообщения об ошибке
     */
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);

        //получение доступа к методам класса LoginPage для взаимодействия с элементами страницы
        //нажимаем кнопку входа
        loginPage.clickLoginBtn();
        //получаем текст уведомления об ошибке

        //сравниваем текст уведомления об ошибке с текстом из файла настроек

        assertThat(loginPage.getNotification(), is(properties.getProperty("notification")));
    }
}
