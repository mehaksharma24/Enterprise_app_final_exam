package com.ms.spring.finalex.repository;

import com.ms.spring.finalex.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}
