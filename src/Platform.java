public class Platform {
    private  int platformNumber;
    private Train train;

    public Platform(int platformNumber) { //only made constructor of platform obj bcz tarin is not always on platfom
        this.platformNumber = platformNumber;
    }

    public int getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(int platformNumber) {
        this.platformNumber = platformNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platformNumber=" + platformNumber +
                ", train=" + train +
                '}';
    }
}
