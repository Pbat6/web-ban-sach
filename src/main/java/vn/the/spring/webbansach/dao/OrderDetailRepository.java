package vn.the.spring.webbansach.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import vn.the.spring.webbansach.entity.OrderDetail;

@RepositoryRestResource(path = "orders-detail")
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
