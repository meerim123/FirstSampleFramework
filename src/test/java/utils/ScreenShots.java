package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class ScreenShots {

    public static void captureScreenShot(){
        String date = DateUtils.currentDateTime();

        try{
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("./src/main/resources/screenshots/screenshot " + date + ".jpeg"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
