package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import static org.apache.commons.lang3.ArrayUtils.*;


public class Classroom {


    private Student[] students;

    private int maxNumberOfStudents;

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(int maxNumberOfStudents) {

    }

    public Classroom() {

    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScores() {
        Double sum = 0.0;
        for (Student student : students) {
            sum += student.getAvarageExamScore();
        }
        return sum / students.length;
    }

    public Boolean addStudent(Student student) {
        for (Student value : students) {
            if (value == student) {
                if (value == null) {
                    return false;
                }
            }

        }
        return true;
    }

    public void removeStudent(String firstName, String lastName) {
        for (Student student : students) {
            if (firstName == student.getFirstName() && lastName == student.getLastName()) {
                removeElement(students, student);

            }
        }
    }

        public Student[] getStudentByScore () {
            ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(students));
            Collections.sort(studentList, Collections.reverseOrder());
            Student[] students1 = studentList.toArray(new Student[studentList.size()]);

            return students1;
        }

        public HashMap getGradeBook (){

            HashMap<Student, String> gradeBook = new HashMap<Student, String>();
            for (Student i : students) {
                Double percentile = ((i.getAvarageExamScore() / 100) * (double) (students.length + 1));
                if (percentile > 10) {
                    gradeBook.put(i, "A");
                } else if (percentile < 30) {
                    gradeBook.put(i, "B");
                } else if (percentile < 50) {
                    gradeBook.put(i, "C");
                } else if (percentile < 90) {
                    gradeBook.put(i, "D");
                } else {
                    gradeBook.put(i, "F");
                }
            }


            return gradeBook;
        }

    }

