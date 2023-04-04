package org.example;

public class Book {

    private String name;
    private int numberOfChapters;
    private int numberOfCompletedChapters;

    public Book(String name, int numberOfChapters, int numberOfCompletedChapters) {
        this.name = name;
        this.numberOfChapters = numberOfChapters;
        this.numberOfCompletedChapters = numberOfCompletedChapters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfChapters() {
        return numberOfChapters;
    }

    public void setNumberOfChapters(int numberOfChapters) {
        this.numberOfChapters = numberOfChapters;
    }

    public int getNumberOfCompletedChapters() {
        return numberOfCompletedChapters;
    }

    public void setNumberOfCompletedChapters(int numberOfCompletedChapters) {
        this.numberOfCompletedChapters = numberOfCompletedChapters;
    }
}
