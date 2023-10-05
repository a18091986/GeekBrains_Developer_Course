package seminars.five.homework05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) {
        // Установите путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Создайте экземпляр драйвера Chrome
        WebDriver driver = new ChromeDriver();

        // Откройте главную страницу Google
        driver.get("https://www.google.com/");

        // Найдите элемент поисковой строки и введите "Selenium"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");

        // Найдите кнопку "Поиск в Google" и нажмите ее
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        // Проверьте, что ссылка на официальный сайт Selenium присутствует в результатах поиска
        WebElement seleniumLink = driver.findElement(By.xpath("//a[@href='https://www.selenium.dev/']"));
        if (seleniumLink.isDisplayed()) {
            System.out.println("Ссылка на официальный сайт Selenium присутствует в результатах поиска.");
        } else {
            System.out.println("Ссылка на официальный сайт Selenium отсутствует в результатах поиска.");
        }

        // Закройте браузер
        driver.quit();
    }
}
