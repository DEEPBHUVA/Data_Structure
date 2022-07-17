// Create array of object of class Student_Detail with attributes Enrollment_no, Name, Sem, CPI for 5 
// students, scan their information and print it. 

//import java.util.Scanner;
class Student_Detail{
	long Enrollment_no;
	String Name;
	int Sem;
	double Cpi;

	Student_Detail(long Enrollment_no,String Name,int Sem,double Cpi){
		this.Enrollment_no=Enrollment_no;
		this.Name=Name;
		this.Sem=Sem;
		this.Cpi=Cpi;
	}

	public void displydata(){
		System.out.println("Enrollment no is:"+Enrollment_no);
		System.out.println("Name:"+Name);
		System.out.println("Semester:"+Sem);
		System.out.println("Cpi is:"+Cpi);
		System.out.println();
	}
}

public class Student{
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		Student_Detail obj[]=new Student_Detail[5]; //Here ojb is Reference
		obj[0]=new Student_Detail(210101,"Avinash",3,8.7);
		obj[1]=new Student_Detail(210102,"Prince",3,8.9);
		obj[2]=new Student_Detail(210103,"Priya",3,7.7);
		obj[3]=new Student_Detail(210104,"Kelvin",3,8.5);
		obj[4]=new Student_Detail(210105,"Prinit",3,6.7);

		for(int i=0;i<5;i++){
			obj[i].displydata();
		}
	}
}
