package com.techleads.app.business;

public class SomeBusinessImpl {
	private SomeDataService someDataService;
	
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		int sum=0;
		for(int val: data) {
			sum = sum+val;
		}
		return sum;
	}

	public int calculateSumUsingDataService() {
		int sum=0;
		int[] data=someDataService.retriveAllData();
		for(int val: data) {
			sum = sum+val;
		}
		return sum;
	}
	
	
}
