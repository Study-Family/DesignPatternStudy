package org.programers.factory.win;

import org.programers.factory.Checkbox;

public class WinCheckbox implements Checkbox {
	@Override
	public void paint() {
		System.out.println("win checkbox");
	}
}
