package Business;

import Dao.SeasonDao;
import Entity.Season;
import java.util.List;

public class SeasonManager {
    private SeasonDao seasonDao;

    public SeasonManager() {
        seasonDao = new SeasonDao();
    }

    public List<Season> getAllSeasons() {
        return seasonDao.findAll();
    }

    public boolean addSeason(Season season) {
        // Validate season data
        return seasonDao.addSeason(season);
    }

    public boolean updateSeason(Season season) {
        // Validate season data
        return seasonDao.updateSeason(season);
    }

    public boolean deleteSeason(int seasonId) {
        return seasonDao.deleteSeason(seasonId);
    }
}
