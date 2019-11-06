package org.wdzl.first.HolidayThree;

import java.util.Scanner;

public enum Testyear
{
    JAN,FEB,MAR,APR,MAY,JUN,JULY,AUG,SEP,OCT,NOV,DEC;
}
class  test{
    public static void main(String[] args) {
        switch (Testyear.AUG)
        {
            case JAN:
            case FEB:
            case MAR:
                System.out.println("春天");
                break;
            case APR:
            case MAY:
            case JUN:
                System.out.println("夏天");
                break;
            case JULY:
            case AUG:
            case SEP:
                System.out.println("秋天");
                break;
            case OCT:
            case NOV:
            case DEC:
                System.out.println("冬天");
                break;
        }
    }
}
