package com.s22034.goldys;

import java.util.Arrays;

public class Smartphone extends
        Cellphone {

    Person[] friends;
    int tableIndexCounter;

    public Smartphone(String communicationInterface, String colour) {
        super(communicationInterface, colour);
        this.friends = new Person[10];
        tableIndexCounter = 0;
    }

    public Person[] getFriends() {
        return friends;
    }

    public void showHistoryCalls(){
        for(String lastCalls : getLastCalls()){
            System.out.println(
                    lastCalls
            );
        }
    }

    public void addPersonToList(Person person){
        if(tableIndexCounter >= friends.length){
            System.out.println(
                    "Moving to bigger list!!!"
            );

            Person[] tempPersonList = new Person[(friends.length*2)];
            for (int i = 0; i < friends.length; i++){
                tempPersonList[i] = friends[i];
            }

            friends = tempPersonList;
        }
        friends[tableIndexCounter++] = person;
        System.out.println(
                "New person added to list!!!"
        );
    }

    @Override
    public void call(String number) {
        super.call(number);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "friends=" + Arrays.toString(friends) +
                ", tableIndexCounter=" + tableIndexCounter +
                '}';
    }
}