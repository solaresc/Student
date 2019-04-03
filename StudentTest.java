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

import java.util.Collections;

import java.util.List;

import java.util.Map;

import java.util.TreeMap;


public class StudentTest {

    List < Student > students = new ArrayList < > ();
    Map < String, Integer > courseMap = new TreeMap < > ();

    StudentTest() {

        Student S;
        S = new Student("0001", "Stark");
        S.courses.add("COP1234");
        S.courses.add("TIM1234");
        S.courses.add("TIT1234");
        students.add(S);

        S = new Student("0002", "Rogers");
        S.courses.add("COP1234");
        S.courses.add("TCA1234");
        S.courses.add("WAK1234");
        students.add(S);

        S = new Student("0003", "Odinson");
        S.courses.add("COP1234");
        S.courses.add("TTH1234");
        S.courses.add("WAK1234");
        students.add(S);

        S = new Student("0004", "Banner");
        S.courses.add("COP1234");
        S.courses.add("TTH1234");
        S.courses.add("SAK1234");
        students.add(S);

        S = new Student("0005", "Romanoff");
        S.courses.add("COP5678");
        S.courses.add("WAK1234");
        S.courses.add("TIM1234");
        students.add(S);

        S = new Student("0006", "Barton");
        S.courses.add("COP5678");
        S.courses.add("TCA1234");
        S.courses.add("FAM1234");
        students.add(S);

        S = new Student("0007", "Maximoff");
        S.courses.add("COP9010");
        S.courses.add("TCA1234");
        S.courses.add("WAK1234");
        students.add(S);

        S = new Student("0008", "Vision");
        S.courses.add("COP9010");
        S.courses.add("TIM1234");
        S.courses.add("WAK1234");
        students.add(S);

        S = new Student("0009", "Rhodes");
        S.courses.add("COP1112");
        S.courses.add("TIM1234");
        S.courses.add("WAK1234");
        students.add(S);

        S = new Student("0010", "Wilson");
        S.courses.add("COP1112");
        S.courses.add("TCA1234");
        S.courses.add("WAK1234");
        students.add(S);
        
        S = new Student("0011", "Barnes");
        S.courses.add("COP1314");
        S.courses.add("TCA1234");
        S.courses.add("WAK1234");
        students.add(S);
        
        S = new Student("0012", "Lang");
        S.courses.add("COP1516");
        S.courses.add("FAM1234");
        S.courses.add("BUG1234");
        students.add(S);
        
        S = new Student("0013", "T'Challa");
        S.courses.add("COP1516");
        S.courses.add("TIM1234");
        S.courses.add("WAK1234");
        students.add(S);
        
        S = new Student("0014", "Parker");
        S.courses.add("COP1718");
        S.courses.add("TPP1234");
        S.courses.add("TIT1234");
        students.add(S);
        
        S = new Student("0015", "Strange");
        S.courses.add("COP1920");
        S.courses.add("TIT1234");
        S.courses.add("MAG1234");
        students.add(S);

    }

    void start() {

        Collections.sort(students);

        for (Student S: students) {
            System.out.println(S.toString());
        }


        for (Student S: students) {
            for (String aCourse: S.courses) {
                if (!courseMap.containsKey(aCourse))
                    courseMap.put(aCourse, 1);
                else {
                    int count = courseMap.get(aCourse) + 1;
                    courseMap.put(aCourse, count);
                }
            }
        }

        System.out.println("---------- Course Enrollments ------------");
        for (Map.Entry < String, Integer > entry: courseMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        new StudentTest().start();

    }

}