package Project1.Intro;

public class Intro {
	private int unum;
	private String title;
	private String content;
	private int id;
	private String submit;

	public Intro() {
	}

	public Intro(int unum, String title, String content, int id, String submit) {
		super();
		this.unum = unum;
		this.title = title;
		this.content = content;
		this.id = id;
		this.submit = submit;
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

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	@Override
	public String toString() {
		return "Intro [unum=" + unum + ", title=" + title + ", content=" + content + ", id=" + id + ", submit="
				+ submit + "]";
	}

}
