package com.multiply.bigInteger.multiplyer.application.core.controller;

import com.multiply.bigInteger.multiplyer.application.layer.services.domain.entities.ResultOperation;
import com.multiply.bigInteger.multiplyer.application.interfaces.service.MultipicationInterface;
import com.multiply.bigInteger.multiplyer.application.interfaces.service.OperatorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/operation/product")
public class OperationController {
    @Autowired
    MultipicationInterface multipicationInterface;
    @Autowired
    OperatorInterface operatorInterface;

    @GetMapping(path = "/{number1}/{number2}",produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResultOperation calulateAndSave (@PathVariable String number1, @PathVariable String number2){

        ResultOperation resultOperation=operatorInterface.calulator(number1,number2);

        multipicationInterface.saveResult(resultOperation);
        return resultOperation;

    }

    @GetMapping(path = "/")
    public @ResponseBody List<ResultOperation> gelAll(){
         return multipicationInterface.getAllOperations();
    }

    @DeleteMapping(path = "/")
    public  void  deleteAll(){
        multipicationInterface.deleteAll();
    }




}
