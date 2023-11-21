package boardJDBC;

public class BoardVO {
	/* bno int auto_increment,
title varchar(200) not null,
writer varchar(100) not null,
content text, 
regdata datetime default now(),
moddate datetime default now(), 
primary key(bno));
	 * */
	
	private int bno;
	private String title;
	private String writer;
	private String content;
	private String regdata;
	private String moddate;
	
	public BoardVO() {}
	
	//�۾���� : title, writer, content
	public BoardVO(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	//�� ������ : bno, title, content
	public BoardVO(int bno, String title, String content) {
		this.bno = bno;
		this.title = title;
		this.content = content;
	}
	
	//��ü ����Ʈ�� : bno, title, writer, moddate
	public BoardVO(int bno, String title, String writer, String moddate) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.moddate = moddate;
	}
	
	//�� �������� : ��ü
	public BoardVO(int bno, String title, String writer, String content, String regdata, String moddate) {
		this(bno, title, writer, moddate);
		this.content = content;
		this.regdata = regdata;
	}
	
	//�� �������� ��� �޼���
	public void printDetail() {
		System.out.println("�۹�ȣ: "+bno+"       writer:"+writer);
		System.out.println("����:"+title+"       ("+moddate+")");
		System.out.println("����:");
		System.out.println(content);
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdata() {
		return regdata;
	}

	public void setRegdate(String regdate) {
		this.regdata = regdate;
	}

	public String getModdate() {
		return moddate;
	}

	public void setModdate(String moddate) {
		this.moddate = moddate;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", date=" + moddate + "]";
	}
	
	
	
}
