package com.twc.circle.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "classpath:Login.feature"
		
		
		)



public class Testrunner {

}
