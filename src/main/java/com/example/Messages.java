package com.example;

public class Messages {

	public String getMessage(String name) {
		StringBuilder sb = new StringBuilder();
		if (name == null || name.trim().length() == 0) {
			sb = sb.append("please provide a name!");
		} else {
			sb = sb.append(name);
		}
		return sb.toString();
	}
}
