package za.co.myapplication.example.services.customers;

import za.co.myapplication.example.domain.dtos.customer.CustomerDto;

import java.io.IOException;
import java.util.List;


public interface CustomerService {
    List<CustomerDto> getCustomers () throws IOException;
    CustomerDto getCutsomer (String id) throws IOException;
    CustomerDto createCutsomer (CustomerDto customerDto) throws IOException;
    CustomerDto updateCutsomer (CustomerDto customerDto) throws IOException;
    CustomerDto deleteCutsomer (boolean isDeleted) throws IOException;

}
