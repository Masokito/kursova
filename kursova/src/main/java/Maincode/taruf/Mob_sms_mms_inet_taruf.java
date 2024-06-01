package Maincode.taruf;

/**тариф мобільний звя'зок sms та mms*/
public class Mob_sms_mms_inet_taruf extends Mob_sms_mms_taruf{
    int num_of_inet_megs; // кількість мегабайтів у тарифі
    int inet_megs_per_sec_speed; // швидкість у мегабайтах в секунду
    double add_inet_price; // ціна за додаткові мегабайти

    public Mob_sms_mms_inet_taruf(String name,int clients,double payroll, int minutes, double add_min_price,int num_of_sms,double add_sms_price,int num_of_mms,double add_mms_price,int num_of_inet_megs,int inet_megs_per_sec_speed,double add_inet_price){
        super(name,clients,payroll,minutes,add_min_price,num_of_sms,add_sms_price,num_of_mms,add_mms_price);
        this.num_of_inet_megs = num_of_inet_megs;
        this.inet_megs_per_sec_speed = inet_megs_per_sec_speed;
        this.add_inet_price = add_inet_price;
    }

    public int getNumOfInetMegs(){return this.num_of_inet_megs;}
    public int getInetMegsPerSecSpeed(){return this.inet_megs_per_sec_speed;}
    public double getAddInetPrice(){return this.add_inet_price;}

    public void setNumOfInetMegs(int numMegs){this.num_of_inet_megs = numMegs;}
    public void setInetMegsPerSecSpeed(int megsSpeed){this.inet_megs_per_sec_speed = megsSpeed;}
    public void setAddInetPrice(double addPrice){this.add_inet_price = addPrice;}

    public String toString(){
        return  "---------------------------------------------------------\n" +
                "Назва: "+ this.name + "\n" +
                "Тип тарифу: тільки мобільний зв'язок SMS та MMS та інтернет" + "\n"+
                "Кількість клієнтів: "+ this.clients + "\n" +
                "Абонплата: "+ payroll + "\n" +
                "Хвилини: " + minutes + "\n" +
                "Ціна додактових хвилин:"+ add_min_price + "\n"+
                "Кількість SMS в тарифі :" + num_of_sms + "\n"+
                "Ціна додаткових SMS:" + add_sms_price + "\n" +
                "Кількість MMS:" + num_of_mms + "\n" +
                "Ціна додаткових MMS :" + add_mms_price + "\n" +
                "Кількість мегабайт в тарифі: " + num_of_inet_megs +"\n"+
                "Швидкість інтернету в мегабайтах в секунду: "+ inet_megs_per_sec_speed + "\n" +
                "Ціна додаткового інтернету: " + add_inet_price + "\n"+
                "---------------------------------------------------------\n";
    }
}