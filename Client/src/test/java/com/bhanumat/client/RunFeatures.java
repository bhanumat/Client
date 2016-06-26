package com.bhanumat.client;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:com/bhanumat/client/features", glue={"com/bhanumat/client/steps"})
public class RunFeatures {
}