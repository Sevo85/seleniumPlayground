package com.google.tests.utility;
import com.google.tests.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.File;
import java.io.IOException;

public class Listener extends TestListenerAdapter {


    @Override
    public void onTestFailure(ITestResult result){
        Object currentClass = result.getInstance();
        WebDriver webDriver = ((BaseTest) currentClass).getDriver();
        if (webDriver != null){
            String path = "./src/screenshots/temp.png";
            System.out.println(path);
            try {
                File f = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(f, new File(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

