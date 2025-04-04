package br.com.ldf.medium.function;

import br.com.ldf.medium.function.persistence.Customer;
import br.com.ldf.medium.function.service.CustomerService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;
import java.util.function.Function;

@SpringBootApplication
public class SpringCloudFunctionAwsApplication {

    private final CustomerService customerService;

    public SpringCloudFunctionAwsApplication(CustomerService customerService) {
        this.customerService = customerService;
    }

    /*
     * You need this main method (empty) or explicit <start-class>example.FunctionConfiguration</start-class>
     * in the POM to ensure boot plug-in makes the correct entry
     */
    public static void main(String[] args) {
        // empty unless using Custom runtime at which point it should include
        // SpringApplication.run(FunctionConfiguration.class, args);
    }

    @Bean
    public Function<Long, Customer> getCustomerById() {
        return customerService::getCustomerById;
    }
}
