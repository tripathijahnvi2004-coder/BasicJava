import java.util.Scanner;
class StudentGradeSystem
{
    public void studentdetails()
    {
        String name=" ";
        long rollno;
        Byte Python,C,Java;
        short Total;
        float per;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter rollno");
        rollno=sc.nextLong();
        System.out.println("Enter marks");
        Python=sc.nextByte();
        C= sc.nextByte();
        Java=sc.nextByte();
        Total=(short)(Python+C+Java);
        per=Total/3;
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("Total:"+Total);
        System.out.println("Percentage:"+per);
        
        if(per>90)
        {
            System.out.println("Grade A");

        }
        else if(per>65)
        {
           System.out.println("Grade B"); 
        }
        else
        {
            System.out.println("Fail");
        }
    }
    public static void main(String[] args) 
    {
        StudentGradeSystem obj=new StudentGradeSystem();
        obj.studentdetails();

    }



}
