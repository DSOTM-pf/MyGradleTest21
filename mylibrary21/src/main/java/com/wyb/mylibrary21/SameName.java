package com.wyb.mylibrary21;

public class SameName {
    public static String Name_one;
    public String Name_two;
    public int Name_N2;//属性不同的

    public int getName_N2() {
        return Name_N2;
    }

    public void setName_N2(int name_N2) {
        Name_N2 = name_N2;
    }

    //自定义同名类公有的方法
    public String SameMethod()
    {
        return "MyGradle21.SameName.SameMethod";
    }
    //自定义同名类特有的方法
    public String NotSameMethod21()
    {
        return "MyGradle21.SameName.NotSameMethod21";
    }
    //get set
    public static String getName_one() {
        return Name_one;
    }

    public static void setName_one(String name_one) {
        Name_one = name_one;
    }

    public String getName_two() {
        return Name_two;
    }

    public void setName_two(String name_two) {
        Name_two = name_two;
    }


}
