package com.amit.multunus.hiring.format;

import java.lang.reflect.Method;

public class FormatWriterFactory {
	
	@SuppressWarnings(value = "all")
	public static FormatWriter getFormatWriter(String formatWriterClass) throws Exception {
		Class<?> theClass = Class.forName(formatWriterClass);
		Method getInstanceMethod = theClass.getMethod("getInstance", null);
		FormatWriter format = (FormatWriter) getInstanceMethod.invoke(null, null);
		return format;
	}

}
