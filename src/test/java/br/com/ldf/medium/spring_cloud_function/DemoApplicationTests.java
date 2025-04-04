//package br.com.ldf.medium.spring_cloud_function;
//
//import br.com.ldf.medium.spring_cloud_function.persistence.Customer;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cglib.core.internal.Function;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@SpringBootTest
//class DemoApplicationTests {
//    @Autowired
//    private Function<Long, Customer> fetchCustomer;
//
//    @Test
//    void testFetchCustomer() {
//        Customer customer = fetchCustomer.apply(1L);
//        assertEquals("Alice", customer.getName());
//    }
//}