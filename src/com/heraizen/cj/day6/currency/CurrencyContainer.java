package com.heraizen.cj.day6.currency;

class CurrencyContainer {

	public static Currency getCurrency(String name) {

		if (name.toLowerCase().equals("India".toLowerCase())) {
			return new India();
		} else if (name.toLowerCase().equals("UK".toLowerCase())) {
			return new UK();
		} else if (name.toLowerCase().equals("USA".toLowerCase())) {
			return new USA();
		} else {
			throw new IllegalArgumentException();
		}

	}
}