package Project1;

import java.util.Scanner;

import Project1.Admin.AdminService;
import Project1.Company.CompanyService;
import Project1.Notice.NoticeService;
import Project1.Nuser.NuserService;
import Project1.SubNotice.SubNoticeService;

public class Menu {
	AdminService aservice = new AdminService();
	CompanyService cservice = new CompanyService();
	NuserService nuservice = new NuserService();
	NoticeService noservice = new NoticeService();
	SubNoticeService snservice = new SubNoticeService();

	// 최초 접속
	public void run(Scanner sc) {
		boolean flag = true;
		while (flag) {
			System.out.println("1.회원가입  2.로그인  3.종료");
			int m = sc.nextInt();
			switch (m) {
			case 1:
				aservice.addUser(sc);
				break;
			case 2:
				runLogin(sc);
				break;
			case 3:
				System.out.println("종료");
				flag = false;
				return;
			}
		}
	}

	// 로그인 기능
	public void runLogin(Scanner sc) {
		boolean flag = true;
		while (flag) {
			if (aservice.login(sc)) {
				if (aservice.selectGrade() == 1) {
					runUser(sc);
				} else if (aservice.selectGrade() == 2) {
					runCompany(sc);
				} else if (aservice.selectGrade() == 0) {
					runAdmin(sc);
				}
			}
		}
	}

	// 일반회원 기능
	public void runUser(Scanner sc) {
		boolean flag = true;
		while (flag) {
			System.out.println("1.내정보등록   2.내정보수정     3.내정보확인   4.회원탈퇴\n" + "5.내이력서등록  6.내이력서수정   7.내이력서삭제  8.내이력서조회 \n"
					+ "9.기업정보조회  10.기업전체조회  11.종료");
			int m = sc.nextInt();
			switch (m) {
			case 1:
				nuservice.addUser(sc);
				break;
			case 2:
				nuservice.editUser(sc);
				break;
			case 3:
				nuservice.selectUser();
				break;
			case 4:
				nuservice.delUser(sc);
				break;
			case 5:
				nuservice.addIntro(sc);
				break;
			case 6:
				nuservice.editIntro(sc);
				break;
			case 7:
				nuservice.delIntro(sc);
				break;
			case 8:
				System.out.println("1.전체조회  2.번호조회  3.제목조회");
				int sel = sc.nextInt();
				switch (sel) {
				case 1:
					nuservice.getAll();
					break;
				case 2:
					nuservice.getById(sc);
					break;
				case 3:
					nuservice.getByTitle(sc);
					break;
				}
				break;
			case 9:
				cservice.printCompanyByFiled(sc);
				break;
			case 10:
				cservice.printAllCompany();
				break;
			case 11:
				System.out.println("로그아웃..");
				flag = false;
				aservice.UserID = 0;
				run(sc);
				break;
			}
		}
	}

	// 기업회원 기능
	public void runCompany(Scanner sc) {
		boolean flag = true;
		while (flag) {
			System.out.println("1.기업등록  2.기업수정  3.기업탈퇴 \n" + "4.공고등록  5.공고수정  6.공고검색  7.공고삭제  8.종료");
			int m = sc.nextInt();
			switch (m) {
			case 1:
				cservice.addCompany(sc);
				break;
			case 2:
				cservice.editCompany(sc);
				break;
			case 3:
				cservice.deleteCompany(sc);
				break;
			case 4:
				noservice.addNotice(sc);
				break;
			case 5:
				noservice.editNotice(sc);
				break;
			case 6:
				System.out.println("1.전체조회  2.번호조회  3.직무별조회");
				int sel = sc.nextInt();
				switch (sel) {
				case 1:
					noservice.getAll();
					break;
				case 2:
					noservice.getByNum(sc);
					break;
				case 3:
					noservice.getByJob(sc);
					break;
				}
				break;
			case 7:
				noservice.delNotice(sc);
				break;
			case 8:
				System.out.println("로그아웃..");
				flag = false;
				aservice.UserID = 0;
				run(sc);
				break;
			}
		}
	}

	// 관리자 기능
	public void runAdmin(Scanner sc) {
		boolean flag = true;
		while (flag) {
			System.out.println("1.회원전체출력  2.회원정보 수정  3.회원 조회  4.회원 삭제  5.종료");
			int m = sc.nextInt();
			switch (m) {
			case 1:
				aservice.selectAllUser();
				break;
			case 2:
				aservice.editUser(sc);
				break;
			case 3:
				aservice.selectUser(sc);
				break;
			case 4:
				aservice.deleteUser(sc);
				break;
			case 5:
				System.out.println("로그아웃..");
				flag = false;
				aservice.UserID = 0;
				run(sc);
				break;
			}
		}
	}

}
