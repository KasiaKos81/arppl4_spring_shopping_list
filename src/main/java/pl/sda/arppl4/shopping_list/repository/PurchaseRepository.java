package pl.sda.arppl4.shopping_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.arppl4.shopping_list.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
