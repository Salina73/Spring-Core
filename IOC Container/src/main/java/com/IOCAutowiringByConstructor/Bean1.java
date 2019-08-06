package com.IOCAutowiringByConstructor;
public class Bean1 
{
    public Bean2 b2;
    
    public Bean1(Bean2 b2) {
        this.b2 = b2;
    }

    public void show()
    {
        System.out.println("Bean1 show() method called");
        b2.disp();
    }
}