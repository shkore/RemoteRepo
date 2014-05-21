/* $$ This file has been instrumented by Clover 3.1.12#20130627143542579 $$ */package com.sample.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

import com.sample.mvc.command.EmployeeCommand;
import com.sample.mvc.domain.Employee;
import com.sample.mvc.service.EmployeeService;

public class EmployeeAddController extends SimpleFormController{public static class __CLR3_1_12cchvggip88{public static com_cenqua_clover.CoverageRecorder R;public static com_cenqua_clover.CloverProfile[] profiles = { };static{com_cenqua_clover.CoverageRecorder _R=null;try{com_cenqua_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___3_1_12();if(20130627143542579L!=com_cenqua_clover.CloverVersionInfo.getBuildStamp()){com_cenqua_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_cenqua_clover.Clover.l("[CLOVER] WARNING: Instr=3.1.12#20130627143542579,Runtime="+com_cenqua_clover.CloverVersionInfo.getReleaseNum()+"#"+com_cenqua_clover.CloverVersionInfo.getBuildStamp());}R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getNullRecorder();_R=com_cenqua_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0041\u004c\u004d\u0057\u006f\u0072\u006b\u0073\u0070\u0061\u0063\u0065\u005c\u005c\u0045\u006d\u0070\u004d\u006e\u0067\u006d\u0074\u0053\u0079\u0073\u0074\u0065\u006d\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1400666246994L,8589935092L,22,profiles,new String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}
	
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {try{__CLR3_1_12cchvggip88.R.inc(12);
		__CLR3_1_12cchvggip88.R.inc(13);this.employeeService = employeeService;
	}finally{__CLR3_1_12cchvggip88.R.flushNeeded();}}
	
	/* 
	 * submit employee data
	 */
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {try{__CLR3_1_12cchvggip88.R.inc(14);
		
		__CLR3_1_12cchvggip88.R.inc(15);EmployeeCommand empCommand = (EmployeeCommand) command;
			__CLR3_1_12cchvggip88.R.inc(16);Employee e = new Employee();
			__CLR3_1_12cchvggip88.R.inc(17);e.setCode(empCommand.getCode());
			__CLR3_1_12cchvggip88.R.inc(18);e.setName(empCommand.getName());
			__CLR3_1_12cchvggip88.R.inc(19);e.setCity(empCommand.getCity());
			__CLR3_1_12cchvggip88.R.inc(20);employeeService.addEmployee(e);
		__CLR3_1_12cchvggip88.R.inc(21);return new ModelAndView(new RedirectView(getSuccessView()));
	}finally{__CLR3_1_12cchvggip88.R.flushNeeded();}}
}
