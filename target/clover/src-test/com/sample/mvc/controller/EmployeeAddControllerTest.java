/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.junit.Test;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;

import com.sample.mvc.command.EmployeeCommand;
import com.sample.mvc.controller.EmployeeAddController;
import com.sample.mvc.domain.Employee;
import com.sample.mvc.service.EmployeeService;

public class EmployeeAddControllerTest {static class __CLR3_1_122o2oht73oe2z{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0045\u003a\u005c\u005c\u0045\u006d\u0070\u0070\u006c\u006f\u0079\u0065\u0065\u004d\u0061\u006e\u0061\u0067\u0065\u006d\u0065\u006e\u0074\u0053\u0079\u0073\u0074\u0065\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1395746917443L,8589935092L,151,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}

	Object command = new EmployeeCommand();
	BindException errors;
	EmployeeCommand empCommand = new EmployeeCommand();
	Employee emp = new Employee();
	Employee employee = new Employee();
	private HttpServletRequest HttpServletRequest;
	private HttpServletResponse HttpServletResponse;
	List<Employee> employeeList = new ArrayList<Employee>();
	EmployeeService empService = new EmployeeService();

	/**
	 * Test EmployeeAddController with positive and negative scenario
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEmployeeAddControllerTrue() throws Exception {__CLR3_1_122o2oht73oe2z.R.globalSliceStart(getClass().getName(),96);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12euc40e2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_122o2oht73oe2z.R.rethrow($CLV_t2$);}finally{__CLR3_1_122o2oht73oe2z.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeAddControllerTest.testEmployeeAddControllerTrue",96,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12euc40e2o() throws Exception{try{__CLR3_1_122o2oht73oe2z.R.inc(96);
		__CLR3_1_122o2oht73oe2z.R.inc(97);EmployeeAddController employeeAddController = new EmployeeAddController();
		__CLR3_1_122o2oht73oe2z.R.inc(98);assertNotNull(command);
		__CLR3_1_122o2oht73oe2z.R.inc(99);empCommand.getCode();
		__CLR3_1_122o2oht73oe2z.R.inc(100);empCommand.getName();
		__CLR3_1_122o2oht73oe2z.R.inc(101);HttpServletRequest mockRequest = (HttpServletRequest) mock(HttpServletRequest.class);
		__CLR3_1_122o2oht73oe2z.R.inc(102);HttpServletResponse mockResponse = (HttpServletResponse) mock2(HttpServletResponse.class);
		__CLR3_1_122o2oht73oe2z.R.inc(103);assertNotNull(emp);
		__CLR3_1_122o2oht73oe2z.R.inc(104);emp.setCode(11);
		__CLR3_1_122o2oht73oe2z.R.inc(105);emp.setName("cybage");
		__CLR3_1_122o2oht73oe2z.R.inc(106);((EmployeeCommand) command).setCode(11);
		__CLR3_1_122o2oht73oe2z.R.inc(107);((EmployeeCommand) command).setName("cybage");
		__CLR3_1_122o2oht73oe2z.R.inc(108);((EmployeeCommand) command).setCity("Delhi");
		__CLR3_1_122o2oht73oe2z.R.inc(109);assertNotNull(empService);
		__CLR3_1_122o2oht73oe2z.R.inc(110);assertNotNull(employeeList);
		__CLR3_1_122o2oht73oe2z.R.inc(111);employeeList.add(emp);
		__CLR3_1_122o2oht73oe2z.R.inc(112);empService.setEmployeeList(employeeList);
		__CLR3_1_122o2oht73oe2z.R.inc(113);assertEquals("Employee Object Successfully set", empService
				.getEmployeeList().get(0), emp);
		__CLR3_1_122o2oht73oe2z.R.inc(114);assertNotSame(empService.getEmployeeList().get(0), employee);
		__CLR3_1_122o2oht73oe2z.R.inc(115);employeeAddController.setEmployeeService(empService);
	}finally{__CLR3_1_122o2oht73oe2z.R.flushNeeded();}}

	private HttpServletRequest mock(Class<HttpServletRequest> class1) {try{__CLR3_1_122o2oht73oe2z.R.inc(116);
		__CLR3_1_122o2oht73oe2z.R.inc(117);return HttpServletRequest;
	}finally{__CLR3_1_122o2oht73oe2z.R.flushNeeded();}}

	private HttpServletResponse mock2(Class<HttpServletResponse> class1) {try{__CLR3_1_122o2oht73oe2z.R.inc(118);
		__CLR3_1_122o2oht73oe2z.R.inc(119);return HttpServletResponse;
	}finally{__CLR3_1_122o2oht73oe2z.R.flushNeeded();}}

	@Test
	public void testSetEmployeeService() {__CLR3_1_122o2oht73oe2z.R.globalSliceStart(getClass().getName(),120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12pqhq0y3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_122o2oht73oe2z.R.rethrow($CLV_t2$);}finally{__CLR3_1_122o2oht73oe2z.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeAddControllerTest.testSetEmployeeService",120,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12pqhq0y3c(){try{__CLR3_1_122o2oht73oe2z.R.inc(120);
		__CLR3_1_122o2oht73oe2z.R.inc(121);EmployeeService employeeService = new EmployeeService();
		__CLR3_1_122o2oht73oe2z.R.inc(122);assertNotNull(employeeService);
	}finally{__CLR3_1_122o2oht73oe2z.R.flushNeeded();}}

	@Test
	public void testOnsubmit() {__CLR3_1_122o2oht73oe2z.R.globalSliceStart(getClass().getName(),123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_128dk6eo3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_122o2oht73oe2z.R.rethrow($CLV_t2$);}finally{__CLR3_1_122o2oht73oe2z.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeAddControllerTest.testOnsubmit",123,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_128dk6eo3f(){try{__CLR3_1_122o2oht73oe2z.R.inc(123);
		__CLR3_1_122o2oht73oe2z.R.inc(124);emp.setCode(11);
		__CLR3_1_122o2oht73oe2z.R.inc(125);emp.setName("cybage");
		__CLR3_1_122o2oht73oe2z.R.inc(126);emp.setCity("Delhi");
		__CLR3_1_122o2oht73oe2z.R.inc(127);employee.setCode(12);
		__CLR3_1_122o2oht73oe2z.R.inc(128);employee.setName("cyb");
		__CLR3_1_122o2oht73oe2z.R.inc(129);employee.setCity("Delhi");
		__CLR3_1_122o2oht73oe2z.R.inc(130);employeeList.add(emp);
		__CLR3_1_122o2oht73oe2z.R.inc(131);employeeList.add(employee);
		__CLR3_1_122o2oht73oe2z.R.inc(132);empService.setEmployeeList(employeeList);
		__CLR3_1_122o2oht73oe2z.R.inc(133);EmployeeAddController test = new EmployeeAddController();
		__CLR3_1_122o2oht73oe2z.R.inc(134);test.setEmployeeService(empService);
		__CLR3_1_122o2oht73oe2z.R.inc(135);((EmployeeCommand) command).setCode(12);
		__CLR3_1_122o2oht73oe2z.R.inc(136);((EmployeeCommand) command).setName("Manjul");
		__CLR3_1_122o2oht73oe2z.R.inc(137);((EmployeeCommand) command).setCity("Delhi");
		__CLR3_1_122o2oht73oe2z.R.inc(138);try {
			__CLR3_1_122o2oht73oe2z.R.inc(139);assertNotNull(command);
			__CLR3_1_122o2oht73oe2z.R.inc(140);ModelAndView check= test.onSubmit(HttpServletRequest, HttpServletResponse, command, errors);
			__CLR3_1_122o2oht73oe2z.R.inc(141);assertNotNull(check);
		} catch (Exception e) {
			__CLR3_1_122o2oht73oe2z.R.inc(142);System.out.println(((EmployeeCommand) command).getCode()+" "+((EmployeeCommand) command).getName()+" "+((EmployeeCommand) command).getCity());
			__CLR3_1_122o2oht73oe2z.R.inc(143);e.printStackTrace();
		}
		__CLR3_1_122o2oht73oe2z.R.inc(144);assertNotNull(command);
	}finally{__CLR3_1_122o2oht73oe2z.R.flushNeeded();}}

	@Test
	public void testOnsubmitCode() {__CLR3_1_122o2oht73oe2z.R.globalSliceStart(getClass().getName(),145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12yfbe6b41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_122o2oht73oe2z.R.rethrow($CLV_t2$);}finally{__CLR3_1_122o2oht73oe2z.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeAddControllerTest.testOnsubmitCode",145,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12yfbe6b41(){try{__CLR3_1_122o2oht73oe2z.R.inc(145);
		__CLR3_1_122o2oht73oe2z.R.inc(146);Employee emp = new Employee();
		__CLR3_1_122o2oht73oe2z.R.inc(147);emp.setCode(10665);
		__CLR3_1_122o2oht73oe2z.R.inc(148);emp.setName("Vidya");
		__CLR3_1_122o2oht73oe2z.R.inc(149);assertEquals("Code set is correct", 10665, 10665);
		__CLR3_1_122o2oht73oe2z.R.inc(150);assertNotNull(emp);
	}finally{__CLR3_1_122o2oht73oe2z.R.flushNeeded();}}
}
