package com.heraizen.cj.day6.instrument;

public class InstrumentType {
	public static void main(String[] args) {
		Instrument i1 = new Piano();
		Instrument i2 = new Flute();
		Instrument i3 = new Piano();
		Instrument i4 = new Flute();
		Instrument i5 = new Guitar();
		Instrument i6 = new Flute();
		Instrument i7 = new Guitar();
		Instrument i8 = new Piano();
		Instrument i9 = new Flute();
		Instrument[] irr = { i1, i2, i3, i4, i5, i6, i7, i8, i9 };
		for (Instrument i : irr) {
			i.play();
		}

	}
}