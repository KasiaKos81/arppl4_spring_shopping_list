package pl.sda.arppl4.shopping_list.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import pl.sda.arppl4.shopping_list.model.dto.CategoryDto;
import pl.sda.arppl4.shopping_list.model.dto.ProductDto;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    private Set<Product> productSet;

    public CategoryDto mapToCategoryDto() {
        return new CategoryDto(
                id,
                name
        );
    }
}
