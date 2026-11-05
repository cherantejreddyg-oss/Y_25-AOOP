class Student {
    int studentId;
    String name;
    int age;

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentId = 101;
        s1.name = "Rahul";
        s1.age = 20;

        Student s2 = new Student();
        s2.studentId = 102;
        s2.name = "Teja";
        s2.age = 21;

        Student s3 = new Student();
        s3.studentId = 103;
        s3.name = "Arun";
        s3.age = 19;

        System.out.println("Student 1 Details:");
        System.out.println("ID: " + s1.studentId);
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        System.out.println("\nStudent 2 Details:");
        System.out.println("ID: " + s2.studentId);
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);

        System.out.println("\nStudent 3 Details:");
        System.out.println("ID: " + s3.studentId);
        System.out.println("Name: " + s3.name);
        System.out.println("Age: " + s3.age);
    }
}