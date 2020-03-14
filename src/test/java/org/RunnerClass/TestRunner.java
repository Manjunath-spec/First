package org.RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.definitions",monochrome = true,plugin = "json:src\\test\\resources\\report\\out.json")
public class TestRunner {

}
