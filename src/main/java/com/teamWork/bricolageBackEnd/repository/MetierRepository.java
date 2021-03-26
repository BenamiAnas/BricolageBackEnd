package com.teamWork.bricolageBackEnd.repository;

import com.teamWork.bricolageBackEnd.models.Metier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("*")
public interface MetierRepository extends JpaRepository<Metier,Long> {

}
