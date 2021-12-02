package com.company;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary) {
        this(baseSalary, 0); //this指向一个对象，随意最后“返回”一个对象
//        new Employee(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }
    public int calculateWage(int extraHours) {
        return baseSalary + (getHourlyRate() * extraHours);
    }
    public int calculateWage() {
        return calculateWage(0);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("hourlyRate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }
}
