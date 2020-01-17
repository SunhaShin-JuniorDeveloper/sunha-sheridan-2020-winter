/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.softwarefundamentals.week1;

/**
 * A class that creates an array of Students,
 * iterates over the array and prints each student's
 * name.
 * @author dancye, 2020
 */
public class StudentList 
{
    public static void main(String[] args)
    {
        Student[] studentList = new Student[5];
        //make up 5 students to put inside
        studentList[0] = new Student("Superman", "007");
        studentList[1] = new Student("James Bond", "700");
        studentList[2] = new Student("Wonder Woman", "100");
        studentList[3] = new Student("Batman", "001");
        studentList[4] = new Student("Joker", "002");
        //the for each loop iterates over a list of Objects
        for(Student s : studentList)
        {
            System.out.println(s.getName());
        }
    }   
    
    
}
