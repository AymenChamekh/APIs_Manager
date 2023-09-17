package com.example.apis_manager.repository;

import com.example.apis_manager.entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider , Long> {
    void deleteByIdProvider(Long id);
}
