package com.ms.spring.finalex.service;

import com.ms.spring.finalex.model.Reservation;
import com.ms.spring.finalex.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repository;

    public Reservation saveReservation(Reservation reservation) {
        return repository.save(reservation);
    }

    public List<Reservation> getAllReservations() {
        return repository.findAll();
    }
}
