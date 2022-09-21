import java.util.Date;

public class MenuItems {

    private double price;
    private String description;
    private String category;
    private Date date;


    public double getPrice(){
        return price;
    }
    public String getDescription(){
        return description;
    }
    public String getCategory(){
        return category;
    }

    public Date getDate() {
        return date;
    }

    public void setPrice(double aPrice){
        price = aPrice;
    }
    public void setDescription(String aDescription){
        description = aDescription;
    }
    public void setCategory(String aCategory){
        category = aCategory;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MenuItems(double price, String description, String category){
        this.price = price;
        this.description = description;
        this.category = category;
        this.date = new Date();
    }
}
