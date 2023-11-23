package tns.ShopOwner.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import tns.ShopOwner.entity.shopowner;
public interface shopownerrepository extends JpaRepository<shopowner, Integer> {
}