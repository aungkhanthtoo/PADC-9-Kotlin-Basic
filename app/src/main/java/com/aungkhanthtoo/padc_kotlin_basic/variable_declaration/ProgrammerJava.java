package com.aungkhanthtoo.padc_kotlin_basic.variable_declaration;

/**
 * Created with love by A.K.HTOO on 7/20/2019.
 */

public class ProgrammerJava {
    // Immutable field, need to initialize in Constructor
    private final String mFirstName;

    // Mutable field, auto initialize with default null in Java Language
    private String mLastName;

    // Mutable field, auto initialize with default primitive value in Java Language
    private int mAge;

    // Mutable field,
    private Address mAddress;

    // Constructor for immutable field to be initialized
    public ProgrammerJava(String firstName) {
        mFirstName = firstName;
    }

    // Constructor overloading
    public ProgrammerJava(String firstName, String lastName) {
        mFirstName= firstName;
        mLastName = lastName;
    }

    // Constructor overloading
    public ProgrammerJava(String firstName, String lastName, int age) {
         mFirstName = firstName;
         mLastName = lastName;
         mAge = age;
    }

    // Constructor overloading
    public ProgrammerJava(String firstName, String lastName, int age, Address address) {
        this.mFirstName = firstName;
        this.mLastName = lastName;
        this.mAge = age;
        this.mAddress = address;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }

    @Override
    public String toString() {
        return "ProgrammerJava{" +
                "firstName='" + mFirstName + '\'' +
                ", lastName='" + mLastName + '\'' +
                ", age=" + mAge +
                ", address=" + mAddress +
                '}';
    }



    public static void main(String[] args) {
        ProgrammerJava myObj = new ProgrammerJava(
                "Java", "Ninja", 20,
                new Address("Mayangone", "Latha")
        );
        myObj.setLastName("Guru");
        myObj.setAge(30);
        System.out.println("myObj = " + myObj);

        final ProgrammerJava otherObj = new ProgrammerJava(
                "Java", "Guru", 30,
                new Address("Mayangone", "Latha")
        );
        System.out.println("otherObj = " + otherObj);

        // Checking equality
        System.out.println("myObj equals otherObj :  " + String.valueOf(myObj.equals(otherObj)));

        myObj = otherObj;
        System.out.println("myObj equals otherObj : " + String.valueOf(myObj.equals(otherObj)));
    }
}
