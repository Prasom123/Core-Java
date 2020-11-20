package com.heraizen.cj.day6.remotecontrol;
public class Dvd implements RemoteControl {
	boolean onOff = false;
	boolean mute = false;
	int max_vol = 50;
	int min_vol = 10;

	@Override
	public boolean powerOnOff() {

		if (!onOff)
			onOff = true;
		else
			onOff = false;
		return onOff;
	}

	@Override
	public int volumeUp(int increment) {
		if (!mute && onOff) {
			max_vol += increment;
			if (max_vol > 50)
				return max_vol = 50;
			else
				return max_vol;
		} else
			return 0;
	}

	@Override
	public int volumeDown(int decrement) {
		if (!mute && onOff) {
			min_vol -= decrement;
			if (min_vol < 0)
				return min_vol = 0;
			else
				return min_vol;
		} else
			return 0;
	}

	@Override
	public void mute() {
		if (!mute) {
			mute = true;
			System.out.println("Dvd Mute");
		} else {
			mute = false;
			System.out.println("Dvd unmute");
		}

	}

}