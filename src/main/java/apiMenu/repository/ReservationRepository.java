package apiMenu.repository;

import apiMenu.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository <Reservation, Integer> {
    List<Reservation> findByUserEmail(String reservationEmail);
}