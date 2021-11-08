package com.example.springbootapi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "personnes", path = "people")
public interface PersonnesRepository extends CrudRepository<Personnes, Long> {
    List<Personnes> findPersonnesBy(long id);
}
