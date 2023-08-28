package org.jamz.DocCreatorApp.Repositories;

import org.jamz.DocCreatorApp.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
