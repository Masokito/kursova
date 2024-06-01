package Maincode.taruf;
//import taruf.Mob_taruf;

/**тариф мобільний звя'зок та sms*/
public class Mob_sms_taruf extends Mob_taruf {
    int num_of_sms;// кількість sms
    double add_sms_price;// ціна за додаткові sms

    public Mob_sms_taruf(String name,int clients,double payroll, int minutes, double add_min_price,int num_of_sms,double add_sms_price) {
        super(name, clients,payroll,minutes,add_min_price);
        this.num_of_sms = num_of_sms;
        this.add_sms_price = add_sms_price;
    }

    public int getNumOfSMS(){return this.num_of_sms;};
    public double getAddSMSPrice(){return  this.add_sms_price;}

    public void setNumOfSMS(int numSMS){this.num_of_sms = numSMS;};
    public void setAddSMSPrice(double addPrice){this.add_sms_price = addPrice;}

    @Override
    public String toString(){
        return  "---------------------------------------------------------\n" +
                "Назва: "+ this.name + "\n" +
                "Тип тарифу: тільки мобільний зв'язок та SMS" + "\n"+
                "Кількість клієнтів: "+ this.clients + "\n" +
                "Абонплата: "+ payroll + "\n" +
                "Хвилини: " + minutes + "\n" +
                "Ціна додактових хвилин:"+ add_min_price + "\n"+
                "Кількість SMS в тарифі :" + num_of_sms + "\n"+
                "Ціна додаткових SMS:" + add_sms_price + "\n" +
                "---------------------------------------------------------\n";
    }
}
