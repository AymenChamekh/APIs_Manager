package com.example.apis_manager.repository;

import com.example.apis_manager.entities.Api;
import com.example.apis_manager.entities.Method;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiRepository extends JpaRepository<Api , Long> {


}
