package com.multiply.bigInteger.multiplyer.application.layer.services;

import com.multiply.bigInteger.multiplyer.application.layer.services.domain.ProductOperation;
import com.multiply.bigInteger.multiplyer.application.layer.services.domain.entities.ResultOperation;
import com.multiply.bigInteger.multiplyer.application.layer.services.domain.valueObjects.StringValueObject;
import com.multiply.bigInteger.multiplyer.application.interfaces.service.OperatorInterface;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class OperatorService implements OperatorInterface {

    /*
     * First step is create an instance of
     */
    @Override
    public ResultOperation calulator(String number1, String number2) {


        ProductOperation productOperation = new ProductOperation(number1, number2, "*");
        BigInteger bigNumber1 = new BigInteger(productOperation.getNum1().getValue());
        BigInteger bigNumber2 = new BigInteger(productOperation.getNum2().getValue());
        BigInteger result = bigNumber1.multiply(bigNumber2);
        productOperation.setResult(new StringValueObject(result.toString()));
        return new ResultOperation(productOperation);


    }
}
