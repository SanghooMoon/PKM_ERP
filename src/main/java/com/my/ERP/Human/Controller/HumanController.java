package com.my.ERP.Human.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HumanController {
	
	// 인사기본관리
	@RequestMapping("HumanManager")
	public String HumanMain() {
		return "HumanManager";
	}
	
	// 급여관리
	@RequestMapping("SalaryManager")
	public String SalaryMain() {
		return "SalaryManager";
	}
	
	// 휴가관리
	@RequestMapping("VacationManager")
	public String VacationMain() {
		return "VacationManager";
	}
	// 직급관리
	@RequestMapping("PositionManager")
	public String PositionMain() {
		return "PositionManager";
	}
	
	// 마이페이지
	@RequestMapping("MyInfo")
	public String MyinfoMain() {
		return "MyInfo";
	}
}
