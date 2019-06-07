package io.zipcoder;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {

    }

    public void addExamScore(Double score) {
        examScores.add(score);
    }

    public void setExamScore(int examId, Double newScore) {
        examScores.set(examId, newScore);
    }

    public int getAvarageExamScore() {
        int average = 0;
        for (int i = 0; i < examScores.size(); i++) {
            average += examScores.get(i) / examScores.size();
        }
        return average;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }



    @Override
    public String toString() {
        return "StudentString{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", examScores=" + examScores +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getAvarageExamScore() > o.getAvarageExamScore() ? 1 : this.getAvarageExamScore() < o.getAvarageExamScore() ? -1 : 0;
    }
}

