package com.multiply.bigInteger.multiplyer.interfaces.service;

import com.multiply.bigInteger.multiplyer.domain.MathParameters;
import com.multiply.bigInteger.multiplyer.domain.entities.ResultOperation;

import java.util.List;

public interface MultipicationInterface {
    /*
    * this method is used to save a result
     */
    void saveResult(ResultOperation resultOperation);

    /*
    * This method is used to verify that an equal operation does not  exist in the database
     */

    boolean getMatches(ResultOperation resultOperation);

    /*
    *This method is used to ger all operations saved  in the database
     */
    List<ResultOperation> getAllOperations();

    /*
    * This method is used to delete all data on table Results on database
     */
    void deleteAll();


}
