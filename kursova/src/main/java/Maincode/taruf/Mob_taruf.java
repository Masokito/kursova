package Maincode.taruf;
/**тариф тільки мобільний звя'зок */
public class Mob_taruf{
    String name; //назва тарифу
    int clients;
    double payroll; //абонетська плата за 1 місяць
    int minutes;// кількість хвилин по тарифу
    double add_min_price; //плата за додаткові хвилини

    public Mob_taruf(String name,int clients,double payroll, int minutes, double add_min_price){
        this.name = name;
        this.clients = clients;
        this.payroll = payroll;
        this.minutes = minutes;
        this.add_min_price = add_min_price;
    }

    public String getName(){return this.name;}
    public int getClients(){return this.clients;}
    public double getPayroll(){return this.payroll;}
    public int getMinutes(){return this.minutes;}
    public double getAddMinPrice(){return  this.add_min_price;}

    public void setName(String name){this.name = name;}
    public void setClients(int clients){this.clients = clients;}
    public void setPayroll(double payroll){this.payroll = payroll;}
    public void setMinutes(int mins){this.minutes = mins;}
    public void setAddMinPrice(double addPrice){this.add_min_price = addPrice;}

    @Override
    public String toString(){
        return  "---------------------------------------------------------\n" +
                "Назва: "+ this.name + "\n" +
                "Тип тарифу: тільки мобільний зв'язок" + "\n"+
                "Кількість клієнтів: "+ this.clients + "\n" +
                "Абонплата: "+ payroll + "\n" +
                "Хвилини: " + minutes + "\n" +
                "Ціна додактових хвилин:"+ "\n"+
                "---------------------------------------------------------\n";
    }

}