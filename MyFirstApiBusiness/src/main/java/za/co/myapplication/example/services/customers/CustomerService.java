package za.co.myapplication.example.services.customers;

import za.co.myapplication.example.domain.dtos.customer.CustomerDto;

import java.io.IOException;
import java.util.List;


public interface CustomerService {
    List<CustomerDto> getAllCustomers () throws IOException;
    CustomerDto getCustomersById (String id) throws IOException;
    CustomerDto getCustomersByName (String firstName) throws IOException;
    CustomerDto createCustomers (CustomerDto customerDto) throws IOException;
    CustomerDto updateCustomer (CustomerDto customerDto) throws IOException;
    void deleteCustomers (String id) throws IOException;

}
