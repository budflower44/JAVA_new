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
	private int readCount;
	
	public BoardVO() {}
	
	//글쓰기용 : title, writer, content
	public BoardVO(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	//글 수정용 : bno, title, content
	public BoardVO(int bno, String title, String content) {
		this.bno = bno;
		this.title = title;
		this.content = content;
	}
	
	//전체 리스트용 : bno, title, writer, moddate
	public BoardVO(int bno, String title, String writer, String moddate, int readCount) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.moddate = moddate;
		this.readCount = readCount;
	}
	
	//상세 페이지용 : 전체
	public BoardVO(int bno, String title, String writer, String content, String regdata, String moddate, int readCount) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.moddate = moddate;
		this.content = content;
		this.regdata = regdata;
		this.readCount = readCount;
	}
	
	//상세 페이지용 출력 메서드
	public void printDetail() {
		System.out.println("글번호: "+bno+"       writer:"+writer);
		System.out.println("제목:"+title+"       ("+moddate+")");
		System.out.println("내용:");
		System.out.println(content);
		System.out.println("조회수:"+readCount);
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

	
	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", moddate=" + moddate
				+ ", readCount=" + readCount + "]";
	}

	
	
	
}
