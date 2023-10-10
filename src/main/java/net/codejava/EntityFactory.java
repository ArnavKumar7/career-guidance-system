package net.codejava;

public class EntityFactory {

    public static User createStudent(int id, String email, String password, String firstName, String lastName) {
        User user = new User();
        user.setId((long) id);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user;
    }

    public static Course createCourse(Long courseid, String coursename, int deptid, String coursediff) {
        Course course = new Course();
        course.setCourseid(courseid);
        course.setCoursename(coursename);
        course.setDeptid(deptid);
        course.setCoursediff(coursediff);
        return course;
    }

    public static Link createLink(int linkid, String links, int courseid) {
        Link link = new Link();
        link.setLinkid(linkid);
        link.setLinks(links);
        link.setCourseid(courseid);
        return link;
    }
    
    public static Dept createDept(Long deptid, String deptname, int gradyrs) {
    	Dept dept = new Dept();
    	dept.setDeptid(deptid);
    	dept.setDeptname(deptname);
    	dept.setGradyrs(gradyrs);
    	return dept;
    }  
}