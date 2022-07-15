package com.multiply.bigInteger.multiplyer.services;

import com.multiply.bigInteger.multiplyer.domain.MathParameters;
import com.multiply.bigInteger.multiplyer.domain.entities.ResultOperation;
import com.multiply.bigInteger.multiplyer.interfaces.repository.MultiplicationRepository;
import com.multiply.bigInteger.multiplyer.interfaces.service.MultipicationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MultiplicationService  implements MultipicationInterface {
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
        return null;
    }

    @Override
    public void deleteAll() {

    }
}
