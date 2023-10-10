package net.codejava;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private DeptRepository deptRepo;
	
	@Autowired
	private CourseRepository courseRepo;
	
	@Autowired
	private LinkRepository linkRepo;
	
	@Autowired
	private TestRepository testRepo;
	
	private EntityFactory factory;
	
	private CourseSingleton courseinstance;
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		return "register_success";
	}
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		List<User> listUsers = userRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return "users";
	}
	
	@GetMapping("/careers")
	public String listCareers() {
		return "careers";
	}
	
	@GetMapping("/twelvth")
	public String listCourses(Model model) {
		List<Dept> listDept = deptRepo.findAll();
		model.addAttribute("listDept",listDept);
		
		return "twelvth";
	}
	
	@GetMapping("/add_department")
	public String showDeptForm(Model model) {
		model.addAttribute("dept",new Dept());
		
		return "deptadd";
	}
	
	@PostMapping("/process_add_dept")
	public String processAddDept(Dept dept) {
		Dept dept1 = EntityFactory.createDept(dept.getDeptid(), dept.getDeptname(), dept.getGradyrs());
		deptRepo.save(dept1);
		
		return "dept_success";
	}
	
	@GetMapping("/add_courses")
	public String showCoursesForm(Model model) {
		CourseSingleton course_instance = CourseSingleton.getInstance();
		model.addAttribute("course",new Course());
		return "courseadd";
	}
	
	@PostMapping("/process_add_course")
	public String processAddCourse(Course course) {
		Course course1 = EntityFactory.createCourse(course.getCourseid(), course.getCoursename(), course.getDeptid(), course.getCoursediff());
		courseRepo.save(course1);
		
		return "dept_success";
	}
	
	@GetMapping("/showCourses/{id}")
	public String showCourses(@PathVariable(value="id") int id, Model model) {
		List<Course> listcourse = (List<Course>) courseRepo.findByDeptId(id);
		model.addAttribute("course", listcourse);
		
		return "courses";
	}
	
	@GetMapping("/showLinks/{id}")
	public String showLinks(@PathVariable(value="id") int id, Model model) {
		List<Link> listLink = (List<Link>) linkRepo.findByCourseId(id);
		model.addAttribute("link", listLink);
		
		return "links";
	}
	
	@GetMapping("/giveTest/{id}")
	public String giveTest(@PathVariable(value="id") int id, Model model) {
		List<Test> listtest = (List<Test>) testRepo.findByCourseId(id);
		System.out.println(listtest);
		model.addAttribute("test", listtest);
		
		return "test";
	}
	
	@GetMapping("/showAnswer/{id}")
	public String showAnswer(@PathVariable(value="id") int id, Model model) {
		List<Test> listanswer= (List<Test>) testRepo.findByQuestionId(id);
		model.addAttribute("test", listanswer);
		
		return "answer";
	}
	
	
}
