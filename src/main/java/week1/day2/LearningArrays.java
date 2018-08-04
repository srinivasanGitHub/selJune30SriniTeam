package week1.day2;

//import java.util.Scanner;

public class LearningArrays {

	public static void main(String[] args) {
		
		String[] myFriendsList = {"Ram","Raja","Ragu","Rahim","Rahul"};
		int[] ageList = {25,24,26,21,22};
		char[][] gradeList= {{'A','B','C','D','E'},
							 {'B','B','F','D','E'},
							 {'C','B','B','E','E'},
							 {'E','B','C','D','E'},
							 {'F','A','A','C','E'}};
		
		/*System.out.println("Enter the number between  1-5 to print friends details");
		Scanner scr =new Scanner(System.in);
		int num =scr.nextInt();*/
		
		for(int i=0;i<=4;i++)
		{
		System.out.println(myFriendsList[i]+" whose age is "+ ageList[i]+" and Grade is "+gradeList[i][0]+","+gradeList[i][1]+","+gradeList[i][2]+","+gradeList[i][3]+","+gradeList[i][4]);
		}
		for(String names:myFriendsList)
		{
		System.out.println("FriendName: "+names);
		System.out.println("LengthoftheName: "+names.length());
		}
		for(int age:ageList)
		{
		System.out.println("Age: "+age);
		
		}
		
	}

}
