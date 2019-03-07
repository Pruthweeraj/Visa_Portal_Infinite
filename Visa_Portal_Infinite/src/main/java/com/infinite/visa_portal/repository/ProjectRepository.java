package com.infinite.visa_portal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infinite.visa_portal.entity.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long>{

}
