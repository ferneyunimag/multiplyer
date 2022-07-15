package com.multiply.bigInteger.multiplyer.interfaces.repository;

import com.multiply.bigInteger.multiplyer.domain.entities.ResultOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultiplicationRepository extends JpaRepository<ResultOperation,Integer> {
}
