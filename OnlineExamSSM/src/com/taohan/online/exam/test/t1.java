package com.taohan.online.exam.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

abstract class t1
{
    public static void main(String[] args)
    {
        A[] a1 = new A[5];
        a1[0] = new A("第一个对象");
        a1[1] = new A("第二个对象");
        a1[2] = new A("第三个对象");
        a1[3] = new A("第四个对象");
        a1[4] = new A("第五个对象");
        A[] a2 = a1.clone();
        System.out.println(a1 == a2);
        System.out.println(a1[0] == a2[0]);
        System.out.println(a1[0].s == a2[0].s);
        
        
    }
}
class A
{
    public A(String s)
    {
        this.s = s;
    }
    
    public String s = "测试属性";
    
}
