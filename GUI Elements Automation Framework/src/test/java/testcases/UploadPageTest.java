package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.UploadPage;

public class UploadPageTest extends BaseClass {
@Test(priority = 1)
public void verifySingleFileUpload() {

    UploadPage uploadPage = new UploadPage(driver);

    String sampleFile = System.getProperty("user.dir")
            + "\\src\\test\\resources\\sample.txt";

    uploadPage.uploadSingleFile(sampleFile);

    System.out.println("Single File Uploaded");
}

@Test(priority = 2)
public void verifyMultipleFileUpload() {

    UploadPage uploadPage = new UploadPage(driver);

    String file1 = System.getProperty("user.dir")
            + "\\src\\test\\resources\\file1.txt";

    String file2 = System.getProperty("user.dir")
            + "\\src\\test\\resources\\file2.txt";

    uploadPage.uploadMultipleFiles(file1, file2);

    System.out.println("Multiple Files Uploaded");
}
}