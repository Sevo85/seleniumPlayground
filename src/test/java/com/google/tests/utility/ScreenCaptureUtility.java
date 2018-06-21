package com.google.tests.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenCaptureUtility {

    public void takePageScreenshot(WebDriver driver, File file) {
        Screenshot screen = new AShot().takeScreenshot(driver);
        writeImage(file, screen);
    }

    public void takeElementScreenshot(WebDriver driver, File file, WebElement element) {
        Screenshot screen = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver,element);
        writeImage(file, screen);
    }

    private void writeImage(File file, Screenshot screen) {
        BufferedImage bi = screen.getImage();
        try{
            ImageIO.write(bi,"png", file);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
