package com.ikubinfo.rental.service.email.dto;


import lombok.Data;

import java.util.Map;

@Data
public class Mail {

    private String from;
    private String to;
    private String subject;
    private Map<String, Object> content;
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Map<String, Object> getContent() {
		return content;
	}
	public void setContent(Map<String, Object> content) {
		this.content = content;
	}
    
}
