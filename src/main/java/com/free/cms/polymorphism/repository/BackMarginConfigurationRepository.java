package com.free.cms.polymorphism.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.free.cms.polymorphism.domain.BackMarginConfiguration;
@Repository
public interface BackMarginConfigurationRepository extends JpaRepository<BackMarginConfiguration, Long>{} 