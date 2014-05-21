package lesson4Part2;

import java.util.ArrayList;

/**
 * Created by RomanM on 27.04.2014.
 */
public class Notebook extends Goods{
    private int weight;
    private String name;
    private int size;
    private String characteristics;

    public Notebook(int idOfItem, long price, int weight, String name, int size, String characteristics) {
        super(idOfItem, price);
        this.weight = weight;
        this.name = name;
        this.size = size;
        this.characteristics = characteristics;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}
