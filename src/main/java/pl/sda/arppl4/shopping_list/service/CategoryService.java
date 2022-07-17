package pl.sda.arppl4.shopping_list.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.sda.arppl4.shopping_list.repository.CategoryRepository;

@Slf4j
@Service
@RequiredArgsConstructor

public class CategoryService {

    private final CategoryRepository categoryRepository;
}
