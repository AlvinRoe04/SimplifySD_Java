package com.simplify.ssdbackend.repository.User;
import com.simplify.ssdbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
