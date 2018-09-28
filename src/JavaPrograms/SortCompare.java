package JavaPrograms;
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
}

//Complete the code
 class  StudentComparator implements Comparator<Student>{
    
	public int compare(Student s1, Student s2) {


        double cgpa1 = ((Student) s1).getCgpa();
        double cgpa2 = ((Student) s2).getCgpa();
        int cgpaComp = Double.compare(cgpa2,cgpa1);
        
      if (cgpaComp != 0) {
           return cgpaComp;
        } 

        String fname1 = ((Student) s1).getFname();
        String fname2 = ((Student) s2).getFname();
        int nameComp = fname1.compareTo(fname2);
        
        if (nameComp != 0) {
            return nameComp;
         } 

         int id1 = ((Student) s1).getId();
         int id2 = ((Student) s2).getId();
         
         return id1-id2;
	}

	

	
}


public  class SortCompare
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
          
        
        Collections.sort(studentList, new StudentComparator());
        for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}
	






