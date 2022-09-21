import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItems> menuItems = new ArrayList<>(
                Arrays.asList(
                        new MenuItems(5.99, "Green Salad with yummies", "Starter"),
                        new MenuItems(14.99, "Steak", "Entree")
                )
        );

    }
}