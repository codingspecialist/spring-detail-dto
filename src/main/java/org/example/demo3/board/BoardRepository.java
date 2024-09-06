package org.example.demo3.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

// CRUD 메서드를 제공!!
public interface BoardRepository extends JpaRepository<Board, Integer> {

    @Query(value = "select b from Board b left join fetch b.replies where b.id=:id")
    Optional<Board> mFindById(@Param("id") Integer id);
}
