package pl.sda.arppl4.shopping_list.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UtilizationDto {

    private Long utilizationId;

    private Double amount;
    private LocalDateTime utilizationDate;
    private String productName;
}
