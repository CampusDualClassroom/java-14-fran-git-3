package com.campusdual.classroom;

public class Exercise14 {

    public static void main(String[] args) {
        Person p = new Person("John", "Smith");
        Teacher t = new Teacher("Maria", "Montessori", "Educacion");
        PoliceOfficer po = new PoliceOfficer("Jake", "Peralta", "B-99");
        Doctor d = new Doctor("Gregory", "House", "Nefrologia e Infectologia");

        p.getDetails();
        System.out.println("");
        t.getDetails();
        System.out.println("");
        po.getDetails();
        System.out.println("");
        d.getDetails();
        System.out.println("");

    }

}