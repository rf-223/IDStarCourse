package com.idstarcourse.latihan.service.email.email;

import lombok.Data;

@Data
public class MailRequest {
	
	private String name;
	private String to;
	private String from;
	private String subject;

}
