package com.javacurse.ce.internetMagazin;


public class Main {
    public static void main(String[] args) {

        Customer ivan = new Customer("ivan petrov", 45, "898877744411", Customer.Gender.MAN);
        Shop.customers.add(ivan);
        Customer zina = new Customer("zina petro", 54, "8988111222365", Customer.Gender.WOMAN) ;
        Shop.customers.add(zina);
        Product Toy_1 = new Product("кукла", 1000);
        Shop.products.add(Toy_1);
        Product Toy_2 = new Product("кукла", 1000);
        Shop.products.add(Toy_2);
        Product Toy_3 = new Product("кукла", 1000);
        Shop.products.add(Toy_3);
        Product Toy_4 = new Product("кукла", 1000);
        Shop.products.add(Toy_4);
        Product Toy_5 = new Product("кукла", 1000);
        Shop.products.add(Toy_5);

        HolidaysMessage holidaysMessage = new HolidaysMessage();

        // Установка текущего праздника
        HolidayCollection currentHoliday = HolidayCollection.FEBRUARY_23;


        holidaysMessage.message(Shop.customers, currentHoliday);


        //System.out.println(Shop.getBy(zina,Toy_2,4));



    }




}


