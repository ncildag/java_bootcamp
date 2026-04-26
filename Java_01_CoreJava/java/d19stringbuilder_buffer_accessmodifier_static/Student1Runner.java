package d19stringbuilder_buffer_accessmodifier_static;

public class Student1Runner {
    public static void main(String[] args) {

        System.out.println(Student1.stdName); //Ali Can - static variable

        Student1 ali = new Student1();
        System.out.println(ali.age); //18 - non-static variable

        Student1.staticMethod(); //Ben static bir metodum
        ali.nonStaticMethod(); //Ben non-static bir metodum

    }
}
