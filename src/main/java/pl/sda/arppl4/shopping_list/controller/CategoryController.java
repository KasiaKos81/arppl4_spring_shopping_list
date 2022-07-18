package pl.sda.arppl4.shopping_list.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.sda.arppl4.shopping_list.model.Category;
import pl.sda.arppl4.shopping_list.model.dto.CategoryDto;
import pl.sda.arppl4.shopping_list.service.CategoryService;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/category")

public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/getAll")
    public List<CategoryDto> getAllCategories() {
        log.info("This method displays list of all categories");
        List<CategoryDto> listOfAllCategories = categoryService.getAllCategories();
        return listOfAllCategories;
    }

    @DeleteMapping("/deleteCategory{identifier}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable(name="identifier") Long identyfikator){
        log.info("This method allows to delete a category");
        categoryService.deleteById(identyfikator);
    }

    @PostMapping("/addCategory")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCategory(@RequestBody Category category, String name){
        log.info("This method allows to add category");
        categoryService.addCategory(category, name);

    }




}
