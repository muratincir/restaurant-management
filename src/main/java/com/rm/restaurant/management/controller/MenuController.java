package com.rm.restaurant.management.controller;

import com.rm.restaurant.management.model.Menu;
import com.rm.restaurant.management.service.abstracts.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/menu")
@Api(tags = "Menü Controller", description = "API TEST")
public class MenuController {
    private MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/get")
    @ApiOperation(value = "Get example data", notes = "Returns example data")
    public List<Menu> getAllMenu(){
        return menuService.getAllMenu();
    }

    @GetMapping("/{menuId}")
    public Menu getOneMenu(@PathVariable Long menuId){
        return menuService.getOneMenu(menuId);
    }

    @PostMapping
    public Menu createOneMenu(@RequestBody Menu newMenu){
        return menuService.createOneMenu(newMenu);
    }

    @PutMapping("/update/{menuId}")
    public Menu updateOneMenu(@PathVariable Long menuId,@RequestBody Menu newUpdateMenu){
        return menuService.updateOneMenu(menuId,newUpdateMenu);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAllMenu(){
        menuService.deleteAllMenu();
        return ResponseEntity.ok("Tüm menüler başarıyla silinmiştir.");
    }

    @DeleteMapping("/delete/{menuId}")
    public ResponseEntity<?> deleteOneMenu(@PathVariable Long menuId){
        menuService.deleteOneMenu(menuId);
        return ResponseEntity.ok( "Id'si verilen menü başarıyla silinmiştir.");
    }

}
