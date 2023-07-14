package org.programers.factory.mac;

import org.programers.factory.Button;

public class MacButton implements Button {
	@Override
	public void paint() {
		System.out.println("mac button");
	}
}
