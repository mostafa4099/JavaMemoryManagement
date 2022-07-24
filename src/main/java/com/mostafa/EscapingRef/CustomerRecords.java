package com.mostafa.EscapingRef;

import java.util.HashMap;
import java.util.Map;

public class CustomerRecords {
	private Map<String, Customer> records;
	
	public CustomerRecords() {
		this.records = new HashMap<String, Customer>();
	}
	
	public void addCustomer(Customer c) {
		this.records.put(c.getName(), c);
	}
		
	public Map<String, Customer> getCustomers() {
		// return original records map.
		return this.records;

		// return a copy of original map. Prevent to clear original map using clear() method.
//		return new HashMap<String, Customer>(this.records);
	}
}
