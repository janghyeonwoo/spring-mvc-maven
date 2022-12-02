package project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.entity.Board;

import java.util.List;


public interface BoardRepository extends JpaRepository<Board, Long> {

}
