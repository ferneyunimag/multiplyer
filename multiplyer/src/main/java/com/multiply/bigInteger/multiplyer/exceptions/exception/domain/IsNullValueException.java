package com.multiply.bigInteger.multiplyer.exceptions.exception.domain;

import com.multiply.bigInteger.multiplyer.exceptions.exception.http.BadRequestException;

import java.time.ZonedDateTime;

public class IsNullValueException extends BadRequestException {


    public IsNullValueException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code, message, path, timeStamp);
    }
}
