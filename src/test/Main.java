package test;

public class Main {
    public static void main(String[] args) {
         Product p = new Product();
         Product c = new Product();
         Product e = new Product();
         System.out.println(p.length);
    }
}

// write a class create objects and print numbers of objects are created
class Product{
    static int length = 0;

    Product(){
        length++;
    }
}

// assignment
// design online banking system
// bank wants to automate account
// system should support account types saving ac mini balance 1000
// current ac mini balance is 0
// feature sush as
// create account
// deposit amount
// withdraw amount
// transfer money
// view account details
// generate monthly statement
//
// no transaction made for last 15 day then account should marked as dormant
// only deposit account allowed then change dormant status
// system support salary account

