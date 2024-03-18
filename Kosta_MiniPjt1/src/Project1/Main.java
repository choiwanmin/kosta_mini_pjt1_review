package Project1;

import java.util.Scanner;

import Project1.Notice.NoticeService;
import Project1.SubNotice.SubNoticeService;


public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		NoticeService n = new NoticeService();
		SubNoticeService s = new SubNoticeService();
		Menu m = new Menu();
		m.run(sc);

		
		
		
	}

}
