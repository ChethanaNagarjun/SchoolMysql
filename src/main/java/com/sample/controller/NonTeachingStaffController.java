package com.sample.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sample.modelmapper.GenericResponse;
import com.sample.modelmapper.NonTeachingStaffDetail;
import com.sample.service.NonTeachingStaffService;

@Controller
@RequestMapping("/nonteachingstaff")
public class NonTeachingStaffController {

	@Autowired
	private NonTeachingStaffService nonteachingstaffservice;

	@RequestMapping(value = "/hellononteachingstaff", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public String helloNonTeachingStaff() throws Throwable {
		String response = null;
		try {
			response = "hello NonTeachingStaff";
		} catch (Throwable throwable) {
			throw new Throwable(throwable.getMessage());
		}
		return response;
	}

	@RequestMapping(value = "/nonteachingstaff", method = RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public ResponseEntity<GenericResponse> addNonTeachingStaff(
			@RequestBody NonTeachingStaffDetail nonteachingstaffDetail, HttpServletRequest httpServletRequest)
			throws Throwable {
		GenericResponse genericResponse = new GenericResponse();
		try {
			Integer id = nonteachingstaffservice.save(nonteachingstaffDetail);
			genericResponse.setId(id);
		} catch (Throwable throwable) {
			throw new Throwable(throwable.getMessage());
		}
		return new ResponseEntity<>(genericResponse, HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/nonTeachingstaff", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public ResponseEntity<GenericResponse> getAllNonTeachingStaff() throws Throwable {
		GenericResponse<NonTeachingStaffDetail> genericResponse = new GenericResponse<NonTeachingStaffDetail>();
		List<NonTeachingStaffDetail> nonteachingstaffDetailList = nonteachingstaffservice.getAllNonTeachingStaffs();
		
		genericResponse.setDetails(nonteachingstaffDetailList);
		System.out.println("hello");
		return new ResponseEntity<>(genericResponse, HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/nonteachingstaff/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<GenericResponse> DeleteNonTeachingStaff(@PathVariable("id") Integer id) throws Throwable {
		GenericResponse<NonTeachingStaffDetail> genericResponse = new GenericResponse<NonTeachingStaffDetail>();
		nonteachingstaffservice.delete(id);
		genericResponse.setMessages("Record deleted successfully");
		return new ResponseEntity<>(genericResponse, HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/nonteachingstaff/{id}", method = RequestMethod.PUT)
	public ResponseEntity<GenericResponse> UpdateNonTeachingStaff(
			@RequestBody NonTeachingStaffDetail nonteachingstaffDetail, @PathVariable("id") Integer id)
			throws Throwable {
		GenericResponse<NonTeachingStaffDetail> genericResponse = new GenericResponse<NonTeachingStaffDetail>();
		nonteachingstaffservice.update(id, nonteachingstaffDetail.getEmailId(),nonteachingstaffDetail.getName());
		genericResponse.setMessages("Record updated successfully");
		return new ResponseEntity<>(genericResponse, HttpStatus.ACCEPTED);
	}
}
