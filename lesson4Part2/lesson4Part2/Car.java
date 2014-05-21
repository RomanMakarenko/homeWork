package lesson4Part2;

/**
 * Created by RomanM on 27.04.2014.
 */
public class Car extends Goods {
    private String modelName;
    private int maxSpeed;
    private int volumeOfEngine;
    private int weight;

    public Car(int idOfItem, long price, String modelName, int maxSpeed, int volumeOfEngine, int weight) {
        super(idOfItem, price);
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
        this.volumeOfEngine = volumeOfEngine;
        this.weight = weight;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public void setVolumeOfEngine(int volumeOfEngine) {
        this.volumeOfEngine = volumeOfEngine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
