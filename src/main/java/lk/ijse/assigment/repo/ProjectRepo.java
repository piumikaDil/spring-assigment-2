package lk.ijse.assigment.repo;

import lk.ijse.assigment.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project,String> {
}
