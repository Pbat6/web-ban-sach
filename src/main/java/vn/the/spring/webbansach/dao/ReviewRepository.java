package vn.the.spring.webbansach.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.the.spring.webbansach.entity.Authority;
import vn.the.spring.webbansach.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
