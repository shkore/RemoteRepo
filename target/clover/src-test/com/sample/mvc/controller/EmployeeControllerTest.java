/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.controller;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.sample.mvc.controller.EmployeeController;
import com.sample.mvc.domain.Employee;
import com.sample.mvc.service.EmployeeService;

public class EmployeeControllerTest extends EmployeeController {static class __CLR3_1_124747hvggipjz{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0041\u004c\u004d\u0057\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0045\u006d\u0070\u004d\u006e\u0067\u006d\u0074\u0053\u0079\u0073\u0074\u0065\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1400666247532L,8589935092L,185,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}

	Employee emp = new Employee();
	Employee employee = new Employee();
	private HttpServletRequest HttpServletRequest;
	private HttpServletResponse HttpServletResponse;
	List<Employee> empLst = new ArrayList<Employee>();
	List<Employee> employeeList = new ArrayList<Employee>();
	EmployeeService empService = new EmployeeService();

	/**
	 * Test EmployeeController with positive and negative scenario
	 * 
	 * @throws Exception
	 */
	@Test
	public void testEmployeeControllerTrue() throws Exception {__CLR3_1_124747hvggipjz.R.globalSliceStart(getClass().getName(),151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_124dkij547();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_124747hvggipjz.R.rethrow($CLV_t2$);}finally{__CLR3_1_124747hvggipjz.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeControllerTest.testEmployeeControllerTrue",151,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_124dkij547() throws Exception{try{__CLR3_1_124747hvggipjz.R.inc(151);
		__CLR3_1_124747hvggipjz.R.inc(152);EmployeeController empController = new EmployeeController();
		__CLR3_1_124747hvggipjz.R.inc(153);HttpServletRequest mockRequest = (HttpServletRequest) mock(HttpServletRequest.class);
		__CLR3_1_124747hvggipjz.R.inc(154);HttpServletResponse mockResponse = (HttpServletResponse) mock2(HttpServletResponse.class);
		__CLR3_1_124747hvggipjz.R.inc(155);emp.setCode(1);
		__CLR3_1_124747hvggipjz.R.inc(156);emp.setName("cybage");
		__CLR3_1_124747hvggipjz.R.inc(157);emp.setCity("Delhi");
		__CLR3_1_124747hvggipjz.R.inc(158);empLst.add(emp);
		__CLR3_1_124747hvggipjz.R.inc(159);empService.setEmployeeList(empLst);
		__CLR3_1_124747hvggipjz.R.inc(160);empController.setEmployeeService(empService);
		__CLR3_1_124747hvggipjz.R.inc(161);assertNotNull(emp);

	}finally{__CLR3_1_124747hvggipjz.R.flushNeeded();}}

	private HttpServletRequest mock(Class<HttpServletRequest> class1) {try{__CLR3_1_124747hvggipjz.R.inc(162);
		__CLR3_1_124747hvggipjz.R.inc(163);return HttpServletRequest;
	}finally{__CLR3_1_124747hvggipjz.R.flushNeeded();}}

	private HttpServletResponse mock2(Class<HttpServletResponse> class1) {try{__CLR3_1_124747hvggipjz.R.inc(164);
		__CLR3_1_124747hvggipjz.R.inc(165);return HttpServletResponse;
	}finally{__CLR3_1_124747hvggipjz.R.flushNeeded();}}
	
	@Test
	public void testSetEmployeeService() {__CLR3_1_124747hvggipjz.R.globalSliceStart(getClass().getName(),166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12pqhq0y4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_124747hvggipjz.R.rethrow($CLV_t2$);}finally{__CLR3_1_124747hvggipjz.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeControllerTest.testSetEmployeeService",166,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12pqhq0y4m(){try{__CLR3_1_124747hvggipjz.R.inc(166);
		__CLR3_1_124747hvggipjz.R.inc(167);EmployeeService employeeService = new EmployeeService();
		__CLR3_1_124747hvggipjz.R.inc(168);assertNotNull(employeeService);
	}finally{__CLR3_1_124747hvggipjz.R.flushNeeded();}}
	
	@Test
	public void testHandleRequestInternal() {__CLR3_1_124747hvggipjz.R.globalSliceStart(getClass().getName(),169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR3_1_12c83k1z4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR3_1_124747hvggipjz.R.rethrow($CLV_t2$);}finally{__CLR3_1_124747hvggipjz.R.globalSliceEnd(getClass().getName(),"com.sample.mvc.controller.EmployeeControllerTest.testHandleRequestInternal",169,$CLV_p$,$CLV_t$);}}private void  __CLR3_1_12c83k1z4p(){try{__CLR3_1_124747hvggipjz.R.inc(169);
		__CLR3_1_124747hvggipjz.R.inc(170);emp.setCode(11);
		__CLR3_1_124747hvggipjz.R.inc(171);emp.setName("cybage");
		__CLR3_1_124747hvggipjz.R.inc(172);emp.setCity("Delhi");
		__CLR3_1_124747hvggipjz.R.inc(173);employee.setCode(12);
		__CLR3_1_124747hvggipjz.R.inc(174);employee.setName("cyb");
		__CLR3_1_124747hvggipjz.R.inc(175);employee.setCity("Delhi");
		__CLR3_1_124747hvggipjz.R.inc(176);employeeList.add(emp);
		__CLR3_1_124747hvggipjz.R.inc(177);employeeList.add(employee);
		__CLR3_1_124747hvggipjz.R.inc(178);empService.setEmployeeList(employeeList);
		__CLR3_1_124747hvggipjz.R.inc(179);EmployeeController test = new EmployeeController();
		__CLR3_1_124747hvggipjz.R.inc(180);test.setEmployeeService(empService);
		__CLR3_1_124747hvggipjz.R.inc(181);try {
			__CLR3_1_124747hvggipjz.R.inc(182);ModelAndView check = test.handleRequestInternal(HttpServletRequest, HttpServletResponse);
			__CLR3_1_124747hvggipjz.R.inc(183);assertNotNull(check);
		} catch (Exception e) {
			__CLR3_1_124747hvggipjz.R.inc(184);e.printStackTrace();
		}
	}finally{__CLR3_1_124747hvggipjz.R.flushNeeded();}}
}
