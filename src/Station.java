import java.util.ArrayList;
import java.util.List;

public class Station {
    private String StationID;
    private String StationName;
    private List<Platform> platformList;

    public Station(String stationID, String stationName) { //made station platform independent bcz may be no platform is free for the train
        StationID = stationID;
        StationName = stationName;
        this.platformList = new ArrayList<>(); //making place for platform on station
    }

    public String getStationID() {
        return StationID;
    }

    public void setStationID(String stationID) {
        StationID = stationID;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String stationName) {
        StationName = stationName;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "StationID='" + StationID + '\'' +
                ", StationName='" + StationName + '\'' +
                ", platformList=" + platformList +
                '}';
    }
}
