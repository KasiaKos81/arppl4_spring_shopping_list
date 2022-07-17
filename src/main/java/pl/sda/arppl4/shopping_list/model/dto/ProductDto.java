package pl.sda.arppl4.shopping_list.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.arppl4.shopping_list.model.ProductUnit;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductDto {

    private Long productId;

    private String name;
    private ProductUnit productUnit;
    private LocalDateTime dateAdded;
    private LocalDateTime dateModified;
    private String categoryName;
}
