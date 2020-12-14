package com.company;

public class Password {
    private static final int key = 748576362;
    private final int encyryptedPassword;

    public Password(int password) {
        this.encyryptedPassword = encyrptDecrypt(password);
    }

    private int encyrptDecrypt (int password){
        return password^ key;
    }
    public final void storePassword(){
        System.out.println("Saving password as " + this.encyryptedPassword);
    }

    public boolean letMeIn(int password){
        if(encyrptDecrypt(password) == this.encyryptedPassword){
            System.out.println("Wellcome");
            return true;
        }else{
            System.out.println("Nope, you can't come in");
            return false;
        }
    }


}
