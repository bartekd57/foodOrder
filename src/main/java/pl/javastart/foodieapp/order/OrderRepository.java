package pl.javastart.foodieapp.order;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.javastart.foodieapp.item.Item;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByStatus(OrderStatus status);

}
