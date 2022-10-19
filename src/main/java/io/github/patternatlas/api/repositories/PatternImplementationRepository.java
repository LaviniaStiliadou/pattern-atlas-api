package io.github.patternatlas.api.repositories;

import io.github.patternatlas.api.entities.PatternImplementation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(exported = false)
public interface PatternImplementationRepository extends CrudRepository<PatternImplementation, UUID> {

}
