public class Student {
    //Class is the blueprint (collection of objects is called a class)
    //objects are real world real world instances of the class
    String name ;
    int age ;
    int rollNo ;
//
    //Constructors
    Student(String name , int age , int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;

    }
//
    //method to display
    void displayDetails(){
        System.out.println("name:" + name);
        System.out.println("age:"+ age);
        System.out.println("rollNo:" + rollNo);
    }

    public static void main(String[] args) {
        Student s1 = new Student("tejas", 21, 64);
        s1.displayDetails();

        Student s2 = new Student("Naman" , 20 , 53);
        s2.displayDetails();
    }
}


