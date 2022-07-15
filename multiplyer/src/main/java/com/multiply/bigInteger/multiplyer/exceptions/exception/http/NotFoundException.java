package com.multiply.bigInteger.multiplyer.exceptions.exception.http;

import com.multiply.bigInteger.multiplyer.exceptions.GeneralException;

import java.time.ZonedDateTime;

public class NotFoundException extends GeneralException {
    public NotFoundException(String code, String message, String path, ZonedDateTime timeStamp) {
        super(code,message, path, timeStamp);
    }
}
