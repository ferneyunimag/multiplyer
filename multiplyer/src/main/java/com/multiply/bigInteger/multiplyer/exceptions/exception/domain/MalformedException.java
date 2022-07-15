package com.multiply.bigInteger.multiplyer.exceptions.exception.domain;

import com.multiply.bigInteger.multiplyer.exceptions.GeneralException;

import java.time.ZonedDateTime;

public class MalformedException extends GeneralException {
    public MalformedException(String Code, String message, String path, ZonedDateTime timeStamp) {
        super(Code, message, path, timeStamp);
    }
}
