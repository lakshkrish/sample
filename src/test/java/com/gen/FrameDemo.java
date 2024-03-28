package com.gen;

public class FrameDemo extends Utility {
	public static void main(String[] args) {
		browserLaunch();
		FbloginPage f = new FbloginPage();
		f.getUser().sendKeys("Hello Java");
		f.getPass().sendKeys("12345");
	}

}
