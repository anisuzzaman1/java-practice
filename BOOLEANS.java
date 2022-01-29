package com.company;

public class BOOLEANS {
    public static void main(String[] args) {

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean hasEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

    }
}
