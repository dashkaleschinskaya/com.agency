package com.agency.repository;

import com.agency.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findAllByFoodId(Long id, Pageable pageable);
    Optional<Comment> findByAccount_IdAndFoodId(Long accountId,Long foodId);
    Long countByFoodId(Long foodId);

}
