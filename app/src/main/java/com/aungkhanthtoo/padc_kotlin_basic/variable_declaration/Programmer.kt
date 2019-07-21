package com.aungkhanthtoo.padc_kotlin_basic.variable_declaration

/**
 *   Created with love by A.K.HTOO on 7/21/2019.
 */
/* Primary Constructor with direct property initialization in Parenthesis */
class Programmer(val firstName: String) {
    /*--------- Properties of the Class ----------- */
    // Access Modifier public default
    var lastName: String? = null
        get() {
            return field ?: "Beginner"
        }

    var age: Int = 0
        // Custom Setters and Getters
        set(value) {
            if (value > 18) {
                field = value
            }
        }
        get() {
            return if (field == 0) 18 else field
        }

    var address: AddressKotlin? = null
    /* ------------------------------------------- */

    init {
        // Constructor body for Primary constructor
    }

    @JvmOverloads // Need for Java Compiler to see Constructor Overloading
    constructor(
        firstName: String,
        lastName: String? = null,
        age: Int,
        address: AddressKotlin? = null
    ) :
            this(firstName) {
        this.lastName = lastName
        this.age = age
        this.address = address
    }

    // Boiler Plate Codes
    override fun toString(): String {
        return "Programmer(firstName='$firstName', lastName='$lastName', age=$age, address=$address)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Programmer

        if (firstName != other.firstName) return false
        if (age != other.age) return false
        if (address != other.address) return false

        return true
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + age
        result = 31 * result + (address?.hashCode() ?: 0)
        return result
    }
}

// data class removes all boiler plate for toString() equals() hasCode() methods
data class AddressKotlin(val home: String, val office: String?)

// top level function in Kotlin
fun main() {
    var myObj = Programmer("Kotlin", age = 10)
    // mutating properties from setters
    myObj.lastName = "Guru"
    myObj.age = 30

    println("myObj = $myObj")
    println("myObj' Address = ${myObj.address?.office}")
    println("myObj' FirstName = ${myObj.firstName}")

    // *** Calling ProgrammerJava.java ***
    var myJavaObj = ProgrammerJava("Java", null, 10)
    myJavaObj.lastName = "Guru"
    myJavaObj.age = 30

    println("myJavaObj = $myJavaObj")
    println("myJavaObj Address= ${myJavaObj.address?.home}")
    println("myJavaObj FirstName= ${myJavaObj.firstName}")

    val otherObj = Programmer("Kotlin", "Guru", 30)
    // Checking equality
    println("myObj equals otherObj : ${myObj == otherObj}")
    println("myObj == otherObj : ${myObj === otherObj}")

    myObj = otherObj
    println("myObj equals otherObj : ${myObj == otherObj}")
    println("myObj == otherObj : ${myObj === otherObj}")
}