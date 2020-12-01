package com.codeclan.example.SpringRelationshipsLab.repositories;

import com.codeclan.example.SpringRelationshipsLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository <Project, Long > {
}
