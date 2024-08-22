package it.aulab.showcasehub;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShowcasehubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowcasehubApplication.class, args);
	}

	@Bean
    public ModelMapper instanceModelMapper(){
        ModelMapper mapper = new ModelMapper();
        return mapper;
    }
}