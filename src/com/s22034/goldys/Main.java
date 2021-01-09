package com.s22034.goldys;

public class Main {

    public static void main(String[] args) {

        Cake cake = new Cake("Wedel", 1689, 33669988);
        cake.toString();

        Point2D point2D = new Point2D(15,8);
        System.out.println(point2D.toString());
        System.out.println(point2D.distance(point2D));

        Point3D point3D = new Point3D(14,23,6);
        System.out.println(point3D.toString());
        System.out.println(point3D.distance(point3D));

        Telephone telephone = new Telephone("NA", "BLACK");
        telephone.call("132-321-456");
        telephone.call("132-321-587");
        telephone.call("257-321-555");
        telephone.call("669-321-444");
        telephone.call("628-321-333");
        telephone.call("396-321-222");
        telephone.call("498-321-111");
        telephone.call("357-321-575");

        Cellphone cellphone = new Cellphone("-------", "WHITE");
        cellphone.call("123-323-999");
        cellphone.call("123-323-231");
        cellphone.call("123-323-322");
        cellphone.call("123-323-111");
        cellphone.call("123-323-543");
        cellphone.call("123-323-432");
        cellphone.call("123-432-999");
        cellphone.showHistoryCalls();

        Smartphone smartphone = new Smartphone("Dunno", "BLUE");

        Person person = new Person("Michal", "Goldys", "777-888-999");
        Person person1 = new Person("Marek", "Makowski", "600-888-564");
        Person person2 = new Person("Barek", "Bakowski", "500-888-321");
        Person person3 = new Person("Farek", "Kacowski", "900-888-123");

        smartphone.addPersonToList(person);
        smartphone.addPersonToList(person1);
        smartphone.addPersonToList(person2);
        smartphone.addPersonToList(person3);

        smartphone.call("777-888-999");
        smartphone.showHistoryCalls();

    }
}
