package vn.the.spring.webbansach.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.the.spring.webbansach.entity.Authority;
import vn.the.spring.webbansach.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
