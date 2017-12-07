import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CandidateCode {
	/*
	 * Complete the function below.
	 */
	public static int word_count(String[] input1, String input2) {
		int len = input1.length;
		int lenIp = input2.length();
		char[][] inputArr = new char[len][len];
		int[][] countArr = new int[len][len];
		int[][] prevArr = new int[len][len];
		int count = 0;

		for (int i = 0; i < len; i++) {
			String ip = input1[i];
			for (int j = 0; j < len; j++) {
				inputArr[i][j] = ip.charAt(j * 2);
			}
		}

		// Blank array
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				prevArr[i][j] = 0;
			}
		}

		int k;
		for (k = 0; k < lenIp; k++) {
			
			// Blank array
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					countArr[i][j] = 0;
				}
			}
			
			char searchChar = input2.charAt(k);
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					if (k == 0) {
						if (inputArr[i][j] == searchChar) {
							prevArr[i][j] = 1;
						}
					} else if (inputArr[i][j] == searchChar) {
						if (i - 1 >= 0) {
							if (prevArr[i-1][j] > 0) {
								countArr[i][j]++;
							}
						}
						if (i - 1 >= 0 && j - 1 >= 0) {
							if (prevArr[i-1][j-1] > 0) {
								countArr[i][j]++;
							}
						}
						if (j - 1 >= 0) {
							if (prevArr[i][j-1] > 0) {
								countArr[i][j]++;
							}
						}
						if (i + 1 < len && j - 1 >= 0) {
							if (prevArr[i+1][j-1] > 0) {
								countArr[i][j]++;
							}
						}
					}
				}
			}
			
			if(k != 0)
			{
				for (int i = 0; i < len; i++) {
					for (int j = 0; j < len; j++) {
						prevArr[i][j] = countArr[i][j];
					}
				}
			}
			
		}
		
		if (k == 1)
		{
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					count += prevArr[i][j];
				}
			}
		}
		else
		{
			for (int i = 0; i < len; i++) {
				for (int j = 0; j < len; j++) {
					count += countArr[i][j];
				}
			}
		}
		
		
		
		return count;

	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int output = 0;
		int ip1_size = 0;
		ip1_size = Integer.parseInt(in.nextLine().trim());
		String[] ip1 = new String[ip1_size];
		String ip1_item;
		for (int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
			try {
				ip1_item = in.nextLine();
			} catch (Exception e) {
				ip1_item = null;
			}
			ip1[ip1_i] = ip1_item;
		}
		String ip2 = in.nextLine().trim();
		output = word_count(ip1, ip2);
		System.out.println(String.valueOf(output));
	}
}
