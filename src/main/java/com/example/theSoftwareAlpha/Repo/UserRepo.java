package com.example.theSoftwareAlpha.Repo;

import com.example.theSoftwareAlpha.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long> {
}
