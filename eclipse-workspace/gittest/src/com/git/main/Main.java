package com.git.main;

import com.git.controller.GitController;

public class Main {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		new GitController().calc(a, b);
	}
}
