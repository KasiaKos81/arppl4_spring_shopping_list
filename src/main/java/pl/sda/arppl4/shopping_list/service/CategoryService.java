package pl.sda.arppl4.shopping_list.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.arppl4.shopping_list.model.Category;
import pl.sda.arppl4.shopping_list.model.Product;
import pl.sda.arppl4.shopping_list.model.dto.CategoryDto;
import pl.sda.arppl4.shopping_list.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
@RequiredArgsConstructor

public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<CategoryDto> getAllCategories() {
        List<Category> categoryList = categoryRepository.findAll();

        List<CategoryDto> categoryDtoList = new ArrayList<>();
        for (Category category : categoryList) {
            categoryDtoList.add(category.mapToCategoryDto());
        }
        return categoryDtoList;

    }

    public void addCategory(Category category, String name) {

    }

    public void deleteById(Long identyfikator) {
        Optional<Category> optionalCategory = categoryRepository.findById(identyfikator);
        if(optionalCategory.isPresent()){
         Category kategoriaDoDelete = optionalCategory.get();
            Set<Product> setOfProducts = optionalCategory.get().getProductSet();
            if(!setOfProducts.isEmpty()) {
                System.out.println("This category cannot be deleted");
            } else {
                categoryRepository.deleteById(identyfikator);
                System.out.println("Category is deleted from database");
            }

            } else {
            System.out.println("No such category");
        }


    }
}
