package za.co.myapplication.example.services.customers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.myapplication.example.domain.dtos.customer.CustomerDto;
import za.co.myapplication.example.repositories.customer.CustomerDao;
import za.co.myapplication.example.services.customers.CustomerService;

import java.io.IOException;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private  CustomerDao customerRepository;

    public void setCustomerDao(CustomerDao customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDto> getAllCustomers() throws IOException {
        return this.customerRepository.findAll();
    }

    @Override
    public CustomerDto getCustomersById(String id) throws IOException {
        return this.customerRepository.findById(id).orElseThrow(() -> new RuntimeException(
                String.format("Cannot Find Customer by id %s", id)));
    }

    @Override
    public CustomerDto getCustomersByName(String firstName) throws IOException {
        return customerRepository.findbyName(firstName)
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot Find Customer by Name %s", firstName)));
    }

    @Override
    public CustomerDto createCustomers(CustomerDto customerDto) throws IOException {
        return this.customerRepository.insert(customerDto);
    }

    @Override
    public CustomerDto updateCustomer (CustomerDto customerDto) throws IOException {
        CustomerDto savedCustomer = customerRepository.findById(customerDto.getId())
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot Find Customer by Id %s", customerDto.getId())));
        savedCustomer.setFirstName(customerDto.getFirstName());
        savedCustomer.setLastName(customerDto.getLastName());
        savedCustomer.setNickname(customerDto.getNickname());
        savedCustomer.setCellphoneNumber(customerDto.getCellphoneNumber());
        savedCustomer.setDateOfBirth(customerDto.getDateOfBirth());
        savedCustomer.setAge(customerDto.getAge());
        savedCustomer.setAddress(customerDto.getAddress());

        customerRepository.save(customerDto);
        return  customerDto;
    }

    @Override
    public void deleteCustomers(String id) throws IOException {
         this.customerRepository.deleteById(id);
    }
}
