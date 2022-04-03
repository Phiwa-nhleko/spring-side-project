package za.co.myapplication.example.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.co.myapplication.example.domain.dtos.customer.CustomerDto;
import za.co.myapplication.example.services.customers.CustomerService;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/")
    public  ResponseEntity addCustomer(@RequestBody CustomerDto customerDto) throws IOException {
        customerService.createCustomers(customerDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/")
    public ResponseEntity<List<CustomerDto>> getAllCustomers() throws IOException {
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getCustomerId(@PathVariable String id) throws IOException {
        return ResponseEntity.ok(this.customerService.getCustomersById(id));

    }

    @GetMapping("/byName")
    public ResponseEntity<CustomerDto> getCustomerName(@RequestParam String name) throws IOException {
        return ResponseEntity.ok(this.customerService.getCustomersByName(name));
    }

    @PutMapping("/")
    public ResponseEntity updateCustomer(@RequestBody CustomerDto customerDto) throws IOException {
       customerService.updateCustomer(customerDto);
       return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCustomer(@PathVariable String id) throws IOException {
        this.customerService.deleteCustomers(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
