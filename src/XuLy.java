import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int month;
		int day = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập vào tháng: ");
		month = Integer.parseInt(scan.nextLine());
		
		boolean flag = true; // giả sử tháng hợp lệ 
		switch(month) {
		   case 1: 
		   case 3:
		   case 5:
		   case 7:
		   case 8:
		   case 10:
		   case 12:		   
			   day = 31;
			   break; 
		   case 2: 
			   day = 28;
			   break;	
		   case 4:
		   case 6: 
		   case 9: 
		   case 11: 
			   day = 30;
			   break;
		   default:
			   flag = false;
//			   System.out.println("Vui lòng nhập tháng hợp lệ từ 1-12");
		}
		if(flag == true) {
			System.out.println("Tháng " + month + " hợp lệ");
			System.out.println("Số ngày trong tháng: " + day);	
		} else {
			System.out.println("Tháng không hợp lệ");
		}
	}

}
