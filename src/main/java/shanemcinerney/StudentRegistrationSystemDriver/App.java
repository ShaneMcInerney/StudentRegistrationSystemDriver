package shanemcinerney.StudentRegistrationSystemDriver;


import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import shanemcinerney.StudentRegistrationSystem.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CourseProgramme computerScience = new CourseProgramme();
    	
    	Student s1 = new Student("Aashay","Teyssou",21,"7/1/94",1,computerScience);
    	Student s2 = new Student("Matthew","Shreshta",20,"8/3/95",2,computerScience);
    	Student s3 = new Student("John","Dough",19,"1/7/96",3,computerScience);
    	Student s4 = new Student("Mike","Rotch",21,"6/9/94",4,computerScience);
    	Student s5 = new Student("Hugh","Mungus",21,"9/6/94",5,computerScience);
    	Student s6 = new Student("John","Jacobs",21,"5/05/94",6,computerScience);
    	Student s7 = new Student("Kelly","Smith",21,"/1/94",7,computerScience);
    	Student s8 = new Student("Jane","Doe",20,"7/6/95",8,computerScience);
    	Student s9 = new Student("Dann","Keown",19,"6/1/96",9,computerScience);
    	Student s10 = new Student("Eoghan","Kelly",21,"7/1/94",10,computerScience);
    	    	
    	List<Module> moduleList = new ArrayList<Module>();
    	List<Student> studentList = new ArrayList<Student>();
    	
    	studentList.add(s1);
    	studentList.add(s2);
    	studentList.add(s3);
    	studentList.add(s4);
    	studentList.add(s5);
    	studentList.add(s6);
    	studentList.add(s7);
    	studentList.add(s8);
    	studentList.add(s9);
    	studentList.add(s10);
    	
    	Module m1 = new Module("Software Engineering","CT413",studentList);
    	Module m2 = new Module("Professional Skills","CT433",studentList);
    	Module m3 = new Module("Machine Learning","CT422",studentList);
    	Module m4 = new Module("Systems Simultaion","CT413",studentList);
    	Module m5 = new Module("Programming","CT456",studentList);
    	Module m6 = new Module("Graphics and Image Processing","CT471",studentList);
    	Module m7 = new Module("Networks","CT452",studentList);
    	
    	moduleList.add(m1);
    	moduleList.add(m2);
    	moduleList.add(m3);
    	moduleList.add(m4);
    	moduleList.add(m5);
    	moduleList.add(m6);
    	moduleList.add(m7);
    	
    	computerScience.setCourseName("Computer Science");
    	computerScience.setStartDate(new DateTime());
    	computerScience.setEndDate(new DateTime(2017,5,10,12,0));
    	computerScience.setModulesList(moduleList);
    	
    	for(Student s: studentList)
    	{
    		System.out.println("First Name: "+s.getFirstName());
    		System.out.println("Second Name: "+s.getSecondName());
    		System.out.println("Age: "+s.getAge());
    		System.out.println("Username: "+s.getUsername());
    		System.out.println("ID: "+s.getId());
    		System.out.println("DOB: "+s.getDateOfBirth());
    		System.out.println("Course: "+s.getProgramme().getCourseName());  	
    		for(Module m:s.getProgramme().getModulesList())
    		{
    			System.out.println("Regstered For: "+m.getModuleName());
    		}
    		
    		
    		System.out.println();
    		System.out.println();
    		
    	}
    	
       
    }
}
