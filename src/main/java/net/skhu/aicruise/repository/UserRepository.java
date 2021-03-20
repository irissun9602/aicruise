package net.skhu.aicruise.repository;

import net.skhu.aicruise.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
