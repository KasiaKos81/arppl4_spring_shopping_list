package pl.sda.arppl4.shopping_list.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import pl.sda.arppl4.shopping_list.model.dto.CategoryDto;
import pl.sda.arppl4.shopping_list.model.dto.UtilizationDto;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Utilization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private Double amount;
    private LocalDateTime utilizationDate;
    private String productName;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JsonBackReference
    private Product product;

    public UtilizationDto mapToUtilizationDto() {
        return new UtilizationDto(
                id,
                amount,
                utilizationDate,
                productName
        );
    }

}
