package com.wh;
import org.testng.annotations.Test;
public class TestJacoco {


    @Test
    public void testBranch(){
      enna();
      TestAddxx();

      testAddxxq();
    }


    static void enna() {

        System.out.print("enna......");
    }


    static void TestAddxx() {

        System.out.print("哈哈哈3dr");
    }

    static  void testAddxxq() {

        int a=4;
        int b=6;
        int c;
        c=a+b;
        System.out.print("哈哈哈3xxx3444dr"+c);
    }
}
