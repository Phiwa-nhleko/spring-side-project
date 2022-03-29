package za.co.myapplication.example.services.customers.impl;

import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;
import za.co.myapplication.example.domain.dtos.customer.CustomerDto;
import za.co.myapplication.example.services.customers.CustomerService;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.google.gson.Gson;

import static za.co.myapplication.example.services.constants.BusinessConstants.FILE_PATH_CUSTOMER;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<CustomerDto> getCustomers() throws IOException {
        return null;
    }

    @Override
    public CustomerDto getCutsomer(String id) throws IOException {
        return null;
    }

    @Override
    public CustomerDto createCutsomer(CustomerDto customerDto) throws IOException {
        return null;
    }

    @Override
    public CustomerDto updateCutsomer(CustomerDto customerDto) throws IOException {
        return null;
    }

    @Override
    public CustomerDto deleteCutsomer(boolean isDeleted) throws IOException {
        return null;
    }
}
