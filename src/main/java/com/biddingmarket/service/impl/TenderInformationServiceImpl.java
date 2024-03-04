package com.biddingmarket.service.impl;

import com.biddingmarket.entity.TenderInformation;
import com.biddingmarket.mapper.TenderInformationMapper;
import com.biddingmarket.service.TenderInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "tenderInformationService")
public class TenderInformationServiceImpl implements TenderInformationService {

    @Autowired(required = false)
    private TenderInformationMapper tenderInformationMapper;


    @Override
    public List<TenderInformation> getAllTenderInformation() {
        return tenderInformationMapper.selectAll();
    }

    @Override
    public TenderInformation selectByPrimaryKey(Integer id) {
        return tenderInformationMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(TenderInformation record) {
        return tenderInformationMapper.insert(record);
    }

    @Override
    public int insertSelective(TenderInformation record) {
        return tenderInformationMapper.insertSelective(record);
    }
}
