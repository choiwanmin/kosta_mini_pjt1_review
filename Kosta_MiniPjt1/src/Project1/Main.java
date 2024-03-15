package Project1;

import java.util.Scanner;

import Project1.Notice.NoticeService;
import Project1.SubNotice.SubNoticeService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		NoticeService n = new NoticeService();
		SubNoticeService s = new SubNoticeService();
//		n.addNotice(sc);
		
//		n.editNotice(sc, 4);
//		n.getAll();
//		n.getByJob(sc);
		
//		n.getByNum(sc);
		
//		s.addSub(2, 5);
		
		
		s.viewAll();
		
		
		
		
//		n.delNotice(4);
		
		
		
		
		
	}

}
