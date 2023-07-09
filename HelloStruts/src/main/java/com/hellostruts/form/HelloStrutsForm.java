package com.hellostruts.form;

import org.apache.struts.action.ActionForm;

public class HelloStrutsForm extends ActionForm {

	private static final long serialVersionUID = 7352021000623040587L;

	private String hello = null;

	public HelloStrutsForm() {
		super();
		hello = "Hello Struts";
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

}