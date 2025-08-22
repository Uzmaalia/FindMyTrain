import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {

    //mapping every thing together

    private final Map<String,Station> stations = new HashMap<>();
    private final Map<String,Train> trains = new HashMap<>();
    private final List<Schedule> schedules = new ArrayList<>();

    public void addStations(Station station){
        stations.put(station.getStationID(),station);
    }
    public void addTrains(Train train){
        trains.put(train.getTrainID(),train);
    }
    public void addSchedules(Schedule schedule){
        schedules.add(schedule);
    }

    //train btween stations
    public List<Schedule> findMyTrain(String startStationName,String endStationName){
       List<Schedule> res = new ArrayList<>();
       for (Schedule schedule : schedules) {
           if (schedule.getStation().getStationName().equals(startStationName) || schedule.getStation().getStationName().equals(endStationName)) {
               res.add(schedule);
           }
       }
       return res;
    }
}
