package EMS;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ems.dao.EmsDao;
@Controller
public class EMS_controller {
	 @RequestMapping("/adminlogin")
	 public ModelAndView adminlogin(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 String name=request.getParameter("name");
		 String paswd=request.getParameter("paswd");
		 ModelAndView mv=new ModelAndView(); 
		 String result=new EmsDao().adminLoginCheck(name,paswd);
		 if(result =="admin")
		 {
			 mv.setViewName("adminService");
		 }
		 else if(result =="user")  {
		      mv.setViewName("userService");
		 }
		 else
		 { 
			 mv.setViewName("fail");
			 }
		 return mv;
		 } 


	 @RequestMapping("/addEmployee")
	  public ModelAndView addEmpDetails(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {   
		 String uid=request.getParameter("uid");
		 String fname=request.getParameter("fname");
		 String lname=request.getParameter("lname");
		 String mail=request.getParameter("email");
		 String paswd=request.getParameter("paswd");
		 String dept=request.getParameter("dept");
		 String dob=request.getParameter("dob");
		 ModelAndView mv=new ModelAndView(); 
		 if(new EmsDao().addEmployee(uid,fname,lname,mail,paswd,dept,dob))
		 {
		//out.println("Successfully Registerd the employee details");
			 System.out.println("success");
			 mv.setViewName("adminService");
		 }
		 else
		 {   
			 System.out.println("failed");
			 mv.setViewName("adminService");
		 }
		 
		return mv;
	 }
	 @RequestMapping("/editEmployee")
	 public ModelAndView editEmpDetails(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 String uid=request.getParameter("uid");
		 String fname=request.getParameter("fname");
		 String lname=request.getParameter("lname");
		 String mail=request.getParameter("email");
		 //String paswd=request.getParameter("paswd");
		 String dept=request.getParameter("dept");
		 String dob=request.getParameter("dob");
		 ModelAndView mv=new ModelAndView(); 
		 if(new EmsDao().editEmployee(uid,fname,lname,mail,dept,dob))
		 {
			System.out.println("Successfully edited the employee details");
			 mv.setViewName("adminService");
		 }
		 else
		 {    
			 mv.setViewName("adminService");
		 }
		 
		return mv;
	 }
		 @RequestMapping("/deleteEmp")
	 public ModelAndView deleteEmpDetails(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 String uid=request.getParameter("uid");
		 ModelAndView mv=new ModelAndView(); 
		 if(new EmsDao().deleteEmployee(uid))
		 {
			System.out.println("Successfully deleted the employee details");
			 mv.setViewName("adminService");
		 }
		 else
		 {    
			 mv.setViewName("adminService");
		 }
		 
		return mv;
	 }
	 @RequestMapping("/AddDepartment")
	 public ModelAndView addDepartmentDetails(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 String deptid=request.getParameter("deptId");
		 String dname=request.getParameter("dname");
		 ModelAndView mv=new ModelAndView(); 
		 if(new EmsDao().addDepartment(deptid,dname))
		 {
			System.out.println("Successfully added department details");
			 mv.setViewName("adminService");
		 }
		 else
		 {    
			 mv.setViewName("adminService");
		 }
		 
		return mv;
	 }
	 @RequestMapping("/addregulations")
	 public ModelAndView addRegulationsDetails(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 String rtype=request.getParameter("RL_Type");
		 String rdetails=request.getParameter("RL_Details");
		 String cdate=request.getParameter("Cdate");
		 String dname=request.getParameter("dname");
		 ModelAndView mv=new ModelAndView(); 
		 if(new EmsDao().addRegulations(rtype,rdetails,cdate,dname))
		 {
			System.out.println("Successfully added new Regulation details");
			 mv.setViewName("adminService");
		 }
		 else
		 {    
			 mv.setViewName("adminService");
		 }
		 
		return mv;
	 }
	 @RequestMapping("/addEmp")
	 public ModelAndView addemp(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 ModelAndView mv=new ModelAndView(); 
		 mv.setViewName("addEmp");
	
	 return mv;
	 }
	 @RequestMapping("/editEmp")
	 public ModelAndView editemp(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 ModelAndView mv=new ModelAndView(); 
		 mv.setViewName("editEmp");
	
	 return mv;
	 }
	 @RequestMapping("/delEmp")
	 public ModelAndView delemp(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 ModelAndView mv=new ModelAndView(); 
		 mv.setViewName("delEmp");
	
	 return mv;
	 }
	 @RequestMapping("/addDept")
	 public ModelAndView adDept(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 ModelAndView mv=new ModelAndView(); 
		 mv.setViewName("addDept");
	
	 return mv;
	 }
	 @RequestMapping("/addReg")
	 public ModelAndView addRegl(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 ModelAndView mv=new ModelAndView(); 
		 mv.setViewName("addReg");
	
	 return mv;
	 }
	 	 @RequestMapping("/viewEmpdetails")
	 public ModelAndView viewempdetails(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 ModelAndView mv=new ModelAndView(); 
		 mv.setViewName("viewEmpdetails");
	
	 return mv;
	 }
	 @RequestMapping("/viewDept")
	 public ModelAndView viewDept(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 ModelAndView mv=new ModelAndView(); 
		 mv.setViewName("viewDept");
	
	 return mv;
	 }
	 @RequestMapping("/viewReg")
	 public ModelAndView viewReg(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 ModelAndView mv=new ModelAndView(); 
		 mv.setViewName("viewReg");
	
	 return mv;
	 }
	 @RequestMapping("/updateRegCom")
	 public ModelAndView updateRegCommments(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 ModelAndView mv=new ModelAndView(); 
		 mv.setViewName("updateRegCom");
	
	 return mv;
	 }
	 @RequestMapping("/trackStatus")
	 public ModelAndView trackCompilanceStatus(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 ModelAndView mv=new ModelAndView(); 
		 mv.setViewName("trackStatus");
	
	 return mv;
	 }
	 @RequestMapping("/home")
	 public ModelAndView homepage(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException
	 {
		 ModelAndView mv=new ModelAndView(); 
		 mv.setViewName("home");
	
	 return mv;
	 }
  }
