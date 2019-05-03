package lab3_3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Krys Ngabi
 */
public class Person2 implements IPerson,IPerson2 {
    protected String name,phone;
    protected int age;
    ArrayList<Person2>mlist;

    public Person2(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


	@Override
	public void myAbstract() {
		 ////
		System.out.println("From static method inside Person2.");
		
	}


	@Override
	public void myDefault() {
		 ////
		IPerson.super.myDefault();
	}
	


    
    
}