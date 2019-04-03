/***************************************************************
******
 Author : Caleb Solares
 Course : COP4814
 Professor : Caryl Rahn
 Program : Assignment 3
 Purpose : Create a TreeMap of course names. 
 *         Display the map in ascending order by course name, 
 *         showing each course name and its enrollment below the list of students from Lab 1.
 Due Date : 12/2/2018
 Certification:
 I hereby certify that this work is my own and none of it is the work of any other person.
 ..........{ Caleb Solares }..........
****************************************************************
*****/

import java.util.ArrayList;

import java.util.List;

public class Student implements Comparable < Student > {
    String id;
    String lastName;
    List < String > courses;

    Student(String id, String name) {
        this.id = id;
        this.lastName = name;
        courses = new ArrayList < > ();
    }

    public int compareTo(Student rhs) {
        return this.lastName.compareTo(rhs.lastName);
    }

    public String toString() {
        String temp = id + ", " + lastName + "\t";
        for (String crs: courses) {
            temp += crs + ", ";
        }
        temp = temp.substring(0, temp.length() - 2);

        return temp;
    }


}