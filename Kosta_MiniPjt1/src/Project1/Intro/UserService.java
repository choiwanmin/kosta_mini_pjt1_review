package Project1.Intro;

import java.util.Scanner;

import Project1.Admin.AdminService;
import Project1.Nuser.Nuser;
import Project1.Nuser.NuserDao;

public class UserService {
  private IntroDao idao;
  private NuserDao ndao;

  public UserService() {
    idao = new IntroDao();
    ndao = new NuserDao();
  }

  // 회원정보 등록
  public void addUser(Scanner sc) {
    System.out.println("=== 내 정보 등록 ===");
    System.out.print("이름 : ");
    String name = sc.next();
    System.out.print("최종 학력 : ");
    String edu = sc.next();
    System.out.print("주민등록 번호 : ");
    String id = sc.next();
    System.out.print("전화번호 : ");
    String tel = sc.next();
    System.out.print("메일주소 : ");
    String email = sc.next();
    System.out.print("주소 : ");
    String addr = sc.next();
    System.out.print("경력 : ");
    String career = sc.nextLine();
    System.out.print("자격증 : ");
    String license = sc.next();

    ndao.insert(new Nuser(0,0, name, edu, id, tel, email, addr, career ,license), 2);
  }

  // 회원정보 수정
  public void editUser(Scanner sc) {
    System.out.println("내 정보 수정");
    System.out.print("이름 : ");
    String name = sc.next();
    System.out.print("최종 학력 : ");
    String edu = sc.next();
    System.out.print("주민등록 번호 : ");
    String id = sc.next();
    System.out.print("전화번호 : ");
    String tel = sc.next();
    System.out.print("메일주소 : ");
    String email = sc.next();
    System.out.print("경력 : ");
    String career = sc.nextLine();
    System.out.print("자격증 : ");
    String license = sc.next();

    ndao.update(new Nuser(0,0, name, edu, id, tel, email, career ,license));
  }

  // 회원정보 삭제
  public void delUser(Scanner sc) {
    System.out.println("=== 회원 탈퇴 ===");
    System.out.println("삭제를 진행하시겠습니까? 동의 : 1");
    int del = sc.nextInt();
    if(del == 1){
      ndao.delete(AdminService.UserID);
      System.out.println("삭제 완료");
    }
  }

  // 회원정보 조회
  public void selectUser() {
    System.out.println("내 정보 확인");
    System.out.println(ndao.select(AdminService.UserID));
  }

  // 이력서 지원 현황
  public void submitIntro() {

  }

  // 이력서 등록
  public void addIntro() {

  }

  // 이력서 수정
  public void editIntro() {

  }

  // 이력서 삭제
  public void delIntro() {

  }

  // 이력서 조회(번호)
  public void getById() {

  }

  // 이력서 조회(제목)
  public void getByTitle() {

  }

  // 이력서 조회(전체)
  public void getAll() {

  }
}