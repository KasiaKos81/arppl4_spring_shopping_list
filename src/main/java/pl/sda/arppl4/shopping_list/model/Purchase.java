package pl.sda.arppl4.shopping_list.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import pl.sda.arppl4.shopping_list.model.dto.ProductDto;
import pl.sda.arppl4.shopping_list.model.dto.PurchaseDto;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private Double amount;
    private LocalDateTime purchaseDate;
    private String productName;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JsonBackReference
    private Product product;

    public PurchaseDto mapToPurchaseDto() {
        return new PurchaseDto(
                id,
                amount,
                purchaseDate,
                productName
        );
    }
}
