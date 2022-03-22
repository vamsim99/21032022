import java.math.BigInteger;
import java.util.Scanner;

public class Employee {
    void details(){}
    @Deprecated
    void test(){
        System.out.println("testing!!!");
    }
}
class Info extends Employee{
    @Override
    void details() {
        super.details();
        Scanner input=new Scanner(System.in);
        String name,address,email;
        System.out.println("enter the employee name: ");
        name=input.nextLine();
        System.out.println("enter the employee address: ");
        address=input.nextLine();
        System.out.println("enter the employee email: ");
        email=input.nextLine();
        int age;
        BigInteger phone;
        System.out.println("enter the employee age: ");
        age = input.nextInt();
        System.out.println("enter the employee phone no: ");
        phone=input.nextBigInteger();
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Phoneno: "+phone);

    }
    public @interface Myannotation{}
    @Myannotation()
    public static void main(String[] args) {
        Info obj=new Info();
        obj.test();
        obj.details();
    }
}


