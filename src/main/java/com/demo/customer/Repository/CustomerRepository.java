package com.demo.customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.customer.Model.Customer;
//inherits all JPA Repo properties into Customer Repository - First Param - Entity, ID's Datatype
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
