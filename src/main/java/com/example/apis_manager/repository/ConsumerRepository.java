package com.example.apis_manager.repository;

import com.example.apis_manager.entities.Consumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsumerRepository extends JpaRepository<Consumer , Long> {
    void deleteByIdConsumer(Long id);
    Consumer getConsumerByName(String name);
}
