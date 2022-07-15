package com.multiply.bigInteger.multiplyer.domain.entities;

import com.multiply.bigInteger.multiplyer.domain.MathParameters;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(schema = "resluts")
public class ResultOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public  String number1;
    public  String number2;
    public  String result;
    public  String operation;

    public ResultOperation(MathParameters mathParameters) {
        this.number1=mathParameters.getNum1().getValue();
        this.number2=mathParameters.getNum2().getValue();
        this.result = mathParameters.getResult().getValue();
        this.operation=mathParameters.getOperation();
    }

    public ResultOperation() {

    }
}
