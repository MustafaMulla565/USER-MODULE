package com.example.USER_MODULE.Repository;






import com.example.USER_MODULE.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Customer, Long> {
    Customer findByUsername(String username);
}
