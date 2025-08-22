public class Train {
    private String TrainID;
    private String TrainName;
    private String type; //passenger or goods train

    //constructor
    public Train(String trainID, String trainName, String type) {
        TrainID = trainID;
        TrainName = trainName;
        this.type = type;
    }

    //getter setter --> to access private field outside
    public String getTrainID() {
        return TrainID;
    }

    public void setTrainID(String trainID) {
        TrainID = trainID;
    }

    public String getTrainName() {
        return TrainName;
    }

    public void setTrainName(String trainName) {
        TrainName = trainName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //to get value of object override toString method
    @Override
    public String toString() {
        return "Main{" +
                "TrainID='" + TrainID + '\'' +
                ", TrainName='" + TrainName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
