package com.gm;
import java.util.Scanner;

 class Employee {
	

	    private int id;
	    private String name;
	    private String email;
	    private String department;
	    private float salary;

	    public Employee(){
	    }

	    public void setId(int id){
	        this.id = id;
	    }

	    public int getId(){
	        return id;
	    }

	    public void setName(String name){
	        this.name = name;
	    }

	    public String getName(){
	        return name;
	    }

	    public void setEmail(String email){
	        this.email = email;
	    }

	    public String getEmail(){
	        return email;
	    }

	    public void setDepartment(String department){
	        this.department = department;
	    }

	    public String getDepartment(){
	        return department;
	    }

	    public void setSalary(float salary){
	        this.salary = salary;
	    }

	    public float getSalary(){
	        return salary;
	    }
	}




public class  Encapsulation  {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int n = scan.nextInt();
        scan.nextLine();

        Employee[] a = new Employee[n];

        for(int i = 0; i < a.length; i++) {

            a[i] = new Employee();

            System.out.println("Enter ID:");
            a[i].setId(scan.nextInt());
            scan.nextLine();

            System.out.println("Enter Name:");
            a[i].setName(scan.nextLine());

            System.out.println("Enter Email:");
            a[i].setEmail(scan.nextLine());

            System.out.println("Enter Department:");
            a[i].setDepartment(scan.nextLine());

            System.out.println("Enter Salary:");
            a[i].setSalary(scan.nextFloat());
            scan.nextLine();
        }

        System.out.println("\nEmployee Details:");

        for(int i = 0; i < a.length; i++) {

            System.out.println("ID: " + a[i].getId());
            System.out.println("Name: " + a[i].getName());
            System.out.println("Email: " + a[i].getEmail());
            System.out.println("Department: " + a[i].getDepartment());
            System.out.println("Salary: " + a[i].getSalary());
            System.out.println("-----------------------");
        }

        scan.close();
    }
}
