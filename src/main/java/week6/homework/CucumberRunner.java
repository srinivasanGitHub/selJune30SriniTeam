package week6.homework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"./Test.feature"},glue= {"week6.homework"})


public class CucumberRunner {

}

