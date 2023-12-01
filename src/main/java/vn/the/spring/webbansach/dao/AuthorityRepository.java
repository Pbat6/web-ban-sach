package vn.the.spring.webbansach.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.the.spring.webbansach.entity.Authority;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}
