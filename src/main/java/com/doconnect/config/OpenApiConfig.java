package com.doconnect.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

	@Bean
	public OpenAPI openApi() {
		return new OpenAPI()
				.info(new Info()
						.title("Doconnect-API")
						.description("Documentation of Doconnect APIs")
						.version("v1.0")
						.contact(new Contact()
								.name("Group 15")
								.url("https://olympus1.mygreatlearning.com/eportfolio/private/ZXlKMGVYQWlPaUpLVjFRaUxDSmhiR2NpT2lKSVV6STFOaUo5LmV5SjFjMlZ5WDJsa0lqbzBOalU1TVRreWZRLmItZWdlOWc4aHE4ZjVMeEprQjNTb3c5aGVQNWdRWXFOQldVcmNNMWRfc3c=?pb_id=13157")
								.email("doconnect.g15@gmail.com"))
						.termsOfService("DoConnect")
						);			
	}
}
