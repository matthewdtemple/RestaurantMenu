import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private static ArrayList<MenuItems> item;

    public ArrayList<MenuItems> getItem() {
        return item;
    }


   public Menu(ArrayList<MenuItems> item){
       this.item = item;
    }


    public static void main(String[] args){
        for (MenuItems items: item){
            System.out.println(items.getDescription());
        }
    }
}
