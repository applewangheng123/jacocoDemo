package com.wh;

/**
 * Hello world!
 *
 */
public class WhTestxx
{
    public void getName(int index){

        String name = "";

        switch (index){
            case 1:
                name = "1号张三";
                break;
            case 2:
                name = "2号李四";
                break;
            case 3:
                name = "3号老王";
                break;
            default:
                name = "WH小";

        }

        System.out.println("name == " + name);

    }
}
