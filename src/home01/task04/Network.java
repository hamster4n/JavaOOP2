package home01.task04;

/**
 * Created by Hamster4n.
 * Опишите класс Phone (одним из свойств должен быть его номер). Также опишите класс Network (сеть
 * мобильного оператора). Телефон должен иметь метод регистрации в сети мобильного оператора.
 * Также у телефона должен быть метод call (номер другого телефона), который переберёт все
 * телефоны, зарегистрированные в сети. Если такой номер найден, то осуществит вызов, если нет -
 * вывести сообщение о неправильности набранного номера.
 */
public class Network {
    private String networkName;
    private Phone[] arrayPhones = new Phone[20];

    public Network(String networkName) {
        this.networkName = networkName;
    }

    public Network() {
    }

    public Phone[] getArrayPhones() {
        return arrayPhones;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

   public void call (Phone phone, String anotherPhone){
       if (isPhonAlreadyRegister(anotherPhone)){
           System.out.println("Phone " + phone.getNumber() + " calling number " + anotherPhone + ". Waiting for answer");
       } else System.out.println("Phone " + phone.getNumber() + " calling to wrong number!");
   }



    public void registrationPhone (Phone phone){
        if (!isPhonAlreadyRegister(phone.getNumber())){
            for (int i = 0; i < arrayPhones.length; i++) {
                if (arrayPhones[i] == null){
                    arrayPhones[i] = phone;
                    System.out.println("Phone " + phone.getNumber() + " successfully registered!");
                    return;
                }
            }
        } else {
            System.out.println("Phone is registered previously.");
        }

    }

    public boolean isPhonAlreadyRegister (String phone){
        boolean register = false;
        for (Phone element:arrayPhones) {
            if (element != null){
                if (element.getNumber().equals(phone)){
                    register = true;
                }
            }
        }
        return register;
    }

    @Override
    public String toString() {
        return "Network{" +
                "networkName='" + networkName + '\'' +
                '}';
    }
}
