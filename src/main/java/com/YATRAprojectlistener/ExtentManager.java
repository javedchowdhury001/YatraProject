package com.YATRAprojectlistener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	private static ExtentReports extent;

    public static ExtentReports createInstance(String fileName) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
       
        
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle(fileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);
        
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Tester", "Javed H Chowdhury");
        extent.setSystemInfo("Department", "QA Team");
        extent.setSystemInfo("Build no", "BANK-1234");
        extent.setSystemInfo( "OS","Windows 10");
        extent.setSystemInfo( "Java Version","1.8.0_181");
        extent.setSystemInfo( "Maven Version","3.6.3");
       
        return extent;
    }

}
