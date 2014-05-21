package lesson4Part2;

import java.util.ArrayList;

/**
 * Created by RomanM on 27.04.2014.
 */
public class Shop {
    private String nameOfShop;
    private ArrayList<Goods> goodsInShop;

    public Shop(String nameOfShop, ArrayList<Goods> goodsInShop) {
        this.nameOfShop = nameOfShop;
        this.goodsInShop = goodsInShop;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public void setNameOfShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    public ArrayList<Goods> getGoodsInShop() {
        return goodsInShop;
    }

    public void setGoodsInShop(ArrayList<Goods> goodsInShop) {
        this.goodsInShop = goodsInShop;
    }

    public long collectSummaryPrice(){
        long summaryPrice = 0l;
        for (int i = 0; i < goodsInShop.size(); i++) {
            summaryPrice += goodsInShop.get(i).getPrice();
        }
        return summaryPrice;
    }

    public void removeGoodsWithPriceInBorder(int minPrice, int maxPrice){
        for (int i = 0; i < getGoodsInShop().size(); i++) {
            if ((getGoodsInShop().get(i).getPrice() >= minPrice)
                    && (getGoodsInShop().get(i).getPrice() <= maxPrice)){
                getGoodsInShop().remove(i);
                i = i-1;
            }
        }
    }
	
    public Car findCostCar() {
        int idOfHeightCostCar = 0;
        int j = 0;
        while ((j < getGoodsInShop().size()) && (idOfHeightCostCar == 0)){
            if(getGoodsInShop().get(j) instanceof Car) {
                idOfHeightCostCar = j;
            }
            j++;
        }

        for (int i = 0; i < goodsInShop.size(); i++) {
            if(goodsInShop.get(i) instanceof Car) {
                if (goodsInShop.get(i).getPrice() > goodsInShop.get(idOfHeightCostCar).getPrice()){
                    idOfHeightCostCar = i;
                }
            }
        }
        return (Car)goodsInShop.get(idOfHeightCostCar);
    }

    public void createListForOutPut(){

        for (int i = 0; i < goodsInShop.size(); i++) {
            String[] cls = goodsInShop.get(i).getClass().toString().split("\\.");
            String cl = cls[cls.length - 1];
                    System.out.println("Id of item: " + goodsInShop.get(i).getIdOfItem() + ", " +
            "Type of item: " + cl + ", " + "Price of item: " + goodsInShop.get(i).getPrice());
        }
    }
}
