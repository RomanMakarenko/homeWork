package lesson4Part2;

import java.util.ArrayList;

/**
 * Created by RomanM on 27.04.2014.
 */
public class Main {
    public static void main(String[] args){
        Notebook notebook1 = new Notebook(1, 8000, 4, "Asus", 15, "wrgwgrgrgehaf aergeg ergerg2 gqergetg rg ");
        Notebook notebook2 = new Notebook(2, 2000, 12, "Electron", 12, "wefwvwrwrvwrvevbeferefefbefbebeb erge");
        Notebook notebook3 = new Notebook(3, 3400, 3, "Aser", 12, "wefwefwefe efwfwe wefwefw wefefefwefwfwef");

        Car car1 = new Car(12, 98000, "Lanos", 140, 1, 1200);
        Car car2 = new Car(13, 240000, "C4", 180, 2, 1300);
        Car car3 = new Car(14, 200000, "Rio", 160, 2, 1000);

        Potato potato1 = new Potato(22, 12, 3, "Ukraine", "BlueEye");
        Potato potato2 = new Potato(23, 14, 3, "Poland", "Adreta");
        Potato potato3 = new Potato(24, 11, 2, "Holand", "Wert");

        ArrayList<Goods> goodsInShop = new ArrayList<Goods>();
        goodsInShop.add(notebook1);
        goodsInShop.add(notebook2);
        goodsInShop.add(notebook3);
        goodsInShop.add(car1);
        goodsInShop.add(car2);
        goodsInShop.add(car3);
        goodsInShop.add(potato1);
        goodsInShop.add(potato2);
        goodsInShop.add(potato3);

        Shop shop1 = new Shop("rozetka", goodsInShop);

        shop1.createListForOutPut();
        System.out.println("New count of goods = " + shop1.getGoodsInShop().size());

        System.out.println("Summary Price = " + shop1.collectSummaryPrice());
        shop1.removeGoodsWithPriceInBorder(10, 20);

        System.out.println("New count of goods = " + shop1.getGoodsInShop().size());

        System.out.println("Height price car = " + shop1.findCostCar().getModelName() );


    }
}
