package com.free.cms.polymorphism.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.free.cms.polymorphism.domain.Configuration;
@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, Long>{} 