package pl.karwsz.FocusProjectManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.karwsz.FocusProjectManager.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
