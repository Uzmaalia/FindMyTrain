import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {
        TrainSystem system=new TrainSystem();

        //adding new stations
        Station station1 = new Station("St01" , "Agra");
        Station station2 = new Station("St02", "Delhi");
//        Station station3 = new Station("St03", "Mumbai");
//        Station station4 = new Station("St04", "Jaipur");
//        Station station5 = new Station("St05", "Chennai");
//        Station station6 = new Station("St06", "Kolkata");

        //adding new train
        Train train1 = new Train("TR01","Shatabdi","Express");
        Train train2 = new Train("TR02", "Rajdhani", "Express");
//        Train train3 = new Train("TR03", "Duronto", "Superfast");
//        Train train4 = new Train("TR04", "Garib Rath", "Express");
//        Train train5 = new Train("TR05", "Intercity", "Passenger");
//        Train train6 = new Train("TR06", "Jan Shatabdi", "Superfast");

        Platform p1 = new Platform(1);
        Platform p2 = new Platform(2);
//        Platform p3 = new Platform(3);
//        Platform p4 = new Platform(6);
//        Platform p5 = new Platform(2);
//        Platform p6 = new Platform(5);

        p1.setTrain(train1);
        p2.setTrain(train2);
//        p3.setTrain(train3);
//        p4.setTrain(train4);
//        p5.setTrain(train5);
//        p6.setTrain(train6);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);
//        platformList.add(p3);
//        platformList.add(p4);
//        platformList.add(p5);
//        platformList.add(p6);

        station1.setPlatformList(platformList);


        Schedule s1 = new Schedule(train1,station1,"9AM","9:05AM",p1);
        Schedule s2 = new Schedule(train1,station2,"9AM","9:05AM",p2);

        system.addStations(station1);
        system.addStations(station2);
        system.addTrains(train1);
        system.addTrains(train2);
        system.addSchedules(s1);
        system.addSchedules(s2);

        //finding out train between stations
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the source : ");
        String source = sc.nextLine();
        System.out.println("enter the destination : ");
        String des = sc.nextLine();
        List<Schedule> myTrain = system.findMyTrain(source,des);
        System.out.println("your train between "+source+" and destination "+des);
        Schedule schedule = myTrain.get(0);
        Train train = schedule.getTrain();
        System.out.println(train);
//        System.out.println(myTrain.get(0));


    }
}