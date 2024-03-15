package Project1;

import java.util.Scanner;

import Project1.Company.CompanyService;
import Project1.Notice.Notice;
import Project1.Notice.NoticeService;
import Project1.Nuser.NuserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		NoticeService n = new NoticeService();
		NuserService n = new NuserService();
//		n.addUser(sc);
		n.addIntro(sc);
		n.getById(sc);
		n.getByTitle(sc);
		n.editIntro(sc);
		n.getAll();
		n.delIntro(sc);
		
//		n.addNotice(sc);
		
//		n.editNotice(sc, 4);
//		n.getAll();
//		n.getByJob(sc);
		
//		n.getByNum(sc);
		
		
//		n.delNotice(4);
		
		
		
		
		
	}

}
