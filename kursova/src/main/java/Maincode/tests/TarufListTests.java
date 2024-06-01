package Maincode.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Maincode.taruf.Mob_sms_mms_inet_taruf;
import Maincode.taruf.Mob_sms_mms_taruf;
import Maincode.taruf.Mob_sms_taruf;
import Maincode.taruf.Mob_taruf;
import Maincode.tarufList.TarufList;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TarufListTests {


    @BeforeEach
    void init(){
        TarufList.tarufs.removeAll(TarufList.tarufs);
    }

    @Test
    void TestAddTarufMobSMS() {
        TarufList.AddTarufMobSMS("test",3,5,5,5,5,5);
        Mob_taruf taruf = new Mob_sms_taruf("test",3,5,5,5,5,5);
        List<Mob_taruf> testList = new ArrayList<Mob_taruf>();
        testList.add(taruf);
        assertEquals(testList.toString(),TarufList.tarufs.toString());
    }

    @Test
    void TestAddTarufMob() {
        TarufList.AddTarufMob("test",3,5,5,5);
        Mob_taruf taruf = new Mob_taruf("test",3,5,5,5);
        List<Mob_taruf> testList = new ArrayList<Mob_taruf>();
        testList.add(taruf);
        assertEquals(testList.toString(),TarufList.tarufs.toString());
    }

    @Test
    void TestAddSMSMMSTaruf() {
        TarufList.AddTarufMobSMSMMS("test",3,5,5,5,5,5,5,5);
        Mob_taruf taruf = new Mob_sms_mms_taruf("test",3,5,5,5,5,5,5,5);
        List<Mob_taruf> testList = new ArrayList<Mob_taruf>();
        testList.add(taruf);
        assertEquals(testList.toString(),TarufList.tarufs.toString());
    }

    @Test
    void TestAddInetSMSMMSTaruf() {
        TarufList.AddTarufMobSMSMMSInet("test",3,5,5,5,5,5,5,5,5,5,5);
        Mob_taruf taruf = new Mob_sms_mms_inet_taruf("test",3,5,5,5,5,5,5,5,5,5,5);
        List<Mob_taruf> testList = new ArrayList<Mob_taruf>();
        testList.add(taruf);
        assertEquals(testList.toString(),TarufList.tarufs.toString());
    }

    @Test
    void TestMeasureAllClients() {
        TarufList.AddTarufMobSMSMMSInet("test1",3,5,5,5,5,5,5,5,5,5,5);
        TarufList.AddTarufMobSMSMMS("test2",12,5,5,5,5,5,5,5);
        int clients = TarufList.measureAllClients();
        assertEquals(15,clients);
    }

    @Test
    void TestSetByPayroll(){
        Mob_taruf taruf1 = new Mob_sms_mms_inet_taruf("test1",3,5,5,5,5,5,5,5,5,5,5);
        Mob_taruf taruf2 = new Mob_sms_mms_taruf("test2",12,8,5,5,5,5,5,5);
        Mob_taruf taruf3 = new Mob_sms_mms_taruf("test3",3,2,5,5,5,5,5,5);
        List<Mob_taruf> tarufList = new ArrayList<>();
        tarufList.add(taruf1);tarufList.add(taruf2);tarufList.add(taruf3);
        tarufList = TarufList.sortbyPayroll(tarufList);
        List<Mob_taruf> tarufList2 = new ArrayList<>();
        tarufList2.add(taruf3);tarufList2.add(taruf1);tarufList2.add(taruf2);
        assertEquals(tarufList2,tarufList);

        //TarufList.AddTarufMobSMSMMSInet("test1",3,5,5,5,5,5,5,5,5,5,5);
        //TarufList.AddTarufMobSMSMMS("test2",12,8,5,5,5,5,5,5);
        //TarufList.AddTarufMobSMSMMS("test3",12,9,5,5,5,5,5,5);

    }

    @Test
    void TestsetPayrollByName(){
        TarufList.AddTarufMobSMSMMSInet("test1",3,5,5,5,5,5,5,5,5,5,5);
        TarufList.AddTarufMobSMSMMS("test2",12,8,5,5,5,5,5,5);
        TarufList.AddTarufMobSMSMMS("test3",12,11,5,5,5,5,5,5);

        TarufList.setPayrollByName("test3",4);

        List<Mob_taruf> tarufList = new ArrayList<Mob_taruf>();
        tarufList.add(new Mob_sms_mms_inet_taruf("test1",3,5,5,5,5,5,5,5,5,5,5));
        tarufList.add(new Mob_sms_mms_taruf("test2",12,8,5,5,5,5,5,5));
        tarufList.add(new Mob_sms_mms_taruf("test3",12,4,5,5,5,5,5,5));

        assertEquals(tarufList.toString(), TarufList.tarufs.toString());

    }


    /**  @Test
      void TestPrintTarufs(){

          Mob_taruf taruf1 = new Mob_taruf("test1",3,3,3,3);
          Mob_taruf taruf2 = new Mob_taruf("test2",3,3,3,3);

          List<Mob_taruf> tarufs = new ArrayList<Mob_taruf>();
          tarufs.add(taruf1);tarufs.add(taruf2);
          TarufList.printTarufs(tarufs);

           final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
           final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
           final PrintStream originalOut = System.out;
      }*/



}
