package apiMenu.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String reservationUserName;
    private String userEmail;
    private Long reservationPhone;
    private LocalDateTime reservationDate;

    @ManyToMany
    @JoinTable(
            name = "reservation_menu",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "menu_id")
    )
    private Set<Menu> menus;  // Cambiado a Set para manejar múltiples menús
    public Reservation(){}

    public Reservation(Integer id, String reservationUserName, String userEmail, Long reservationPhone, LocalDateTime reservationDate, Set<Menu> menus) {
        this.id = id;
        this.reservationUserName = reservationUserName;
        this.userEmail = userEmail;
        this.reservationPhone = reservationPhone;
        this.reservationDate = reservationDate;
        this.menus = menus;
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

    public Set<Menu> getMenus() {
        return menus;
    }

    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }
}
