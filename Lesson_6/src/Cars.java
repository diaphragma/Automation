import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Cars{
    int id;
    String model;
    String color;
    int price;

    public int getId() {
        return id;
    }

    public String getmodel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setmodel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Cars(int id, String model, String color, int price) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Cars Nissan = new Cars(1, "Leaf", "Blue", 28000);
        Cars Mercedes = new Cars(228, "Benz", "Black", 56000);
        Cars Lada = new Cars(1337, "9", "Chery", 1000);
        Cars Subaru = new Cars(2303, "Forester", "Blue", 38000);
        Cars Mitsubishi = new Cars(1984, "Lancer", "", 46000);

        List<Cars> cars = new ArrayList<>();

        cars.add(Nissan);
        cars.add(Mercedes);
        cars.add(Lada);
        cars.add(Subaru);
        cars.add(Mitsubishi);

        List<Cars> filteredCars = cars.stream().filter(c -> c.getColor()=="Blue" && c.getPrice() > 35000).collect(Collectors.toList());
        System.out.println("Task #3");
        System.out.println(filteredCars);

    }
}
