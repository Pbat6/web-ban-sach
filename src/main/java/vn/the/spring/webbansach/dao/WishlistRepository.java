package vn.the.spring.webbansach.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import vn.the.spring.webbansach.entity.Authority;
import vn.the.spring.webbansach.entity.Wishlist;

@RepositoryRestResource(path = "wishlists")
public interface WishlistRepository extends JpaRepository<Wishlist, Integer> {
}
