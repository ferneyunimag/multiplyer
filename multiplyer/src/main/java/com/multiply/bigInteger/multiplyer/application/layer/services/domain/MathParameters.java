package com.multiply.bigInteger.multiplyer.application.layer.services.domain;

import com.multiply.bigInteger.multiplyer.application.layer.services.domain.valueObjects.StringValueObject;
import lombok.Getter;
import lombok.Setter;

@Getter
public class MathParameters {
    private StringValueObject num1;
    private StringValueObject num2;
    @Setter
    private StringValueObject result;
    @Setter
    private String operator;

    public MathParameters(String num1, String num2,String operator) {
        this.num1 = new StringValueObject(num1);
        this.num2 = new StringValueObject(num2);
        this.operator= operator;
    }
}
