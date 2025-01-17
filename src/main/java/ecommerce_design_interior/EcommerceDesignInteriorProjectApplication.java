package ecommerce_design_interior;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class EcommerceDesignInteriorProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceDesignInteriorProjectApplication.class, args);


		System.out.println("TestGithub");
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();

		//todo => bunun eynisini config klasinda
		// configuration annotasiyasi adi altinda etmek meumkundur

		//todo bunu spring ozu oz konteynirine elave ede bilmir
		//todo ona gorede elle edilir
	}
}