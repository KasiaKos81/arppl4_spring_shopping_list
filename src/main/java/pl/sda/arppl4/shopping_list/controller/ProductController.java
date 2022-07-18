package pl.sda.arppl4.shopping_list.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.arppl4.shopping_list.model.dto.ProductDto;
import pl.sda.arppl4.shopping_list.service.ProductService;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/product")

public class ProductController {

    private final ProductService productService;

    @GetMapping("/getAllProducts")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductDto> getAllProducts(){
        log.info("Get the list of all products");
        List<ProductDto> listOfProducts = productService.getAllProducts();
        return listOfProducts;

    }
}
