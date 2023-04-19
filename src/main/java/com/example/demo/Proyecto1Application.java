package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class Proyecto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto1Application.class, args);

		Scanner escaner = new Scanner(System.in);
		System.out.println("ingresa tu nombre");
		String name = escaner.nextLine();
		System.out.println("Muy buenos dias" + name);
	}

}
