package com.rm.restaurant.management.service.abstracts;

import com.rm.restaurant.management.dto.MenuDto;
import com.rm.restaurant.management.model.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> getAllMenu();

    Menu getOneMenu(Long menuId);

    Menu createOneMenu(Menu newMenu);

    Menu updateOneMenu(Long menuId, Menu newUpdateMenu);

    void deleteAllMenu();

    void deleteOneMenu(Long menuId);
}
