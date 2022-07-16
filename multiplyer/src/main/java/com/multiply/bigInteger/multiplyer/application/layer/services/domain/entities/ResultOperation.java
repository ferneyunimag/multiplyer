package com.multiply.bigInteger.multiplyer.application.layer.services.domain.entities;

import com.multiply.bigInteger.multiplyer.application.layer.services.domain.MathParameters;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table()
public class ResultOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public  String number1;
    public  String number2;
    public  String result;
    public  String operation;

    public ResultOperation(String number1, String number2, String result, String operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
        this.operation = operation;
    }

    public ResultOperation(MathParameters mathParameters) {
        this.number1=mathParameters.getNum1().getValue();
        this.number2=mathParameters.getNum2().getValue();
        this.result = mathParameters.getResult().getValue();
        this.operation=mathParameters.getOperator();
    }

    public ResultOperation() {

    }
}
