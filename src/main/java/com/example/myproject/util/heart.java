package com.example.myproject.util;

/**
 * @Author: lixl
 * @Date: 2021/11/6 15:34
 * @Descrption
 */
public class heart {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(float y = (float) 1.5;y>-1.5;y -=0.15)  {
            for(float x= (float) -1.5;x<1.5;x+= 0.05){
                float a = x*x+y*y-1;
                if((a*a*a-x*x*y*y*y)<=0.0)  {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


}
