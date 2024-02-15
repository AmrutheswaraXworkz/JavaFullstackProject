package com.vmanage.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.vmanage.entity.VManageEntity;
import com.vmanage.service.VManageService;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class VManageController {

	@Autowired
	private VManageService service;

	public VManageController() {
		System.out.println("VManageController");
	}

	@PostMapping("/vendor")
	public String saveDetails(Model model, @Valid VManageEntity entity, BindingResult errors) {

		if (errors.hasErrors()) {
			List<ObjectError> objectErrors = errors.getAllErrors();
			objectErrors.forEach(a -> System.out.println(a.getObjectName() + " " + a.getDefaultMessage()));
			System.out.println("errors");
			model.addAttribute("error", "invalid data,register from starting");

			return "index";

		} else {

			
			
				System.out.println("Data is sent to service layer");
				entity.setCreatedBy(entity.getOwnerName());
				entity.setCreatedDate(LocalDate.now());
				model.addAttribute("success", entity);
				this.service.saveAndValidate(entity);
			
			return "index";

		}
	}
}
