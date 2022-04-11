package za.co.myapplication.example.repositories.customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import za.co.myapplication.example.domain.dtos.customer.CustomerDto;

import java.util.Optional;


@Repository
public interface CustomerDao extends MongoRepository<CustomerDto, String> {


    @Query("{'firstName': ?0}")
    public Optional<CustomerDto> findbyName(String name);

}
