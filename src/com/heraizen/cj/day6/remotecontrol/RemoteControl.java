package com.heraizen.cj.day6.remotecontrol;
public interface RemoteControl {
	boolean powerOnOff();

	int volumeUp(int increment);

	int volumeDown(int decrement);

	void mute();

}