package com.ms.spring.finalex.controller;

import com.ms.spring.finalex.model.Reservation;
import com.ms.spring.finalex.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation-form";
    }

    @PostMapping("/reservation")
    public String handleForm(@ModelAttribute Reservation reservation, Model model) {
        reservationService.saveReservation(reservation);
        model.addAttribute("message", "Reservation submitted successfully!");
        return "confirmation";
    }

    @GetMapping("/api/reservations")
    @ResponseBody
    public List<Reservation> getAll() {
        return reservationService.getAllReservations();
    }

    @PostMapping("/api/reservations")
    @ResponseBody
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationService.saveReservation(reservation);
    }
}
