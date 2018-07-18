package com.tpt.budgetbucket.customer.server.domain;

import org.springframework.stereotype.Component;

@Component
public class ExceptionMsg {

	private String msg;
	private String status;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
