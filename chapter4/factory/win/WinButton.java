package org.programers.factory.win;

import org.programers.factory.Button;

public class WinButton implements Button {
	@Override
	public void paint() {
		System.out.println("win button");
	}
}
