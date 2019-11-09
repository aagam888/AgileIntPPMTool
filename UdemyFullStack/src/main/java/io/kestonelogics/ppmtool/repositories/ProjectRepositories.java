package io.kestonelogics.ppmtool.repositories;

import io.kestonelogics.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepositories extends CrudRepository<Project,Long> {

    @Override
    Iterable<Project> findAllById(Iterable<Long> iterable);
}
