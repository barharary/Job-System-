package com.bh.JobSystem.utils;

import java.util.List;

import com.bh.JobSystem.beans.Employee;
import com.bh.JobSystem.beans.Job;

public class ArtUtils {

	public final static String NEW_LINE = "\n";
	// public final static String BOLD_LINE =
	// "========================================================================";
	public final static String BOLD_LINE = "|*******************************************************************************************************|";
	public final static String REGULAR_LINE = "|--------------------------------------------------------------------------------------------------|";

	public static void printPrimaryData() {

		System.out.println("                                            \r\n"
				+ " #####  #####  # #    #   ##   #####  #   # \r\n"
				+ " #    # #    # # ##  ##  #  #  #    #  # #  \r\n"
				+ " #    # #    # # # ## # #    # #    #   #   \r\n"
				+ " #####  #####  # #    # ###### #####    #   \r\n"
				+ " #      #   #  # #    # #    # #   #    #   \r\n"
				+ " #      #    # # #    # #    # #    #   #   \r\n"
				+ "                                            \r\n"
				+ " ######                                     \r\n"
				+ " #     #   ##   #####   ##                  \r\n"
				+ " #     #  #  #    #    #  #                 \r\n"
				+ " #     # #    #   #   #    #                \r\n"
				+ " #     # ######   #   ######                \r\n"
				+ " #     # #    #   #   #    #                \r\n"
				+ " ######  #    #   #   #    #                \r\n" + "                                            ");

	}

	public static void printMainHeadline() { //
		System.out.println();
		System.out.println("      ___    ______    _______                                     \r\n"
				+ "     |\"  |  /    \" \\  |   _  \"\\                                    \r\n"
				+ "     ||  | // ____  \\ (. |_)  :)                                   \r\n"
				+ "     |:  |/  /    ) :)|:     \\/                                    \r\n"
				+ "  ___|  /(: (____/ // (|  _  \\\\                                    \r\n"
				+ " /  :|_/ )\\        /  |: |_)  :)                                   \r\n"
				+ "(_______/  \\\"_____/   (_______/                                    \r\n"
				+ "                                                                   \r\n"
				+ "  ________  ___  ___  ________  ___________  _______  ___      ___ \r\n"
				+ " /\"       )|\"  \\/\"  |/\"       )(\"     _   \")/\"     \"||\"  \\    /\"  |\r\n"
				+ "(:   \\___/  \\   \\  /(:   \\___/  )__/  \\\\__/(: ______) \\   \\  //   |\r\n"
				+ " \\___  \\     \\\\  \\/  \\___  \\       \\\\_ /    \\/    |   /\\\\  \\/.    |\r\n"
				+ "  __/  \\\\    /   /    __/  \\\\      |.  |    // ___)_ |: \\.        |\r\n"
				+ " /\" \\   :)  /   /    /\" \\   :)     \\:  |   (:      \"||.  \\    /:  |\r\n"
				+ "(_______/  |___/    (_______/       \\__|    \\_______)|___|\\__/|___|\r\n"
				+ "                                                                   ");

	}

	public static void printCompanyServiceHeadline() {
		System.out.println();
		System.out.println("                                                 \r\n"
				+ "  ####   ####  #    # #####    ##   #    # #   # \r\n"
				+ " #    # #    # ##  ## #    #  #  #  ##   #  # #  \r\n"
				+ " #      #    # # ## # #    # #    # # #  #   #   \r\n"
				+ " #      #    # #    # #####  ###### #  # #   #   \r\n"
				+ " #    # #    # #    # #      #    # #   ##   #   \r\n"
				+ "  ####   ####  #    # #      #    # #    #   #   \r\n"
				+ "                                                 \r\n"
				+ "                                                 \r\n"
				+ "  ####  ###### #####  #    # #  ####  ######     \r\n"
				+ " #      #      #    # #    # # #    # #          \r\n"
				+ "  ####  #####  #    # #    # # #      #####      \r\n"
				+ "      # #      #####  #    # # #      #          \r\n"
				+ " #    # #      #   #   #  #  # #    # #          \r\n"
				+ "  ####  ###### #    #   ##   #  ####  ######     \r\n"
				+ "                                                 ");
	}

	public static void insertToTable(String headLine, List<?> list) {
		ArtUtils.printRegularHeadLine(headLine);
		if (list.isEmpty()) {
			System.out.println("Empty");
		} else if (list.get(0) instanceof Employee) {
			ArtUtils.EmployeeHeaders();
		} else if (list.get(0) instanceof Job) {
			ArtUtils.jobHeaders();
		}
		list.forEach(System.out::println);
		System.out.println(ArtUtils.BOLD_LINE);

	}

	public static void EmployeeHeaders() {

		System.out.printf("|Id:" + "\t" + "|name:\t\t\t" + "|Salary:\t" + "|Jobs\t\t\t\t\t\t\t" + "|");

		System.out.println(
				"\n|-------|-----------------------|---------------|-------------------------------------------------------|");
	}

	public static void jobHeaders() {

		System.out.printf("|Id:" + "\t" + "|Description:\t\t\t" + "|End Date:\t|");

		System.out.println(
				"\n|-------|-------------------------------|---------------|");
	}

	public static void printRegularHeadLine(String msg) {
		System.out.println(NEW_LINE + BOLD_LINE + NEW_LINE //
				+ "|\t\t\t\t" + msg + "     \t\t\t\t" //
				+ NEW_LINE + BOLD_LINE); //

	}

	public static void printXxsHeadLine(String msg, int num) {
		System.out.println(NEW_LINE + BOLD_LINE + NEW_LINE //
				+ "|\t\t\t" + getX(num) + " " + msg + " " + getX(num) //
				+ NEW_LINE + BOLD_LINE); //

	}

	public static void printVvsHeadLine(String msg, int num) {
		System.out.println(NEW_LINE + BOLD_LINE + NEW_LINE //
				+ "|\t\t\t" + getVi(num) + " " + msg + " " + getVi(num) //
				+ NEW_LINE + BOLD_LINE); //

	}

	public static void CompleteMessage(String msg) throws InterruptedException {
		System.out.println();
		System.out.println("\r\t\t   " + ArtUtils.getVi(3) + msg + ArtUtils.getVi(3));
		Thread.sleep(1500);

	}

	public static void oneLineMessage(String msg) {
		System.out.println();
		System.out.println("\t\t|===============================================|");
		System.out.println("\t\t   " + msg + "\t\t");
		System.out.println("\t\t|===============================================|");
		System.out.println();
	}

	public static String getVi(int num) {
		String msg = "";
		for (int i = 0; i < num; i++) {
			String vi = "\u2714";
			msg = msg + vi;
		}
		return msg;
	}

	public static String getX(int num) {
		String msg = "";
		for (int i = 0; i < num; i++) {
			String vi = "\u2716";
			msg = msg + vi;
		}
		return msg;
	}

	public static String getSmaily() {
		return "\uD83D\uDE0D";

	}

}
