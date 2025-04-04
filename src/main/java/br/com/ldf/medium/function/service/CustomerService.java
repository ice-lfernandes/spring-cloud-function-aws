package br.com.ldf.medium.function.service;

import br.com.ldf.medium.function.persistence.Customer;
import br.com.ldf.medium.function.persistence.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {  
   private final CustomerRepository repository;

   public CustomerService(CustomerRepository customerRepository) {
        this.repository = customerRepository;
    }

   public Customer getCustomerById(Long id) {
      return repository.findById(id)  
          .orElseThrow(() -> new RuntimeException("Customer not found"));  
   }  
}