package com.rm.restaurant.management.service.concretes;
import com.rm.restaurant.management.model.Menu;
import com.rm.restaurant.management.repository.MenuRepo;
import org.springframework.stereotype.Service;

import com.rm.restaurant.management.dto.MenuDto;
import com.rm.restaurant.management.service.abstracts.MenuService;


import java.util.List;
import java.util.Optional;

@Service
public class MenuManager implements MenuService {

    private MenuRepo menuRepo;

    public MenuManager(MenuRepo menuRepo) {
        this.menuRepo = menuRepo;
    }

    @Override
    public List<Menu> getAllMenu() {
        return menuRepo.findAll();
    }

    @Override
    public Menu getOneMenu(Long menuId) {
        return menuRepo.findById(menuId).orElse(null);
    }

    @Override
    public Menu createOneMenu(Menu newMenu) {
        return menuRepo.save(newMenu);
    }

    @Override
    public Menu updateOneMenu(Long menuId, Menu newUpdateMenu) {
        Optional<Menu> menu = menuRepo.findById(menuId);
        if(menu.isPresent()){
            Menu foundMenu = menu.get();
            foundMenu.setName(newUpdateMenu.getName());
            foundMenu.setDescription(newUpdateMenu.getDescription());
            foundMenu.setPrice(newUpdateMenu.getPrice());
            menuRepo.save(foundMenu);
            return foundMenu;
        }else{
            return null;
        }
    }

    @Override
    public void deleteAllMenu() {
        menuRepo.deleteAll();
    }

    @Override
    public void deleteOneMenu(Long menuId) {
        menuRepo.deleteById(menuId);
    }
}
