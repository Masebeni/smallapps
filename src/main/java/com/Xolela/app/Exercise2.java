package com.Xolela.app;

/**
 * Created by student on 2016/03/03.
 */
public class Exercise2 {
    //Floating Point
    public float TestFloat(float a,float b){
        return(a+b);
    }
    //Integers
    public int TestInt(int a,int b){
        return a+b;
    }
    //Object Equality
    public boolean TestObjectEquality(Object a,Object b)
    {
        return a==b;
    }
    //Object Identity
    public boolean TestObjectIdentity(Object a,Object b)
    {
        return a==b;
    }
    //Truth
    public boolean evenNumber(int num)
    {
        boolean result = false;
        if(num %2 ==0)
            result = true;
        return result;
    }
    //False
    public boolean oddNumber(int num)
    {
        boolean result = false;
        if(num %2 ==0)
            result = true;
        return result;
    }
    //Nullness
    public String isNull()
    {
        return null;
    }
    //Non Nullness
    public String nonNull()
    {
        return "axe";
    }
    //FailingTest
    public int failingTest() {
        return 1;
    }
    //Disabling
    public int disabling()
    {
        return 10;
    }
    //Arrays Content
    public char[] arrayContent()
    {
        char[] array = {'a','b','c'};
        return array;
    }
}
