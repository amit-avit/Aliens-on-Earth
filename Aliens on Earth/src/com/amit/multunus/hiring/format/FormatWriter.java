package com.amit.multunus.hiring.format;

import com.amit.multunus.hiring.entity.Alien;

public interface FormatWriter {
	
	public void writeToFile(Alien alien) throws Exception;

}
