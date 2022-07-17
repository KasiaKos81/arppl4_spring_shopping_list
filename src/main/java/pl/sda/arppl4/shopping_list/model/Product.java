package pl.sda.arppl4.shopping_list.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import pl.sda.arppl4.shopping_list.model.dto.ProductDto;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;
    private ProductUnit productUnit;
    private LocalDateTime dateAdded;
    private LocalDateTime dateModified;
    private String categoryName;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    private Set<Purchase> purchaseSet;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    private Set<Utilization> utilizationSet;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JsonBackReference
    private Category category;

    public ProductDto mapToProductDto() {
        return new ProductDto(
                id,
                name,
                productUnit,
                dateAdded,
                dateModified,
                categoryName
        );
    }

}
