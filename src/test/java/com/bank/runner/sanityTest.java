package com.bank.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features", // path of features package
        glue = "com/bank/steps",  // path of steps package
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",// path of html report   // extent report website
                "json:target/cucumber-reports/cucumber.json"},
        tags = "@sanity"

)
public class sanityTest extends AbstractTestNGCucumberTests {

}
