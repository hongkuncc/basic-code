package com.hongkuncc.day01.demo08;

public class Student {
    private String name;
    private int age;
    private boolean male;
    public void setMale(boolean b){
        male = b;
    }
    public boolean isMale(){
        return male;
    }
    public void setName(String id){
        name =id;
    }
    public String getName(){
        return name;
    }
    public void setAge(int  num ){
        age = num ;
    }
    public int getAge(){
        return age;
    }
}
