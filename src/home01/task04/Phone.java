package home01.task04;

/**
 * Created by Hamster4n.
 * Опишите класс Phone (одним из свойств должен быть его номер). Также опишите класс Network (сеть
 * мобильного оператора). Телефон должен иметь метод регистрации в сети мобильного оператора.
 * Также у телефона должен быть метод call (номер другого телефона), который переберёт все
 * телефоны, зарегистрированные в сети. Если такой номер найден, то осуществит вызов, если нет -
 * вывести сообщение о неправильности набранного номера.
 */
public class Phone {
    private String model;
    private double price;
    private String number;

    public Phone(String model, double price, String number) {
        this.model = model;
        this.price = price;
        this.number = number;
    }

    public Phone() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }



    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
