package Project1.Nuser;

// 주석
public class Nuser {
  private int userid;
  private int unum;
  private String name;
  private String edu;
  private String id;
  private String tell;
  private String email;
  private String career;
  private String license;

  public Nuser(){}
  @Override
  public String toString() {
    return "Nuser{" +
        "userid=" + userid +
        ", unum=" + unum +
        ", name='" + name + '\'' +
        ", edu='" + edu + '\'' +
        ", id='" + id + '\'' +
        ", tell='" + tell + '\'' +
        ", email='" + email + '\'' +
        ", career='" + career + '\'' +
        ", license='" + license + '\'' +
        '}';
  }

  public Nuser(int userid, int unum, String name, String edu, String id, String tell, String email, String career, String license) {
    this.userid = userid;
    this.unum = unum;
    this.name = name;
    this.edu = edu;
    this.id = id;
    this.tell = tell;
    this.email = email;
    this.career = career;
    this.license = license;
  }

  public int getUserid() {
    return userid;
  }

  public void setUserid(int userid) {
    this.userid = userid;
  }

  public int getUnum() {
    return unum;
  }

  public void setUnum(int unum) {
    this.unum = unum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEdu() {
    return edu;
  }

  public void setEdu(String edu) {
    this.edu = edu;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTell() {
    return tell;
  }

  public void setTell(String tell) {
    this.tell = tell;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCareer() {
    return career;
  }

  public void setCareer(String career) {
    this.career = career;
  }

  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }
}
