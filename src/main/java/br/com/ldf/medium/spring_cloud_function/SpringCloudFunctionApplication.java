package br.com.ldf.medium.spring_cloud_function;

import br.com.ldf.medium.spring_cloud_function.persistence.Customer;
import br.com.ldf.medium.spring_cloud_function.serviice.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringCloudFunctionApplication {

	private final CustomerService customerService;

    public SpringCloudFunctionApplication(CustomerService customerService) {
        this.customerService = customerService;
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionApplication.class, args);
	}

	@Bean
	public Function<Long, Customer> getCustomerById() {
		return customerService::getCustomerById;
	}
}
