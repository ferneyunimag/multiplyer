package com.multiply.bigInteger.multiplyer.exceptions.exception.http;

import com.multiply.bigInteger.multiplyer.exceptions.GeneralException;

import java.time.ZonedDateTime;

public class BadRequestException extends GeneralException {
    public BadRequestException(String code,String message, String path, ZonedDateTime timeStamp) {
        super(code,message, path, timeStamp);
    }
}
