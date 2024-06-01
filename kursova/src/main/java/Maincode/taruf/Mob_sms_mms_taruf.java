package Maincode.taruf;
/**тариф мобільний звя'зок sms та mms*/
public class Mob_sms_mms_taruf extends Mob_sms_taruf{
    int num_of_mms; // кількість mms
    double add_mms_price;// ціна за додаткові mms

    public Mob_sms_mms_taruf (String name,int clients,double payroll, int minutes, double add_min_price,int num_of_sms,double add_sms_price,int num_of_mms,double add_mms_price) {
        super(name,clients,payroll,minutes,add_min_price,num_of_sms,add_sms_price);
        this.num_of_mms = num_of_mms;
        this.add_mms_price = add_mms_price;
    }

    public int getNumOfMMS(){return this.num_of_mms;}
    public double getAddMMSPrice(){return  this.add_mms_price;}

    public void setNumOfMMS(int numMMS){this.num_of_mms = numMMS;}
    public void setAddMMSPrice(double addPrice){this.add_mms_price = addPrice;}

    @Override
    public String toString(){
        return  "---------------------------------------------------------\n" +
                "Назва: "+ this.name + "\n" +
                "Тип тарифу: тільки мобільний зв'язок SMS та MMS" + "\n"+
                "Кількість клієнтів: "+ this.clients + "\n" +
                "Абонплата: "+ payroll + "\n" +
                "Хвилини: " + minutes + "\n" +
                "Ціна додактових хвилин:"+ add_min_price + "\n"+
                "Кількість SMS в тарифі :" + num_of_sms + "\n"+
                "Ціна додаткових SMS:" + add_sms_price + "\n" +
                "Кількість MMS:" + num_of_mms + "\n" +
                "Ціна додаткових MMS :" + add_mms_price + "\n" +
                "---------------------------------------------------------\n";
    }
}