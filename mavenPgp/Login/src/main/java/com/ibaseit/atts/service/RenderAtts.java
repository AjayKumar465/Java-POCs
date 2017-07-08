package com.ibaseit.atts.service;

public class RenderAtts {
	public String renderAttribute(String attName, String attType) {
		return "<input type='" + attType + "' name='" + attName + "' />";
	}
}
