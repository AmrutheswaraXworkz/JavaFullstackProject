package com.vmanage.entity;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VManageEntity {

	
	@NotNull
	@Size(max = 20,min = 3,message = "Its invalid")
	private String name;
	@NotNull
	@Size(max = 20,min = 3,message = "Its invalid")
	private String location;
	@NotNull
	@Size(max = 20,min = 3,message = "Its invalid")
	private String gstNumber;
	@NotNull
	@Size(max = 20,min = 3,message = "Its invalid")
	private String startDate;
	@NotNull
	@Size(max = 20,min = 3,message = "Its invalid")
	private String ownerName;
	@NotNull
	@Size(max = 20,min = 3,message = "Its invalid")
	private String serviceType;
	private Long contactNo;
	private Long alternativeNo;
	@NotNull
	@Size(max = 30,min = 3,message = "Its invalid")
	private String email;
	@NotNull
	@Size(max = 40,min = 3,message = "Its invalid")
	private String website;
	private String createdBy;
	private LocalDate createdDate;
	private String updatedBy;
	private LocalDate updatedDate;

//	public VManageEntity(String name, String location, String gstNumber, LocalDate startDate, String ownerName,
//			String serviceType, Long contactNo, Long alternativeNo, String email, String website) {
//		super();
//		this.name = name;
//		this.location = location;
//		this.gstNumber = gstNumber;
//		this.startDate = startDate;
//		this.ownerName = ownerName;
//		this.serviceType = serviceType;
//		this.contactNo = contactNo;
//		this.alternativeNo = alternativeNo;
//		this.email = email;
//		this.website = website;
//	}

}
