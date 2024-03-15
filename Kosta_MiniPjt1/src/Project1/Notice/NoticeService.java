package Project1.Notice;

import java.util.ArrayList;
import java.util.Scanner;

public class NoticeService {
	private Notice no;
	private NoticeDao dao;
	public NoticeService() {
		dao = new NoticeDao();
	}
	
	
	
	//공고 등록	
	
	public void addNotice(Scanner sc) {
		System.out.println("=== 공고 등록 ===");
		System.out.println("연봉을 등록하세요 : ");
		int salary = sc.nextInt();
		System.out.println("직무를 등록해 주세요 : ");
		String job = sc.next();
		dao.insert(new Notice(0,0,null,salary,job));
	}
	
	
	//공고 삭제
	
	public void delNotice (int com_id) {
		System.out.println("=== 공고 삭제 ===");
		dao.delete(com_id);
	}
	
	
	//공고 수정
	public void editNotice(Scanner sc, int com_id) {
		System.out.println("=== 공고 수정 ===");
		System.out.print("new 연봉 : ");
		sc.nextLine();
		int salary = sc.nextInt();
		System.out.print("new 직무 : ");
		String job = sc.next();
		dao.update(new Notice(0,com_id,null,salary,job));
	}
	
	//공고 번호로 검색
	public void getByNum(Scanner sc) {
		System.out.println("=== 번호로 검색 ===");
		System.out.print("num : ");
		int com_id = sc.nextInt();
		Notice n = dao.select(com_id);
		if (n == null) {
			System.out.println("없는 글번호");
		} else {
			System.out.println(n);
			if (no.getcNum()==n.getcNum()) {
				System.out.println("1.수정 2.삭제 3.상세페이지종료");
				int x = sc.nextInt();
				switch (x) {
				case 1:
					editNotice(sc, com_id);
					break;
				case 2:
					delNotice(com_id);
					break;
				}
			}
		}
	}
	
	
	//공고 직무별 검색
	public void getByJob(Scanner sc) {
		System.out.println("=== 직무별 검색 ===");
		System.out.print("검색할 직무를 입력하세요 : ");
		String job = sc.next();
		ArrayList<Notice> list = dao.selectByJob(job);
		if (list.isEmpty()) {
			System.out.println("검색된 결과가 없다");
		} else {
			for (Notice n : list) {
				System.out.println(n);
			}
		}
	}
	
	//전체 공고 보기
	public void getAll() {
		System.out.println("=== 글목록 ===");
		ArrayList<Notice> list = dao.selectAll();
		if (list.isEmpty()) {
			System.out.println("검색된 결과가 없다");
		} else {
			for (Notice n : list) {
				System.out.println(n);
			}
		}
	}
	
}
