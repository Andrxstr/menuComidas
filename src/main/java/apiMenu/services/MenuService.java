package apiMenu.services;

import apiMenu.repository.MenuRepository;
import apiMenu.domain.Menu;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    // Obtener todos los elementos del menú
    public List<Menu> getAllMenu() {
        return menuRepository.findAll();
    }

    // Obtener un elemento del menú por ID
    public Menu getMenuById(Integer id) {
        return menuRepository.findById(id).orElse(null);
    }

    // Agregar un nuevo elemento al menú
    public Menu saveMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    // Eliminar un elemento del menú por ID
    public void deleteMenu(Integer id) {
        menuRepository.deleteById(id);
    }
}
