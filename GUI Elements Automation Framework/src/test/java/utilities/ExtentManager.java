package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static ExtentReports getExtentReport() {

        if (extent == null) {

            ExtentSparkReporter sparkReporter =
                    new ExtentSparkReporter("test-output/ExtentReport.html");

            sparkReporter.config().setReportName("GUI Automation Report");
            sparkReporter.config().setDocumentTitle("Selenium Capstone Project");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);

            extent.setSystemInfo("Tester", "Eklavya Kumar");
            extent.setSystemInfo("Framework", "Selenium + TestNG");
            extent.setSystemInfo("Project", "GUI Automation");
            extent.setSystemInfo("Environment", "QA");
        }

        return extent;
    }

    public static void setTest(ExtentTest extentTest) {
        test.set(extentTest);
    }

    public static ExtentTest getTest() {
        return test.get();
    }
}
