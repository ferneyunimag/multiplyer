package com.multiply.bigInteger.multiplyer.exceptions.handler;


import com.multiply.bigInteger.multiplyer.exceptions.GeneralException;
import com.multiply.bigInteger.multiplyer.exceptions.exception.domain.MalformedException;
import com.multiply.bigInteger.multiplyer.exceptions.exception.http.BadRequestException;
import com.multiply.bigInteger.multiplyer.exceptions.exception.http.ForbiddenException;
import com.multiply.bigInteger.multiplyer.exceptions.exception.http.NotFoundException;
import com.multiply.bigInteger.multiplyer.exceptions.exception.http.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ApiExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            MalformedException.class,
            HttpRequestMethodNotSupportedException.class,
            MethodArgumentNotValidException.class,
            MissingServletRequestParameterException.class,
            MethodArgumentTypeMismatchException.class,
            HttpMessageNotReadableException.class})
    @ResponseBody
    public ErrorMessage badRequest(HttpServletRequest request, BadRequestException e) {
        return new ErrorMessage(e, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({UnauthorizedException.class})
    public void unauthorized(HttpServletRequest request, UnauthorizedException e) {
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({})
    @ResponseBody
    public ErrorMessage notFound(HttpServletRequest request, NotFoundException e) {
        return new ErrorMessage(e, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler({ForbiddenException.class
            })
    @ResponseBody
    public ErrorMessage forbidden(HttpServletRequest request, ForbiddenException e) {
        return new ErrorMessage(e, request.getRequestURI());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ErrorMessage fatalErrorException(HttpServletRequest request, Throwable e) {
        return new ErrorMessage((GeneralException) e, request.getRequestURI());
    }


}
