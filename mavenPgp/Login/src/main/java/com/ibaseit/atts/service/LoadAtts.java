package com.ibaseit.atts.service;import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class LoadAtts extends DefaultHandler {
	private Map<String, String> atts = new LinkedHashMap<String, String>();

	private Map<String, List<String>> retAttsMap = new HashMap<String, List<String>>();

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println(qName);
		if (!qName.equals("form") && attributes.getValue("name") != null) {
			if (attributes.getValue("type") != null && attributes.getValue("type") != "")
				atts.put(attributes.getValue("name"), attributes.getValue("type"));
			else
				atts.put(attributes.getValue("name"), "text");
		}

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println(qName);
	}

	public Map<String, Map<String, String>> getAtts(String atts_file_name, String form_name,String context_path) {
		
		ClassLoader classLoader = this.getClass().getClassLoader();
		Map<String, Map<String, String>> retAtts = null;
		try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser;

			saxParser = factory.newSAXParser();
			System.out.println(context_path+"/main/java/com/ibaseit/atts/" + atts_file_name);
			saxParser.parse(new File(classLoader.getResource("/com/ibaseit/atts/atts_login.xml").getFile()), this);

		} catch (Exception e) {
			e.printStackTrace();
		}
		retAtts = new HashMap<String, Map<String, String>>();

		retAtts.put(form_name, getRetAttsMap());
System.out.println(retAtts);
		return retAtts;

	}

	public Map<String, String> getRetAttsMap() {
		return atts;
	}

	/*public static void main(String[] args) {
		LoadAtts loadAtts = new LoadAtts();
		loadAtts.getAtts("atts_login.xml", "login");
	}*/
}
