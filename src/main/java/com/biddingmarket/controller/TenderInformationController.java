package com.biddingmarket.controller;

import com.biddingmarket.entity.TenderInformation;
import com.biddingmarket.service.TenderInformationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tender")
public class TenderInformationController {
    private final TenderInformationService tenderInformationService;

    public TenderInformationController(TenderInformationService tenderInformationService) {
        this.tenderInformationService = tenderInformationService;
    }

    @PostMapping("/getTenderInformationlist")
    public List<TenderInformation> getAllTenderInformation() {
        return tenderInformationService.getAllTenderInformation();
    }

    @GetMapping("/{id}")
    public TenderInformation getTenderInformationById(@PathVariable Integer id) {
        return tenderInformationService.selectByPrimaryKey(id);
    }

    @PostMapping
    public int createTenderInformation(@RequestBody TenderInformation tenderInformation) {
        return tenderInformationService.insertSelective(tenderInformation);
    }

    @PutMapping("/{id}")
    public int updateTenderInformation(@PathVariable int id, @RequestBody TenderInformation tenderInformation) {
        return tenderInformationService.updateTenderInformation(id, tenderInformation);
    }

    @DeleteMapping("/{id}")
    public int deleteTenderInformation(@PathVariable int id) {
        return tenderInformationService.deleteTenderInformation(id);
    }
}
