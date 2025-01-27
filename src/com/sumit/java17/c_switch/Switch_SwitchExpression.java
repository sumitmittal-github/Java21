package com.sumit.java17.c_switch;

public class Switch_SwitchExpression {

    public static void traditionalSwitch(String direction){
        int length = 0;
        switch(direction){
            case "EAST" :
            case "WEST" :
                length=4;
                break;
            case "NORTH" :
            case "SOUTH" :
                length=5;
                break;
            default :
                length=0;
        }
        System.out.println("Direction length = " + length);
    }

    public static void enhancedSwitch(String direction){
        int length = switch (direction) {
            case "EAST", "WEST" -> 4;                   // OR  case "EAST", "WEST" : yield 4;
            case "NORTH", "SOUTH" -> 5;
            default -> 0;
        };
        System.out.println("Direction length = " + length);
    }

    public static void main(String[] args) {
        traditionalSwitch("WEST");
        enhancedSwitch("WEST");
    }

}