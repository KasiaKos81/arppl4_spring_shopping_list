package pl.sda.arppl4.shopping_list.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.arppl4.shopping_list.controller.ProductController;
import pl.sda.arppl4.shopping_list.model.Product;
import pl.sda.arppl4.shopping_list.model.dto.ProductDto;
import pl.sda.arppl4.shopping_list.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor

public class ProductService {

    private final ProductRepository productRepository;

    public List<ProductDto> getAllProducts() {
        List<Product> productList = productRepository.findAll();

        List<ProductDto> products = new ArrayList<>();
        for (Product product : productList) {
            products.add(product.mapToProductDto());
        }
        return products;

    }
}
