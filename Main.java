package com.company;

public class Main {

    public static void main(String[] args) {

        boolean ticket=true;
        int price =150;
	// write your code here
        if(ticket==true)
        {
            if(price<200)
            {
                System.out.println("booking");
            }
            else
            {
                System.out.println("Not booking");
            }
        }
        else
        {
            System.out.println("Ticket is not available");
        }
    }
}
