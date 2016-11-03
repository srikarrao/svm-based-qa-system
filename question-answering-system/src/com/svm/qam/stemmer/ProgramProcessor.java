package com.svm.qam.stemmer;

import java.io.*;
import java.util.*;

public class ProgramProcessor {

	public static String givenwords;

	public static void main(String args[]) throws IOException {

		FileInputStream fis = new FileInputStream("text1.txt");
		Scanner s = new Scanner(fis);
		ArrayList<String> al = new ArrayList<String>();
		for (int j = 0; s.hasNext(); j = j + 1) {
			StringTokenizer tokenizer = new StringTokenizer(s.nextLine(),
					",!*+/?=&@^#)(%_$][}{~`><':;|");
			while (tokenizer.hasMoreTokens()) {
				String givenwords = tokenizer.nextToken();
				String lower = givenwords.toLowerCase();
				al.add(lower);
			}
			System.out.print(al);
			PrintWriter out = null;
			try {
				out = new PrintWriter(new BufferedWriter(new FileWriter(
						"output.txt")), true);
				for (String printArray : al) {
					out.flush();
					out.println(printArray);
				}
				out.close();
			} catch (IOException e) {
			}
		}
		s.close();
	}
}