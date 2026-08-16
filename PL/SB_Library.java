import java.util.Scanner;

public class SB_Library {
    int BookID;
    String Book_Name;
    String Author_Name;
    String Book_Category;
    int Total_Copies;
    int Available_copies;
    int StudentID;
    String Student_Name;
    Scanner sc = new Scanner(System.in);

    void mainmenu() {
        System.out.println("1.Add Book");
        System.out.println("2.Veiw Book");
        System.out.println("3.Search Book");
        System.out.println("4.Issue Book");
        System.out.println("5.Return Book");
        System.out.println("6.Delete Book");
        System.out.println("7.Library Report");
        System.out.println("8.Exit");

    }

    void addbook() {
        System.out.println("Enter the Book ID: ");
        BookID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Book Name: ");
        Book_Name = sc.nextLine();
        System.out.println("Enter the Author Name: ");
        Author_Name = sc.nextLine();
        System.out.println("Enter the Book Category: ");
        Book_Category = sc.nextLine();
        System.out.println("Enter total Copies of the book :");
        Total_Copies = sc.nextInt();
    }

    void viewbook() {
        if (BookID != 0) {
            System.out.println("Your Book Name is :" + Book_Name);
            System.out.println("Your Book's Author Name is :" + Author_Name);
            System.out.println("Your Book's Category is :" + Book_Category);
            System.out.println("TOtal Copies are :" + Total_Copies);
            System.out.println("Available Copies are :" + Available_copies);
        } else
            System.out.println("No Book Available");
    }

    void searchbook() {
        System.out.println("Press 1 if you want to search by BookID and Press 2 if you want to search by Book Name :");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Enter Book ID");
                int ID = sc.nextInt();
                if (BookID == ID) {
                    System.out.println("Your Book Name is :" + Book_Name);
                    System.out.println("Your Book's Author Name is :" + Author_Name);
                    System.out.println("Your Book's Category is :" + Book_Category);
                    System.out.println("TOtal Copies are :" + Total_Copies);
                    System.out.println("Available Copies are :" + Available_copies);
                } else
                    System.out.println("Book Not Found");
                break;
            case 2:
                sc.nextLine()
                System.out.println("Enter Book Name");
                String name = sc.nextLine();
                if (Book_Name == name) {
                    System.out.println("Your Book Name is :" + Book_Name);
                    System.out.println("Your Book's Author Name is :" + Author_Name);
                    System.out.println("Your Book's Category is :" + Book_Category);
                    System.out.println("TOtal Copies are :" + Total_Copies);
                    System.out.println("Available Copies are :" + Available_copies);
                } else
                    System.out.println("Book Not Found");
                break;
            default:
                System.out.println("Invalid Choice!!!");
                break;
        }

    }

    void issuebook() {
        if (BookID != 0 && Total_Copies > 0) {
            System.out.println("Enter your Name :");
            Student_Name = sc.nextLine();
            System.out.println("Enter your Student ID :");
            StudentID = sc.nextInt();
            System.out.println("You issued " + Book_Name);
            Available_copies = Total_Copies - 1;
        } else
            System.out.println("Book Not Available");

    }

    void returnbook() {
        System.out.println("Enter your Student ID :");
        int ID = sc.nextInt();
        if (ID == StudentID) {
            Available_copies = Available_copies + 1;
            System.out.println(Book_Name + "Book Returned Successfully.");
        }
    }

    void deletebook() {
        System.out.println("Confirm to delete the Book then press 1:");
        int c = sc.nextInt();
        if (c == 1) {
            BookID = 0;
            Book_Name = "";
            Author_Name = "";
            Book_Category = "";
            Total_Copies = 0;
            Available_copies = 0;
            System.out.println("Book Deleted Sucessfully.");
        }

    }

    void libraryreport() {
        if (BookID != 0) {
            System.out.println("Your Book Name is :" + Book_Name);
            System.out.println("Your Book's Author Name is :" + Author_Name);
            System.out.println("TOtal Copies are :" + Total_Copies);
            System.out.println("Available Copies are :" + Available_copies);
            System.out.println("Total Books Issues :" + (Total_Copies - Available_copies));
            System.out.println("Student Name : " + Student_Name);
            System.out.println("Student ID :" + StudentID);
        } else
            System.out.println("No Book Available");
    }

    public static void main(String[] args) {
        SB_Library obj = new SB_Library();
        int choice;
        do {
            obj.mainmenu();
            System.out.println("Enter choice :");
            choice = obj.sc.nextInt();
            switch (choice) {
                case 1:
                    obj.addbook();
                    break;
                case 2:
                    obj.viewbook();
                    break;
                case 3:
                    obj.searchbook();
                    break;
                case 4:
                    obj.issuebook();
                    break;
                case 5:
                    obj.returnbook();
                    break;
                case 6:
                    obj.deletebook();
                    break;
                case 7:
                    obj.libraryreport();
                    break;
                case 8:
                    System.out.println("Thank you!!!");
                    break;

                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }

        } while (choice != 8);
    }
}
