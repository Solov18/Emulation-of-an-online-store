package com.javacurse.ce.internetMagazin;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private String fio;
    private int age;
    private String number;
    private Gender gender;

    public String getGenderPrefix() {
        return getFio();
    }

    public enum Gender {
        MAN, WOMAN;
    }

}
