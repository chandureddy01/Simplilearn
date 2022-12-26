package javaproject;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Assesment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename;

		char ch;

		File directory = new File("C:\\Users\\chand\\eclipse-workspace\\Javaproject\\Simplilearn\\FileCreation\\");

		String[] caset = directory.list();

		// Take user Option from the below mentioned Menu
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("******* Simplilearn Assignment 1 ********");
		System.out.println("*****************************************");
		System.out.println("******* chandra kiran reddy  *********************");

		System.out.println("*****************************************");
		System.out.println("******* Full Stack Developer  ************");
		System.out.println();

		do {

			System.out.println("Select File Option to perform any operation:- \n");
			System.out.println("1.File Creation");
			System.out.println("2.File List");
			System.out.println("3.File Delete");
			System.out.println("4.Search file");
			System.out.println("5.Exit");

			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter the file name for crating new file");
				filename = scanner.next();

				try {
					File file = new File("C:\\Users\\chand\\eclipse-workspace\\Javaproject\\Simplilearn\\FileCreation\\" + filename + ".txt");

					if (file.createNewFile()) {

						System.out.println("File Created Successfully \n");
					} else {
						if (file.exists()) {
							System.out.println("File Already Exists");
						} else {
							System.out.println("File Doesen't exist");
						}

						// Delete the file code below

						boolean b = file.delete();
						if (b == true) {
							System.out.println("File  Deleted");
						} else {
							System.out.println("File  not Deleted");
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


				break;

			case 2:
				System.out.println("\n List of files and Folder \n");
				File directorypath = new File("C:\\Users\\chand\\eclipse-workspace\\Javaproject\\Simplilearn\\FileCreation\\");
				File[] listOfFiles = directorypath.listFiles();
				for (File file : listOfFiles) {
					System.out.println("File name: "+file.getName());
					System.out.println("File path: "+file.getAbsolutePath());
					System.out.println("File space: "+file.getTotalSpace()+"kb");
				}
				
				break;

			case 3:

				System.out.println("Enter the file name which you want to delete");

				filename = scanner.next();

				File directory_delete = new File("C:\\Users\\chand\\eclipse-workspace\\Javaproject\\Simplilearn\\FileCreation\\"+filename+".txt");
				

				if (directory_delete.delete()) {
					System.out.println(filename+".txt"+" is successfully deleted  ");
					
				} else {
					System.out.println("Failed to delete or file "+ filename+".txt"+" does not exist ");
				}
				

				break;

			case 4:
				// Create an object of the File class
				// Replace the file path with path of the directory
				System.out.println("Enter the file name for searching with extension");

				filename = scanner.next();

				File directory_search = new File("C:\\Users\\chand\\eclipse-workspace\\Javaproject\\Simplilearn\\FileCreation\\");

				String[] flist_search = directory_search.list();
				int flag_s = 0;
				if (flist_search == null) {
					System.out.println("There is no file preseent in the directory");
				} else {

					// Linear search in the array
					for (int i = 0; i < flist_search.length; i++) {
						String search_filename = flist_search[i];
						if (search_filename.equalsIgnoreCase(filename)) {
							System.out.println(search_filename + " found");
							flag_s = 1;
						}
					}
				}

				if (flag_s == 0) {
					System.out.println("File Not Found");
				}

				break;

			case 5:

				System.out.println("Thank you User");
				break;

			default:

				System.out.println("Your input number is incorrect.Choose correct Number");
				break;

			}
			System.out.println("Do you want to continue Type (y or n) \n");
			ch = scanner.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');

	}

}
