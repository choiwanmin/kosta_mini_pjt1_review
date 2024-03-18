package Project1.Intro;

public class Intro {
	private int unum;
	private String title;
	private String content;
	private int id;
	private int cnum;

	public Intro() {
	}

	public Intro(int unum, String title, String content, int id, int cnum) {
		super();
		this.unum = unum;
		this.title = title;
		this.content = content;
		this.id = id;
		this.cnum = cnum;
	}

	@Override
	public String toString() {
		return "Intro [unum=" + unum + ", title=" + title + ", content=" + content + ", id=" + id + ", cnum=" + cnum
				+ "]";
	}

	public int getUnum() {
		return unum;
	}

	public void setUnum(int unum) {
		this.unum = unum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

}
