package com.exp.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exp.expense.model.UserRegistration;

@Repository
public interface UserRepo extends  JpaRepository<UserRegistration,Integer> {

}
