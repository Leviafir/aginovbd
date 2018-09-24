package com.example.aginovbd.interfaces;

import com.example.aginovbd.entities.Readers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadersRepository extends JpaRepository<Readers, Long> {
}
