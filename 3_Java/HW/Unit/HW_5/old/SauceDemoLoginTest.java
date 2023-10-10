package seminars.five.homework05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoLoginTest {
    public static void main(String[] args) {
        // Установите путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Создайте экземпляр драйвера Chrome
        WebDriver driver = new ChromeDriver();

        // Откройте страницу https://www.saucedemo.com/
        driver.get("https://www.saucedemo.com/");

        // Найдите элементы логина и введите данные для входа
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        // Отправьте форму логина
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.submit();

        // Проверьте, что на странице отображаются продукты
        WebElement productsLabel = driver.findElement(By.className("product_label"));
        if (productsLabel.getText().equals("Products")) {
            System.out.println("Авторизация прошла успешно, на странице отображаются продукты.");
        } else {
            System.out.println("Авторизация не удалась или продукты не отображаются.");
        }

        // Закройте браузер
        driver.quit();
    }
}
