package io.kestonelogics.ppmtool.services;

import io.kestonelogics.ppmtool.domain.Project;
import io.kestonelogics.ppmtool.repositories.ProjectRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepositories projectRepositories;

    public Project saveOrUpdateProject(Project project){
        //logic
        return projectRepositories.save(project);
    }

}
