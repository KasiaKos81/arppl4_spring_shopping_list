package pl.sda.arppl4.shopping_list.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoryDto {

    private Long categoryId;

    private String categoryName;
}
