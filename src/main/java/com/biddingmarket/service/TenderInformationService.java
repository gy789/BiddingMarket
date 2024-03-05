package com.biddingmarket.service;

import com.biddingmarket.entity.TenderInformation;

import java.util.List;

public interface TenderInformationService {
    List<TenderInformation> getAllTenderInformation();
    TenderInformation selectByPrimaryKey(Integer id);

    int insert(TenderInformation record);

    int insertSelective(TenderInformation record);

    int updateTenderInformation(int id,TenderInformation tenderInformation);

    int deleteTenderInformation(int id);
}
