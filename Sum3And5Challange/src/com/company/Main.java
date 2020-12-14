package com.company;

public class Main {

    public static void main(String[] args) {
	int count = 0;
        int sum = 0;
	for (int i = 1; i <=1000; i++){
	    if(i % 3 == 0 && i % 5 == 0){
	        count++;
	        sum = sum + i;
            System.out.println(i + " hem 3 e hem 5 e bölünebilir");
        }if(count == 5){
            System.out.println("bu 5 sayının toplamı = " + sum);
            break;
        }
    }
    }
}
