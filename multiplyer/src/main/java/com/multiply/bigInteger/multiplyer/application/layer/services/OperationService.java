package com.multiply.bigInteger.multiplyer.application.layer.services;

import com.multiply.bigInteger.multiplyer.application.layer.services.domain.entities.ResultOperation;
import com.multiply.bigInteger.multiplyer.application.interfaces.repository.MultiplicationRepository;
import com.multiply.bigInteger.multiplyer.application.interfaces.service.MultipicationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OperationService implements MultipicationInterface {
    @Autowired
    MultiplicationRepository multiplicationRepository;

    @Override
    @Transactional
    public void saveResult(ResultOperation resultOperation) {
        multiplicationRepository.save(resultOperation);
    }

    @Override
    public boolean getMatches(ResultOperation resultOperation) {

        return false;
    }

    @Override
    public List<ResultOperation> getAllOperations() {
        return multiplicationRepository.findAll();
    }

    @Override
    public void deleteAll() {
        multiplicationRepository.deleteAll();
    }
}
