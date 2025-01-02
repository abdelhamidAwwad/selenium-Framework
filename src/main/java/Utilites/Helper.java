package Utilites;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Helper {

    // Take ScreenShots Pass and Fail
    public static void CaptureScreenShoot (WebDriver driver ,String ScreenShotName ,String Path) throws IOException {
        Path destination = Paths.get(Path,ScreenShotName+".jpg");
        try {
            Files.createDirectories(destination.getParent());
            FileOutputStream out = new FileOutputStream(destination.toString()) ;
            out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
            out.close();
        }
        catch (IOException e)

        {
            System.out.println("ُException When Take ScreenShots"+e.getMessage());

        }
    }
}
