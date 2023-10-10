package net.codejava;

public class CourseSingleton {
    private static CourseSingleton instance = null;
    private Course course;

    private CourseSingleton() {
        course = new Course();
    }

    public static CourseSingleton getInstance() {
        if (instance == null) {
            instance = new CourseSingleton();
        }
        return instance;
    }

    public Course getCourse() {
        return course;
    }
}
