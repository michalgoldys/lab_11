package com.s22034.goldys;

import java.util.Arrays;

public class Cellphone extends
        Telephone{

    private String[] lastCalls;
    private int historyCallsIndex;

    public Cellphone(String communicationInterface, String colour) {
        super(communicationInterface, colour);
        this.lastCalls = new String[10];
        this.historyCallsIndex = 0;
    }

    public String[] getLastCalls() {
        return lastCalls;
    }

    public void showHistoryCalls(){
        System.out.println(
                "Showing CELLPHONE calls history below:"
        );
        for(String calls : lastCalls){
            if(calls != null){
                System.out.println(
                        calls
                );
            }
        }
    }

    @Override
    public void call(String number) {
        super.call(number);
        if(historyCallsIndex >= lastCalls.length){
            System.out.println(
                    "Moving to bigger history list!!!"
            );
            String[] tempCallsHistory = new String[(lastCalls.length*2)];
            for (int i = 0; i < lastCalls.length; i++){
                tempCallsHistory[i] = lastCalls[i];
            }

            lastCalls = tempCallsHistory;
        }
        lastCalls[historyCallsIndex++] = number;
    }

    @Override
    public String toString() {
        return "Cellphone{" +
                "lastCalls=" + Arrays.toString(lastCalls) +
                ", historyCallsIndex=" + historyCallsIndex +
                '}';
    }
}