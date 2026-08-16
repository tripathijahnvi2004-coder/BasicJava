import java.util.Scanner;

public class EmployeeManagementSystem 
{
    int EmployeeID;
    String Employee_Name;
    String Department_Name;
    String Designation;
    int Age;
    double Salary;
    Scanner sc = new Scanner(System.in);

    void mainmenu() {
        System.out.println("1.Add Employee");
        System.out.println("2.Veiw Employee");
        System.out.println("3.Search Employee");
        System.out.println("4.Update Employee");
        System.out.println("6.Delete Employee");
        System.out.println("7.Exit");
        

    }

    void addemployee() {
        System.out.println("Enter the Employee ID: ");
        EmployeeID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Employee Name: ");
        Employee_Name = sc.nextLine();
        System.out.println("Enter the Department: ");
        Department_Name = sc.nextLine();
        System.out.println("Enter the Designation: ");
        Designation = sc.nextLine();
        System.out.println("Enter the age :");
        Age = sc.nextInt();
        System.out.println("Enter the Salary :");
        Salary = sc.nextDouble();


    }

    void viewemployee() {
        if (EmployeeID != 0) {
            System.out.println("Your Employee Name is :" + Employee_Name);
            System.out.println("Your Employee ID is :" + EmployeeID);
            System.out.println("Your Department is :" + Department_Name);
            System.out.println("Your Designation is :" + Designation);
            System.out.println("Age is :" + Age);
            System.out.println("Salary is :" + Salary);
        } else
            System.out.println("No Employee Available");
    }

    void searchemployee() {
        System.out.println("Press 1 if you want to search by EmployeeID and Press 2 if you want to search by Employee Name :");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Enter Employee ID");
                int ID = sc.nextInt();
                if (EmployeeID == ID) 
                {
                    System.out.println("Your Employee Name is :" + Employee_Name);
                    System.out.println("Your Employee ID is :" + EmployeeID);
                    System.out.println("Your Department is :" + Department_Name);
                    System.out.println("Your Designation is :" + Designation);
                    System.out.println("Age is :" + Age);
                    System.out.println("Salary is :" + Salary);

                    
                } else
                    System.out.println("Employee Not Found");
                break;
            case 2:
                sc.nextLine();
                System.out.println("Employee Name");
                String name = sc.nextLine();
                if (Employee_Name.equals(name)) 
                {
                    System.out.println("Your Employee Name is :" + Employee_Name);
                    System.out.println("Your Employee ID is :" + EmployeeID);
                    System.out.println("Your Department is :" + Department_Name);
                    System.out.println("Your Designation is :" + Designation);
                    System.out.println("Age is :" + Age);
                    System.out.println("Salary is :" + Salary);
                }
                else
                {
                        System.out.println("Book Not Found");
                }
                break;
                    
            default:
                System.out.println("Invalid Choice!!!");
                break;
        }

    }
    void updateemployee()
    {
        if(EmployeeID!=0)
        {
            
            System.out.println("Enter the Employee ID: ");
            EmployeeID = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Employee Name: ");
            Employee_Name = sc.nextLine();
            System.out.println("Enter the Department: ");
            Department_Name = sc.nextLine();
            System.out.println("Enter the Designation: ");
            Designation = sc.nextLine();
            System.out.println("Enter the age :");
            Age = sc.nextInt();
            System.out.println("Enter the Salary :");
            Salary = sc.nextDouble();

        }
        else
        {
            System.out.println("1.Update Employee ID");
            System.out.println("2.Update Employee Name");
            System.out.println("3.Update Department");
            System.out.println("4.Update Designation");
            System.out.println("6.Update Employee Age");
            System.out.println("7.Update Salary");
            
            int c=sc.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("Enter New Id");
                    int NewId = sc.nextInt();
                    EmployeeID= NewId;
                    break;
                case 2:
                    System.out.println("Enter New Name");
                    String  Name = sc.nextLine();
                    Employee_Name= Name;
                    break;
                case 3:
                    System.out.println("Enter New Department");
                    String Dept= sc.nextLine();
                    Department_Name= Dept;
                    break;
                case 4:
                    System.out.println("Enter New Designation");
                    String D= sc.nextLine();
                    Designation=D;
                    break;
                case 5:
                    System.out.println("Enter New Age");
                    int n_age=sc.nextInt();
                    Age=n_age;
                    break;
                case 6:
                    System.out.println("Enter New Salary");
                    int n_salary=sc.nextInt();
                    Age=n_salary;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }


        }
    }
    void deleteemployee() 
    {
        System.out.println("Confirm to delete the Employee then press 1:");
        int c = sc.nextInt();
        if (c == 1) {
            EmployeeID = 0;
            Employee_Name = "";
            Department_Name= "";
            Designation = "";
            Age = 0;
            Salary = 0;
            System.out.println("Book Deleted Sucessfully.");
        }

    }

    public static void main(String[] args) {
        EmployeeManagementSystem obj = new EmployeeManagementSystem();
        int choice;
        do {
            obj.mainmenu();
            System.out.println("Enter choice :");
            choice = obj.sc.nextInt();
            switch (choice) {
                case 1:
                    obj.addemployee();
                    break;
                case 2:
                    obj.viewemployee();
                    break;
                case 3:
                    obj.searchemployee();
                    break;
                case 4:
                    obj.updateemployee();
                    break;
                case 5:
                    obj.deleteemployee();
                    break;
                
                case 6:
                    System.out.println("Thank you!!!");
                    break;

                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }

        } while (choice != 7);
    }
}
