package home01.task04;

/**
 * Created by Hamster4n.
 * Опишите класс Phone (одним из свойств должен быть его номер). Также опишите класс Network (сеть
 * мобильного оператора). Телефон должен иметь метод регистрации в сети мобильного оператора.
 * Также у телефона должен быть метод call (номер другого телефона), который переберёт все
 * телефоны, зарегистрированные в сети. Если такой номер найден, то осуществит вызов, если нет -
 * вывести сообщение о неправильности набранного номера.
 */
public class Main {
    public static void main(String[] args) {

        Phone sony_x45 = new Phone("Sony x45", 1500.0, "0504784956");
        Phone philips_L11 = new Phone("Philips L11", 2500.0, "0689784512");
        Phone lenovo_A5000 = new Phone("Lenovo A5000", 3300.0, "0507894512");
        Phone samsung_anonim = new Phone("Samsung anonim", 500.0, "0936549887");
        Phone sony_turbo = new Phone("Sony Turbo", 5700.0, "0504784999");

        Network network = new Network();
        network.registrationPhone(sony_x45);
        network.registrationPhone(philips_L11);
        network.registrationPhone(lenovo_A5000);
        network.registrationPhone(samsung_anonim);
        network.registrationPhone(sony_turbo);


        network.call(sony_x45, "0689784512");
        network.call(samsung_anonim, "0505554477");
    }
}
