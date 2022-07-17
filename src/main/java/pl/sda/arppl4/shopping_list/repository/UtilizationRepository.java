package pl.sda.arppl4.shopping_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.arppl4.shopping_list.model.Utilization;

public interface UtilizationRepository extends JpaRepository<Utilization, Long> {
}
