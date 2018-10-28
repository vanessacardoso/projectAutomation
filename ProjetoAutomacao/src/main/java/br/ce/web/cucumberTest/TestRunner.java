package br.ce.web.cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, 
features = { "src\\main\\resources\\features\\criarConta.feature",
		     "src\\main\\resources\\features\\realizarLogin.feature",
		    "src\\main\\resources\\features\\manutencaoConta.feature",
		    "src\\main\\resources\\features\\menuMovimentacao.feature",
		
}, 
monochrome = false,
glue = { "br.ce.web.stepDefinition" }, 
plugin = {"pretty",

		
		},
tags = {  }
)


public class TestRunner {

	
	

	

}
