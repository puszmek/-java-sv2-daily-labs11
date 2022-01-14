package day04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private List<Item> items = new ArrayList<>();
    private int money;
    private static final int EXTENDED_WARRANTY_FACTOR = 3;
    private static final double EXTENDED_WARRANTY_PRICE_FACTOR = 1.1;

    public User(String userName, int money) {
        this.userName = userName;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getMoney() {
        return money;
    }

    public void addItem(Item item) {
        if (item instanceof Product) {
            item = new Product(item.getName(), item.getPrice());
        } else {
            item = new Service(item.getName(), item.getPrice());
        }

        if (item instanceof Product && hasEnoughMoneyForExtendedWarranty(item)) {
            items.add(item);
            item.setExpiryDate(LocalDate.now());
            ((Product) item).extendExpiryDate();
        } else if (hasEnoughMoney(item)) {
            items.add(item);
            item.setExpiryDate(LocalDate.now());
        } else {
            throw new IllegalArgumentException("Not enough money!");
        }
    }

    private boolean hasEnoughMoney(Item item) {
        if (money >= item.getPrice()) {
            money -= item.getPrice();
            return true;
        }
        return false;
    }

    private boolean hasEnoughMoneyForExtendedWarranty(Item item) {
        if (money >= item.getPrice() * EXTENDED_WARRANTY_FACTOR) {
            money -= item.getPrice() * EXTENDED_WARRANTY_PRICE_FACTOR;
            return true;
        }
        return false;
    }
}
