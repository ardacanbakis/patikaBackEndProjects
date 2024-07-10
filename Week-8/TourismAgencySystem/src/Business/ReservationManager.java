package Business;

import Dao.ReservationDao;
import Entity.Reservation;
import java.util.List;

public class ReservationManager {
    private final ReservationDao reservationDao;

    public ReservationManager() {
        reservationDao = new ReservationDao();
    }

    public List<Reservation> getAllReservations() {
        return reservationDao.findAll();
    }

    public boolean addReservation(Reservation reservation) {
        return reservationDao.addReservation(reservation);
    }

    public boolean updateReservation(Reservation reservation) {
        return reservationDao.updateReservation(reservation);
    }

    public boolean deleteReservation(int reservationId) {
        return reservationDao.deleteReservation(reservationId);
    }
}
