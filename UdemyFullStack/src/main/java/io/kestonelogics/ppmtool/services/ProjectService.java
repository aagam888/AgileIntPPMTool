package io.kestonelogics.ppmtool.services;

import io.kestonelogics.ppmtool.domain.Project;
import io.kestonelogics.ppmtool.exceptions.ProjectIdException;
import io.kestonelogics.ppmtool.repositories.ProjectRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepositories projectRepositories;

    public Project saveOrUpdateProject(Project project){
        //logic
        try{
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepositories.save(project);
        }
        catch (Exception e){
            throw new ProjectIdException("Project ID '"+project.getProjectIdentifier().toUpperCase()+"' Already exists");
        }

    }

    public Project findProjectByIdentifier(String projectId){

        Project project = projectRepositories.findByProjectIdentifier(projectId.toUpperCase());
        if(project==null){
            throw new ProjectIdException("Project ID '"+projectId+"' doesnt exists");
        }

        return project;
    }

}
