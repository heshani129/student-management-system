import java.util.Scanner;
public class Client{
    public static void main(String[]args){

        Studentdaointerface dao = new StudentDao();
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to student Management Application");
while(true) {
    System.out.println("\n1.Add student" + "\n2.Show all students"+
            "\n3.get student based on roll number"+
            "\n4.delete student"+
            "\n5.update student"+
            "\n6.exit");
    System.out.println("enter choice");
    int ch = sc.nextInt();
    switch (ch){
        case 1:
            System.out.println("Add Student");
            System.out.println("Enter student name");
            String name = sc.next();
            System.out.println("Enter student cls name");
            String clgName = sc.next();
            System.out.println("enter city");
            String city = sc.next();
            System.out.println("Enter percentage");
            double percentage = sc.nextDouble();
            Student st= new Student(name,clgName,city,percentage);
boolean ans =dao.insertStudent(st);
           if(ans) {
               System.out.println("record entered successfully");
           }  else
                System.out.println("something went wrong ,please try again");



            break;
        case 2:
            System.out.println("Show all students");
            break;
        case 3:
            System.out.println("get student based on rollnumber");
            break;
        case 4:
            System.out.println("delete student");
            break;
        case 5:
            System.out.println("update the student");
            break;
        case 6:
            System.out.println("thank you for using stu. mana. sys");
        default:
            System.out.println("please enter valid choice");
    }
}
}
    }
