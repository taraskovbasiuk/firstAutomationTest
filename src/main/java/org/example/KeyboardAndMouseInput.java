package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\JavaStudy\\chromedriver-win64 118\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        FormPage formPage = new FormPage();
        FormPage.submitForm(driver);
        ConfirmationPage confirmationPage = new ConfirmationPage();
        confirmationPage.waitForBanner(driver);

        

        assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

        driver.quit();
    }





}




       /* System.setProperty("webdriver.chrome.driver", "C:\\JavaStudy\\chromedriver-win64 118\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver);
        waitForBanner(driver);

        assertEquals("The form was successfully submitted!", getAlertBannerText(driver));

        driver.quit();
    }

        public static void submitForm(WebDriver driver)
        {
            driver.findElement(By.id("first-name")).sendKeys("John");

            driver.findElement(By.id("last-name")).sendKeys("Doe");

            driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

            driver.findElement(By.id("radio-button-2")).click();

            driver.findElement(By.id("checkbox-2")).click();

            driver.findElement(By.cssSelector("option[value='1']")).click();

            driver.findElement(By.id("datepicker")).sendKeys("05/28/2023");

            driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

            driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        }

        public static void waitForBanner (WebDriver driver) {

            WebDriverWait wait = new WebDriverWait(driver, 10);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

    }
        public static String getAlertBannerText (WebDriver driver){

            return driver.findElement(By.className("alert")).getText();
        }
    }*/


        /*driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("John");

        driver.findElement(By.id("last-name")).sendKeys("Doe");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        driver.findElement(By.id("radio-button-2")).click();

        driver.findElement(By.id("checkbox-2")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("05/28/2023");

        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

        String alertText = alert.getText();

        assertEquals("The form was successfully submitted!", alertText);*/





        /*driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        WebDriverWait wait = new WebDriverWait(driver, 10);


        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pack-item")));

        autocompleteResult.click();

        driver.quit();*/




        /*driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit();*/




        /*driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));

        fileUploadField.sendKeys("file-to-upload.png");*/

       /* driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement drop_downMenu = driver.findElement(By.id("dropdownMenuButton"));
        drop_downMenu.click();
        WebElement autoComp = driver.findElement(By.xpath("/html/body/div/div/div/a[3]"));
        autoComp.click();*/




        /*driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement drop_downMenu = driver.findElement(By.id("dropdownMenuButton"));
        drop_downMenu.click();
        WebElement autoComp = driver.findElement(By.id("autocomplete"));
        autoComp.click();*/




        /*driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("03/03/2024");
        datePicker.sendKeys(Keys.RETURN);*/



        /*driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        Thread.sleep(2000);

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();

        Thread.sleep(2000);

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radioButton3.click();
*/










        /*driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));

        WebElement box = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();


        Thread.sleep(3000);
*/



        /*driver.get("https://formy-project.herokuapp.com/modal");
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", closeButton); ///????

        Thread.sleep(3000);
        driver.quit();*/

        /*driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement alertTabButton = driver.findElement(By.id("alert-button"));
        alertTabButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
*/

       /* driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle();

        for (String handle1 : driver.getWindowHandles()) {     ///????
            driver.switchTo().window(handle1);
        }

        driver.switchTo().window(originalHandle);*/




        /*driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(name);
        name.sendKeys("Taras Kov");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2020");*/

        /*package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

        public class KeyboardAndMouseInput {
            public static void main(String[] args) throws InterruptedException {

                System.setProperty("webdriver.chrome.driver", "C:\\JavaStudy\\chromedriver-win64 118\\chromedriver-win64\\chromedriver.exe");

                WebDriver driver = new ChromeDriver();

                driver.get("https://www.google.com/maps/");

                WebElement autocomlete = driver.findElement(By.id("searchboxinput"));
                autocomlete.sendKeys("Винники Яворницького 12");

                Thread.sleep(1000);

                WebElement autocomleteResult = driver.findElement(By.className("google-symbols"));
                autocomleteResult.click();*/




