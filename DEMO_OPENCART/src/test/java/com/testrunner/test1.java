package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/features/b.feature"},glue="com.stepdefinition",
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport",
"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"}
)
public class test1 extends AbstractTestNGCucumberTests {

}
