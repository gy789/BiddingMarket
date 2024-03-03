package com.biddingmarket.service.impl;

import com.biddingmarket.entity.Menu;
import com.biddingmarket.mapper.MenuMapper;
import com.biddingmarket.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

    @Autowired(required = false)
    private MenuMapper menuMapper;
    @Override
    public List<Menu> getMenuList() {
        return menuMapper.getMenuList();
    }

    @Override
    public int addMenu(Menu menu) {
        return menuMapper.addMenu(menu);
    }

    @Override
    public int deleteMenu(String menu_name) {
        return menuMapper.deleteMenu(menu_name);
    }
}
