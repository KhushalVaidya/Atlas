package com.gitHubDemo;
import java.util.*;
public class Swastik{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :- ");
		int num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if(num%2!=0) {
				if (i == 1 && j <= (num / 2)+1 || j == (num / 2)+1  || i == num / 2 +1|| i == num && j > num / 2|| i <= num / 2 && j == num || j == 1 && i > num / 2 ||i==(num/2)-1&&j==(num/2)-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");}}
				else{
					if (i == 1 && j <= (num / 2) || j == (num / 2)  || i == num / 2 || i == num && j > num / 2|| i <= num / 2 && j == num || j == 1 && i > num / 2) {
						System.out.print("* ");
					} else {
						System.out.print("  ");}}}
			System.out.println();}}}

