package br.com.ldf.medium.spring_cloud_function.serviice;

import br.com.ldf.medium.spring_cloud_function.persistence.Customer;
import br.com.ldf.medium.spring_cloud_function.persistence.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
