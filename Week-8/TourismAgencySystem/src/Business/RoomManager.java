package Business;

import Dao.RoomDao;
import Entity.Room;
import java.util.List;

public class RoomManager {
    private RoomDao roomDao;

    public RoomManager() {
        roomDao = new RoomDao();
    }

    public List<Room> getAllRooms() {
        return roomDao.findAll();
    }

    public boolean addRoom(Room room) {
        // Validate room data
        return roomDao.addRoom(room);
    }

    public boolean updateRoom(Room room) {
        // Validate room data
        return roomDao.updateRoom(room);
    }

    public boolean deleteRoom(int roomId) {
        return roomDao.deleteRoom(roomId);
    }
}
