package apiMenu.controllers;

import apiMenu.domain.Menu;
import apiMenu.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    // Obtener todos los elementos del menú
    @GetMapping
    public List<Menu> getAllMenuItems() {
        return menuService.getAllMenu();
    }

    // Obtener un elemento del menú por ID
    @GetMapping("/{id}")
    public Menu getMenuById(@PathVariable Integer id) {
        return menuService.getMenuById(id);
    }

    // Crear un nuevo elemento del menú
    /*@PostMapping
    public Menu createMenuItem(@RequestBody Menu menu) {
        return menuService.saveMenu(menu);
    }*/

    @PostMapping
    public ResponseEntity<?> createMenuItem(@RequestBody Menu menu) {
        Menu createdItem = menuService.saveMenu(menu);
        return ResponseEntity.status(201).body(createdItem);
    }

    // Eliminar un elemento del menú por ID
    @DeleteMapping("/{id}")
    public void deleteMenu(@PathVariable Integer id) {
        menuService.deleteMenu(id);
    }
}
