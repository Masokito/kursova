package Maincode.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Maincode.taruf.Mob_sms_mms_inet_taruf;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TarufTests {

        Mob_sms_mms_inet_taruf taruf;
        @BeforeEach
        void init(){
            taruf = new Mob_sms_mms_inet_taruf("test",2,3,3,2,4,4,4,3,3,3,9);
        }


        @Test
        void TestgetName() {
            assertEquals("test", taruf.getName());
        }

        @Test
        void TestgetClients() {
            assertEquals(2,taruf.getClients());
        }

        @Test
        void TestgetPayroll() {
            assertEquals(3,taruf.getPayroll());
        }

        @Test
        void TestgetMinutes() {assertEquals(3,taruf.getMinutes());
        }

        @Test
        void TestgetAddMinPrice() {assertEquals(2,taruf.getAddMinPrice());
        }

        @Test
        void TestgetNumOfSMS() {assertEquals(4,taruf.getNumOfSMS());
        }
        @Test
        void TestgetAddSMSPrice() {assertEquals(4,taruf.getAddSMSPrice());

        }
        @Test
        void TestgetNumOfMMS() {assertEquals(4,taruf.getNumOfMMS());

        }
        @Test
        void TestgetAddMMSPrice() {assertEquals(3,taruf.getAddMMSPrice());

        }


        @Test
        void TestgetNumOfInetMegs() {assertEquals(3,taruf.getNumOfInetMegs());}

        @Test
        void TestgetInetMegsPerSecSpeed() {assertEquals(3,taruf.getInetMegsPerSecSpeed());}

        @Test
        void TestgetAddInetPrice() {assertEquals(9,taruf.getAddInetPrice());}



        @Test
        void TestsetName() {
                taruf.setName("changed");
                {assertEquals("changed",taruf.getName());}
        }

        @Test
        void TestsetClients() {
                taruf.setClients(100);
                assertEquals(100,taruf.getClients());
        }

        @Test
        void TestsetPayroll() {
                taruf.setPayroll(100);
                assertEquals(100,taruf.getPayroll());
        }

        @Test
        void TestsetMinutes() {
                taruf.setMinutes(100);
                assertEquals(100,taruf.getMinutes());
        }
        @Test
        void TestsetAddMinPrice() {
                taruf.setAddMinPrice(100);
                assertEquals(100,taruf.getAddMinPrice());
        }


        @Test
        void TestsetNumOfSMS() {
                taruf.setNumOfSMS(100);
                assertEquals(100,taruf.getNumOfSMS());
        }
        @Test
        void TestsetAddSMSPrice() {
                taruf.setAddSMSPrice(100);
                assertEquals(100,taruf.getAddSMSPrice());
        }

        @Test
        void TestsetNumOfMMS() {
                taruf.setNumOfMMS(100);
                assertEquals(100,taruf.getNumOfMMS());
        }

        @Test
        void TestsetAddMMSPrice() {
                taruf.setAddMMSPrice(100);
                assertEquals(100,taruf.getAddMMSPrice());
        }

        @Test
        void TestsetNumOfInetMegs() {
                taruf.setNumOfInetMegs(100);
                assertEquals(100,taruf.getNumOfInetMegs());
        }

        @Test
        void TestsetInetMegsPerSecSpeed() {
                taruf.setInetMegsPerSecSpeed(100);
                assertEquals(100,taruf.getInetMegsPerSecSpeed());
        }


        @Test
        void TestsetAddInetPrice() {
                taruf.setAddInetPrice(100);
                assertEquals(100,taruf.getAddInetPrice());
        }





    }

