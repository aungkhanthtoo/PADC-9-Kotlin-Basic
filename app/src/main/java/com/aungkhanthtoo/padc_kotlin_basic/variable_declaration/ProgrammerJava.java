package com.aungkhanthtoo.padc_kotlin_basic.variable_declaration;

import android.support.annotation.NonNull;

import org.jetbrains.annotations.Nullable;

import java.util.Objects;

/**
 * Created with love by A.K.HTOO on 7/20/2019.
 */

public class ProgrammerJava {
    // Immutable field, need to initialize in Constructor
    @NonNull // Type Information for Kotlin Compiler
    private final String mFirstName;

    // Mutable field, auto initialize with default null in Java Language
    @Nullable
    private String mLastName;

    // Mutable field, auto initialize with default primitive value in Java Language
    private int mAge;

    // Mutable field,
    @Nullable
    private Address mAddress;

    // Constructor for immutable field to be initialized
    public ProgrammerJava(@NonNull String firstName) {
        mFirstName = firstName;
    }

    // Constructor overloading
    public ProgrammerJava(@NonNull String firstName, @Nullable String lastName) {
        mFirstName= firstName;
        mLastName = lastName;
    }

    // Constructor overloading
    public ProgrammerJava(@NonNull String firstName, @Nullable String lastName, int age) {
         mFirstName = firstName;
         mLastName = lastName;
         setAge(age);
    }

    // Constructor overloading
    public ProgrammerJava(@NonNull String firstName, @Nullable String lastName, int age, @Nullable Address address) {
        this.mFirstName = firstName;
        this.mLastName = lastName;
        setAge(age);
        this.mAddress = address;
    }

    @NonNull
    public String getFirstName() {
        return mFirstName;
    }

    @Nullable
    public String getLastName() {
        return mLastName;
    }

    public void setLastName(@Nullable String lastName) {
        mLastName = lastName;
    }

    // Custom getter
    public int getAge() {
        return mAge == 0 ? 18 : mAge;
    }

    // Custom setter
    public void setAge(int age) {
        if (age > 18){
            mAge = age;
        }
    }

    @Nullable
    public Address getAddress() {
        return mAddress;
    }

    public void setAddress(@Nullable Address mAddress) {
        this.mAddress = mAddress;
    }

    // Boiler Plate Codes
    @Override
    public String toString() {
        return "ProgrammerJava{" +
                "firstName='" + mFirstName + '\'' +
                ", lastName='" + mLastName + '\'' +
                ", age=" + getAge() +
                ", address=" + mAddress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgrammerJava that = (ProgrammerJava) o;
        return mAge == that.mAge &&
                mFirstName.equals(that.mFirstName) &&
                Objects.equals(mLastName, that.mLastName) &&
                Objects.equals(mAddress, that.mAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mFirstName, mLastName, mAge, mAddress);
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
        System.out.println("myObj == otherObj :  " + String.valueOf(myObj == otherObj));


        myObj = otherObj;
        System.out.println("myObj equals otherObj : " + String.valueOf(myObj.equals(otherObj)));
        System.out.println("myObj == otherObj : " + String.valueOf(myObj == otherObj));

        // *** Calling Programmer.kt ***
        final Programmer myKotlinObj = new Programmer("Kotlin", 30);
        myKotlinObj.setLastName("Guru");

        System.out.println("myKotlinObj = "+ myKotlinObj);
    }
}
