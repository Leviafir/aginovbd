package com.example.aginovbd.interfaces;

import com.example.aginovbd.entities.BooksDelivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksDeliveryRepository extends JpaRepository<BooksDelivery, Long> {
}
