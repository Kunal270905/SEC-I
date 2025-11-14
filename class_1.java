class Student{
    String name;
    int rollNo;
    String branch;
    String USN;
    int year;
    int age;
    String gender;

    Student(String name, int rollNo, String branch, String USN, int year, int age, String gender){
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
        this.USN = USN;
        this.year = year;
        this.age = age;
        this.gender = gender;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
        System.out.println("USN: " + USN);
        System.out.println("Year: " + year);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

public class class_1 {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101, "Computer Science", "CS101", 2, 20, "Female");
        Student student2 = new Student("Bob", 102, "Mechanical Engineering", "ME102", 3, 21, "Male");

        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
    }
}