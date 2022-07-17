package pl.sda.arppl4.shopping_list.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.arppl4.shopping_list.service.CategoryService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/category")

public class CategoryController {

    private final CategoryService categoryService;


}
