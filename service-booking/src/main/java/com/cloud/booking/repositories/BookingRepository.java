package com.cloud.booking.repositories;

import com.cloud.booking.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByUserId(long userId);
}
