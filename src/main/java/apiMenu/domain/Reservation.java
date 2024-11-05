package apiMenu.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String reservationUserName;
    private String userEmail;
    private Long reservationPhone;
    private LocalDateTime reservationDate;

    @ManyToOne
    @JoinColumn(name="menu_id")
    private Menu menu;

    public Reservation(){}


    public Reservation(Integer id, String reservationUserName, String userEmail, Long reservationPhone, LocalDateTime reservationDate, Menu menu) {
        this.id = id;
        this.reservationUserName = reservationUserName;
        this.userEmail = userEmail;
        this.reservationPhone = reservationPhone;
        this.reservationDate = reservationDate;
        this.menu = menu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReservationUserName() {
        return reservationUserName;
    }

    public void setReservationUserName(String reservationUserName) {
        this.reservationUserName = reservationUserName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getReservationPhone() {
        return reservationPhone;
    }

    public void setReservationPhone(Long reservationPhone) {
        this.reservationPhone = reservationPhone;
    }

    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
