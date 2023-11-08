import data.entity.*;
import table.TableDao;
import table.TableSimple;

import java.util.*;

public class Database {

    TableDao<User> userTable = new TableSimple<>(new HashMap<>(), null);
    TableDao<Restaurant> restaurantTable = new TableSimple<>(new HashMap<>(), null);
    TableDao<Plate> plateTable = new TableSimple<>(new HashMap<>(), null);
    TableDao<Receipt> receiptTable = new TableSimple<>(new HashMap<>(), null);
    TableDao<Order> orderTable = new TableSimple<>(new HashMap<>(), null);

    public TableDao<User> getUserTable() {
        return userTable;
    }

    public TableDao<Restaurant> getRestaurantTable() {
        return restaurantTable;
    }

    public TableDao<Plate> getPlateTable() {
        return plateTable;
    }

    public TableDao<Receipt> getReceiptTable() {
        return receiptTable;
    }

    public TableDao<Order> getOrderTable() {
        return orderTable;
    }

    public void insertion() {
        User u01 = new User("Marco", "Rossi", "10-10-2000", "my.mail@mail.com");
        User u02 = new User("Paolo", "Verdi", "10-10-2000", "my.mail@mail.com");
        User u03 = new User("Lucia", "Bravo", "10-10-2000", "my.mail@mail.com");
        User u04 = new User("Carlo", "Belli", "10-10-2000", "my.mail@mail.com");
        User u05 = new User("Jenny", "Rocco", "10-10-2000", "my.mail@mail.com");
        User u06 = new User("Viola", "Stone", "10-10-2000", "my.mail@mail.com");
        User u07 = new User("Patty", "State", "10-10-2000", "my.mail@mail.com");
        User u08 = new User("Betty", "Towns", "10-10-2000", "my.mail@mail.com");
        List<User> us = new ArrayList<>();
        us.add(u01); us.add(u02); us.add(u03); us.add(u04); us.add(u05); us.add(u06); us.add(u07); us.add(u08);
        Restaurant r1 = new Restaurant("R1", "Roma", "my.r@mail.com");
        Restaurant r2 = new Restaurant("R2", "Milano", "my.r@mail.com");
        Restaurant r3 = new Restaurant("R3", "Roma", "my.r@mail.com");
        Restaurant r4 = new Restaurant("R4", "Torino", "my.r@mail.com");
        Restaurant r5 = new Restaurant("R5", "Torino", "my.r@mail.com");
        Restaurant r6 = new Restaurant("R6", "Roma", "my.r@mail.com");
        Restaurant r7 = new Restaurant("R7", "Milano", "my.r@mail.com");
        Restaurant r8 = new Restaurant("R8", "Roma", "my.r@mail.com");
        List<Restaurant> rs = new ArrayList<>();
        rs.add(r1); rs.add(r2); rs.add(r3); rs.add(r4); rs.add(r5); rs.add(r6); rs.add(r7); rs.add(r8);
        Plate p1_1 = new Plate("Pizza", Cuisine.ITALIAN, 4.50, "", r1.getId());
        Plate p1_2 = new Plate("Pasta", Cuisine.ITALIAN, 3.50, "", r1.getId());
        Plate p1_3 = new Plate("Lasagna", Cuisine.ITALIAN, 5.50, "", r1.getId());
        Plate p1_4 = new Plate("Prosciutto", Cuisine.ITALIAN, 2.50, "", r1.getId());
        Plate p2_1 = new Plate("Ramen", Cuisine.JAPANESE, 4.50, "", r2.getId());
        Plate p2_2 = new Plate("Sushi", Cuisine.JAPANESE, 3.50, "", r2.getId());
        Plate p2_3 = new Plate("Tofu", Cuisine.CHINESE, 5.50, "", r2.getId());
        Plate p2_4 = new Plate("Rice", Cuisine.JAPANESE, 2.50, "", r2.getId());
        Plate p3_1 = new Plate("Taco", Cuisine.MEXICAN, 4.50, "", r3.getId());
        Plate p3_2 = new Plate("Tamales", Cuisine.MEXICAN, 3.50, "", r3.getId());
        Plate p3_3 = new Plate("Paella", Cuisine.SPANISH, 5.50, "", r3.getId());
        Plate p3_4 = new Plate("Tortilla", Cuisine.SPANISH, 2.50, "", r3.getId());
        Plate p4_1 = new Plate("Noodles", Cuisine.THAI, 4.50, "", r4.getId());
        Plate p4_2 = new Plate("Samosa", Cuisine.INDIAN, 3.50, "", r4.getId());
        Plate p4_3 = new Plate("Curry", Cuisine.INDIAN, 5.50, "", r4.getId());
        Plate p4_4 = new Plate("Biryani", Cuisine.INDIAN, 2.50, "", r4.getId());
        Plate p5_1 = new Plate("Margherita", Cuisine.ITALIAN, 4.50, "", r5.getId());
        Plate p5_2 = new Plate("Hawaii", Cuisine.ITALIAN, 6.50, "", r5.getId());
        Plate p5_3 = new Plate("Romana", Cuisine.ITALIAN, 5.50, "", r5.getId());
        Plate p5_4 = new Plate("Verdure", Cuisine.ITALIAN, 5.50, "", r5.getId());
        Plate p6_1 = new Plate("Schnitzel", Cuisine.GERMAN, 4.50, "", r6.getId());
        Plate p6_2 = new Plate("Sausage", Cuisine.GERMAN, 6.50, "", r6.getId());
        Plate p6_3 = new Plate("Pretzel", Cuisine.GERMAN, 5.50, "", r6.getId());
        Plate p6_4 = new Plate("Hamburger", Cuisine.GERMAN, 5.50, "", r6.getId());
        Plate p7_1 = new Plate("Fries", Cuisine.AMERICAN, 2.50, "", r7.getId());
        Plate p7_2 = new Plate("BigMac", Cuisine.AMERICAN, 3.50, "", r7.getId());
        Plate p7_3 = new Plate("Mac", Cuisine.AMERICAN, 3.50, "", r7.getId());
        Plate p7_4 = new Plate("Donut", Cuisine.AMERICAN, 2.50, "", r7.getId());
        Plate p8_1 = new Plate("Ratatouille", Cuisine.FRENCH, 7.50, "", r8.getId());
        Plate p8_2 = new Plate("Coq", Cuisine.FRENCH, 8.50, "", r8.getId());
        Plate p8_3 = new Plate("Foie Gras", Cuisine.FRENCH, 8.50, "", r8.getId());
        Plate p8_4 = new Plate("Escargot", Cuisine.FRENCH, 8.50, "", r8.getId());
        List<Plate> ps = new ArrayList<>();
        ps.add(p1_1); ps.add(p1_2); ps.add(p1_3); ps.add(p1_4);
        ps.add(p2_1); ps.add(p2_2); ps.add(p2_3); ps.add(p2_4);
        ps.add(p3_1); ps.add(p3_2); ps.add(p3_3); ps.add(p3_4);
        ps.add(p4_1); ps.add(p4_2); ps.add(p4_3); ps.add(p4_4);
        ps.add(p5_1); ps.add(p5_2); ps.add(p5_3); ps.add(p5_4);
        ps.add(p6_1); ps.add(p6_2); ps.add(p6_3); ps.add(p6_4);
        ps.add(p7_1); ps.add(p7_2); ps.add(p7_3); ps.add(p7_4);
        ps.add(p8_1); ps.add(p8_2); ps.add(p8_3); ps.add(p8_4);
        Receipt rc01_1 = new Receipt(u01.getId(), r1.getId(), "", null, null);
        Receipt rc01_2 = new Receipt(u01.getId(), r2.getId(), "", null, null);
        Receipt rc02_1 = new Receipt(u02.getId(), r1.getId(), "", null, null);
        Receipt rc03_2 = new Receipt(u03.getId(), r2.getId(), "", null, null);
        Receipt rc03_3 = new Receipt(u03.getId(), r3.getId(), "", null, null);
        Receipt rc04_4 = new Receipt(u04.getId(), r4.getId(), "", null, null);
        Receipt rc05_5 = new Receipt(u05.getId(), r5.getId(), "", null, null);
        Receipt rc06_6 = new Receipt(u06.getId(), r6.getId(), "", null, null);
        Receipt rc07_7 = new Receipt(u07.getId(), r7.getId(), "", null, null);
        Receipt rc08_8 = new Receipt(u08.getId(), r8.getId(), "", null, null);
        List<Receipt> rcs = new ArrayList<>();
        rcs.add(rc01_1); rcs.add(rc01_2); rcs.add(rc02_1); rcs.add(rc03_2);
        rcs.add(rc03_3); rcs.add(rc04_4); rcs.add(rc05_5); rcs.add(rc06_6);
        rcs.add(rc07_7); rcs.add(rc08_8);

        Order o01 = new Order(rc01_1.getId(), p1_1.getId());
        Order o02 = new Order(rc01_1.getId(), p1_1.getId());
        Order o03 = new Order(rc01_1.getId(), p1_2.getId());
        Order o04 = new Order(rc01_1.getId(), p1_3.getId());
        Order o05 = new Order(rc01_2.getId(), p2_1.getId());
        Order o06 = new Order(rc02_1.getId(), p1_4.getId());
        Order o07 = new Order(rc03_2.getId(), p2_2.getId());
        Order o08 = new Order(rc03_2.getId(), p2_3.getId());
        Order o09 = new Order(rc03_2.getId(), p2_4.getId());
        Order o10 = new Order(rc03_3.getId(), p3_1.getId());
        Order o11 = new Order(rc04_4.getId(), p4_1.getId());
        Order o12 = new Order(rc04_4.getId(), p4_1.getId());
        Order o13 = new Order(rc05_5.getId(), p5_2.getId());
        Order o14 = new Order(rc05_5.getId(), p5_3.getId());
        Order o15 = new Order(rc05_5.getId(), p5_4.getId());
        Order o16 = new Order(rc06_6.getId(), p6_4.getId());
        Order o17 = new Order(rc06_6.getId(), p6_3.getId());
        Order o18 = new Order(rc07_7.getId(), p7_1.getId());
        Order o19 = new Order(rc08_8.getId(), p8_2.getId());
        List<Order> os = new ArrayList<>();
        os.add(o01); os.add(o02); os.add(o03); os.add(o04);
        os.add(o05); os.add(o06); os.add(o07); os.add(o08); os.add(o09);
        os.add(o11); os.add(o12); os.add(o13); os.add(o14);
        os.add(o15); os.add(o16); os.add(o17); os.add(o18); os.add(o19);
        userTable.insert(us);
        restaurantTable.insert(rs);
        plateTable.insert(ps);
        receiptTable.insert(rcs);
        orderTable.insert(os);
    }

    public void print() {
        userTable.get().forEach(System.out::println);
        System.out.println();
        restaurantTable.get().forEach(System.out::println);
        System.out.println();
        plateTable.get().forEach(System.out::println);
        System.out.println();
        receiptTable.get().forEach(System.out::println);
        System.out.println();
        orderTable.get().forEach(System.out::println);
    }

    public UUID registration(User user) {
        return getUserTable().insert(user).getId();
    }

    public UUID registration(Restaurant restaurant) {
        return getRestaurantTable().insert(restaurant).getId();
    }

    public UUID order(Receipt receipt, Plate plate) {
        return getOrderTable().insert(new Order(receipt.getId(), plate.getId())).getId();
    }

    public List<Plate> menu(Restaurant restaurant) {
        return getPlateTable().get().stream().filter(p -> p.getIdRestaurant().equals(restaurant.getId())).toList();
    }

    public List<Restaurant> restaurantByCuisine(Cuisine cuisine) {
        List<Plate> plates = getPlateTable().get();
        plates.forEach(p -> p.setRestaurant(getRestaurantTable().get(p.getIdRestaurant())));
        return plates.stream().filter(p -> p.getCuisine() == cuisine).map(Plate::getRestaurant).distinct().toList();
    }

    public String stamp(Receipt receipt) {
        List<Order> orders = getOrderTable().get();
        receipt.setUser(getUserTable().get(receipt.getIdUser()));
        receipt.setRestaurant(getRestaurantTable().get(receipt.getIdRestaurant()));
        List<Order> orderMine = orders.stream().filter(o -> o.getIdReceipt().equals(receipt.getId())).toList();
        orderMine.forEach(o -> o.setPlate(getPlateTable().get(o.getIdPlate())));
        List<Plate> platesMine = orderMine.stream().map(Order::getPlate).toList();
        double price = platesMine.stream().map(Plate::getPrice).reduce(Double::sum).orElse(0.00);
        if (price < 20.00) price += 5.25; // prezzo di consegna
        StringBuilder result = new StringBuilder();
        result.append(receipt.getUser()).append('\n');
        result.append(receipt.getRestaurant()).append('\n');
        result.append(receipt.getDue()).append('\n');
        result.append(receipt.getArrive()).append('\n');
        platesMine.forEach(p -> result.append(p).append('\n'));
        result.append("Total:").append(" ").append(price).append('\n');
        return result.toString();
    }

    public String stamps(User user) {
        List<User> users = getUserTable().get();
        List<Receipt> receiptsMine = getReceiptTable().get().stream().filter(o -> o.getIdUser().equals(user.getId())).toList();
        StringBuilder history = new StringBuilder();
        receiptsMine.forEach(r -> history.append(stamp(r)));
        return history.toString();
    }

    public void test() {
        System.out.println(menu(getRestaurantTable().get().getFirst()));
    }

}