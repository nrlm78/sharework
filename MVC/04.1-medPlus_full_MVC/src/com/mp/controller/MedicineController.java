package com.mp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.mp.dto.MedicineDto;
import com.mp.service.MedicineService;

public class MedicineController extends AbstractController {

	private MedicineService medicineService;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		ModelAndView mav = null;
		List<MedicineDto> medicineDtos = null;
		medicineDtos = medicineService.getMedicine();
		
		mav = new ModelAndView();
		mav.addObject("medicines", medicineDtos);
		mav.setViewName("medplus");
		return mav;
	}

	public void setMedicineService(MedicineService medicineService) {
		this.medicineService = medicineService;
	}

}
