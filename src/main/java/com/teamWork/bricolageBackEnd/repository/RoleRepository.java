package com.teamWork.bricolageBackEnd.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamWork.bricolageBackEnd.models.ERole;
import com.teamWork.bricolageBackEnd.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
