package com.itedu365.best6502.test;

import com.itedu365.best6502.Cartoon;
import com.itedu365.best6502.Father;
import com.itedu365.best6502.Story;

public class AfterTest {

	public static void main(String[] args) {
		Father father = new Father();
		father.speak(new Cartoon());
		father.speak(new Story());

	}

}
