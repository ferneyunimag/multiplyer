package com.multiply.bigInteger.multiplyer.application.interfaces.repository;

import com.multiply.bigInteger.multiplyer.application.layer.services.domain.entities.ResultOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultiplicationRepository extends JpaRepository<ResultOperation,Integer> {
}
