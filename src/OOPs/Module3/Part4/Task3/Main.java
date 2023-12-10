package OOPs.Module3.Part4.Task3;

import java.io.*;

class Student implements Serializable {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Course implements Serializable {
    private String courseCode;
    private String courseName;
    private String instructor;

    public Course(String courseCode, String courseName, String instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    // Getters and setters

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

}

class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    // Getters and setters
    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create instances of Student, Course, and Enrollment
        Student student = new Student(1, "John Doe", 20);
        Course course = new Course("CS101", "Introduction to Computer Science", "Prof. Smith");
        Enrollment enrollment = new Enrollment(student, course, "2023-01-10");

        // Serialize and save the Enrollment instance
        serializeAndSave(enrollment, "enrollments.ser");

        // Deserialize and print the Enrollment instance
        Enrollment deserializedEnrollment = deserialize("enrollments.ser");
        if (deserializedEnrollment != null) {
            System.out.println("Deserialized Enrollment Information:");
            System.out.println("Student: " + deserializedEnrollment.getStudent().getName());
            System.out.println("Course: " + deserializedEnrollment.getCourse().getCourseName());
            System.out.println("Enrollment Date: " + deserializedEnrollment.getEnrollmentDate());
        }
    }

    private static void serializeAndSave(Enrollment enrollment, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(enrollment);
            System.out.println("Enrollment serialized and saved to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Enrollment deserialize(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Enrollment) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
