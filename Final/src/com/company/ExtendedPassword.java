package com.company;

public class ExtendedPassword extends Password{

    private int decyptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decyptedPassword = password;
    }

   // @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decyptedPassword);
//    }
}
