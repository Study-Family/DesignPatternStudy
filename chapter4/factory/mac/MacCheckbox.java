package org.programers.factory.mac;

import org.programers.factory.Checkbox;

public class MacCheckbox implements Checkbox {
	@Override
	public void paint() {
		System.out.println("mac checkbox");
	}
}
