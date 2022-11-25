package com.free.cms.polymorphism.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.free.cms.polymorphism.domain.UmeConfiguration;
@Repository
public interface UmeConfigurationRepository extends JpaRepository<UmeConfiguration, Long>{} 