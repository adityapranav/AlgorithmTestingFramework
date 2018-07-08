package com.unittests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConfigReader {
	public SortingInformation readProperties(String name) throws IOException {

		/*
		 * BufferedReader br = new BufferedReader(new FileReader(new
		 * File(name+".properties"))); String line; HashMap<String, String> data = new
		 * HashMap<String, String>(); while( (line = br.readLine()) != null ) { String[]
		 * values = line.split("="); data.put(values[0], values[1]); } br.close();
		 * return data;
		 */

		byte[] algoData = Files.readAllBytes(Paths.get(getClass().getResource(name + ".json").getPath()));

		ObjectMapper objMapper = new ObjectMapper();

		SortingInformation sortingInfo = objMapper.readValue(algoData, SortingInformation.class);

		return sortingInfo;

	}

}
class SortingInformation {

	SortingDet[] sortingDetails;

	public SortingDet[] getSortingDetails() {
		return sortingDetails;
	}

	public void setSortingDetails(SortingDet[] sortingDetails) {
		this.sortingDetails = sortingDetails;
	}
	
}

class SortingDet {

	private String algorithmName;
	private int[] arrayData;

	public String getAlgorithmName() {
		return algorithmName;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public int[] getArrayData() {
		return arrayData;
	}

	public void setArrayData(int[] arrayData) {
		this.arrayData = arrayData;
	}

}
