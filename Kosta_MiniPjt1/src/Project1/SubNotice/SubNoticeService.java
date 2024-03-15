package Project1.SubNotice;

import java.util.ArrayList;
import java.util.Scanner;

import Project1.Notice.Notice;
import Project1.Nuser.NuserDao;
import Project1.Nuser.NuserService;

public class SubNoticeService {
	private SubNoticeDao dao;
	private NuserService ns;
	private NuserDao ndao;
	private NuserDao un;
	private Notice no;
	public SubNoticeService() {
		dao = new SubNoticeDao();
		ndao = new NuserDao();
	}
	
	
	
	//지원자 등록
	
	public void addSub(int n, int o) {
		System.out.println("=== 글작성 ===");
//		int unum = n.getUnum();
//		int com_id = o.getCom_id();
		dao.insert(2, 5);
	}
	
	//등록된 지원자 삭제
	public void delSub(Scanner sc) {
		System.out.println("=== 지원 삭제 ===");
		System.out.print("삭제할 지원자 번호 입력 : ");
		int subnotice_id = sc.nextInt();
		dao.delete(subnotice_id);
	}
	

	//등록된 지원자 현황 출력 
	public void viewAll() {
		int cnt = 1;
		System.out.println("=== 지원자 현황  조회(전체 목록) ===");
		ArrayList<SubNotice> list = dao.selectAll();
		if (list.isEmpty()) {
			System.out.println("없음");
		} else {
			for (SubNotice i : list) {
				System.out.println(cnt+ "번째 지원자 정보");
				System.out.println("이름 : " + ndao.select(i.getUnum()).getName());
				System.out.println("주소 : " + ndao.select(i.getUnum()).getAddr());
				System.out.println("학력 : " + ndao.select(i.getUnum()).getEdu());
				System.out.println("전화번호 : " + ndao.select(i.getUnum()).getTell());
				cnt++;
			}
		}
	}
}
