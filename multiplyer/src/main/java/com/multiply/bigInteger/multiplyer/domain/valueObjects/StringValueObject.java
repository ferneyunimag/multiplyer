package com.multiply.bigInteger.multiplyer.domain.valueObjects;

import com.multiply.bigInteger.multiplyer.exceptions.exception.domain.IsNullValueException;
import com.multiply.bigInteger.multiplyer.exceptions.exception.domain.MalformedException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.ZonedDateTime;

@Getter
@ToString
public class StringValueObject {

    private String value;

    public StringValueObject(String value) {
        validate(value);
        this.value = value;
    }

    private void validate(String value) {
        if (value.isEmpty()) {
            throw new IsNullValueException("0001", "the string cannot be null or emtpy", "", ZonedDateTime.now());
        } else if (!(value.matches("[0,9]+]"))) {
            throw new MalformedException("0002", "the string contain invalid characters, you must only use numeric characters", "", ZonedDateTime.now());
        }


    }


}
