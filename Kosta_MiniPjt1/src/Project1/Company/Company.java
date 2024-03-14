package Project1.Company;

public class Company {
	private int userId; // 유저ID FK
	private int cnum; // 기업번호 PK
	private String cname; //기업 이름
	private String field; //기업 분야
	private String id; // 사업자 번호
	private String tell; // 기업 전화번호
	private String email; // 기업 이메일
	private String addr; // 기업 주소

	public Company() {
	};
	
	
	public Company(int userId, int cnum, String cname, String field, String id, String tell, String email,
			String addr) {
		super();
		this.userId = userId;
		this.cnum = cnum;
		this.cname = cname;
		this.field = field;
		this.id = id;
		this.tell = tell;
		this.email = email;
		this.addr = addr;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Company [userId=" + userId + ", cnum=" + cnum + ", cname=" + cname + ", field=" + field + ", id=" + id
				+ ", tell=" + tell + ", email=" + email + ", addr=" + addr + "]";
	}
	
	

}
