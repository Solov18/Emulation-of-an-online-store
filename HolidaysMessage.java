package com.javacurse.ce.internetMagazin;

import java.util.ArrayList;
import java.util.Date;


public class HolidaysMessage {

        public void message(ArrayList<Customer> customers, HolidayCollection holidaysMessage){
                Date calendar = new Date();
                for (Customer element:customers) {
                        switch (holidaysMessage) {
                                case NEW_YEAR:
                                        System.out.println(" С новым годом " + element.getGenderPrefix() + "!");
                                        break;
                                case MARCH_8:
                                        if (element.getGender() == Customer.Gender.WOMAN) {
                                                System.out.println(" С 8-м Марта " + element.getGenderPrefix() + "!");
                                        }
                                        break;
                                case FEBRUARY_23:
                                        if (element.getGender() == Customer.Gender.MAN) {
                                                System.out.println(" С 23-м февраля " + element.getGenderPrefix() + "!");
                                        }
                                        break;
                                default:
                                        System.out.println("Никаких праздничных поздравлений для" + element.getGenderPrefix() + "!");
                                        break;

                        }
                }

        }

}
