package com.biddingmarket.service;

import com.biddingmarket.entity.People;

import java.util.List;

public interface PeopleService {
    List<People> getPeopleList(int uid);
    int addPeople(People people);
    int delPeople(int people_id);
    People getPeopleInfo(int people_id);
    int updatePeoplieInfo(People people);
}
