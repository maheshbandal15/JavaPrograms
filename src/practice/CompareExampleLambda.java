package com.test;
import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", cgpa=" + cgpa + "]";
	}
	
}

//Complete the code
public class CompareExampleLambda
{
	public static void main(String[] args){
		/*Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}*/
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(33, "Rumpa", 3.68));
		studentList.add(new Student(85, "Ashis", 3.85));
		studentList.add(new Student(56, "Samiha", 3.75));
		studentList.add(new Student(19, "Samara", 3.75));
		studentList.add(new Student(22, "Fahim", 3.76));
        Comparator<Student> studentComparator =(a,b)-> {
            if(a.getCgpa() == b.getCgpa()) {
                if(a.getFname().equals(b.getFname()))
                    return a.getId() - b.getId();
                else
                    return a.getFname().compareTo(b.getFname());
            } else if(a.getCgpa() < b.getCgpa())
            		return 1;
            return -1;/*(int) ((int)a.getCgpa() - b.getCgpa());*/
        };
        studentList.sort(studentComparator.reversed());
        
      	for(Student st: studentList){
			System.out.println(st.toString());
		}
	}
}



