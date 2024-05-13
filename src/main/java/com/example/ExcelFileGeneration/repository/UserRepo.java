package com.example.ExcelFileGeneration.repository;

import com.example.ExcelFileGeneration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
