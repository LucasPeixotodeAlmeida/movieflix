package com.lucas.movieflix.repository;

import com.lucas.movieflix.entity.Streaming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamingRepository extends JpaRepository <Streaming, Long> {
}
