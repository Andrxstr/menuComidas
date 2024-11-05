package apiMenu.services;

import apiMenu.domain.Reservation;
import apiMenu.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getReservationsByUserEmail(String reservationEmail){
        return reservationRepository.findByUserEmail(reservationEmail);
    }

    public Reservation saveReservation(Reservation reservation){
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Integer id){
        reservationRepository.deleteById(id);
    }
}
