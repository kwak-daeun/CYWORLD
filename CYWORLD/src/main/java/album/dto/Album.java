package album.dto;

import java.util.Date;

public class Album {

	private int albumNum;			// 사진첩 번호
	private String albumTitle;		// 사진첩 제목
	private String albumContent;	// 사진첩 내용
	private String albumByte;		// 사진첩 크기
	private Date albumDate;			// 사진첩 저장 일자
	private String albumOriginName;	// 사진첩 원본 이름
	private String albumStoreName;	// 사진첩 저장 이름
	
	public Album() {}

	@Override
	public String toString() {
		return "Album [albumNum=" + albumNum + ", albumTitle=" + albumTitle + ", albumContent=" + albumContent
				+ ", albumByte=" + albumByte + ", albumDate=" + albumDate + ", albumOriginName=" + albumOriginName
				+ ", albumStoreName=" + albumStoreName + "]";
	}

	public Album(int albumNum, String albumTitle, String albumContent, String albumByte, Date albumDate,
			String albumOriginName, String albumStoreName) {
		super();
		this.albumNum = albumNum;
		this.albumTitle = albumTitle;
		this.albumContent = albumContent;
		this.albumByte = albumByte;
		this.albumDate = albumDate;
		this.albumOriginName = albumOriginName;
		this.albumStoreName = albumStoreName;
	}

	public int getAlbumNum() {
		return albumNum;
	}

	public void setAlbumNum(int albumNum) {
		this.albumNum = albumNum;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public String getAlbumContent() {
		return albumContent;
	}

	public void setAlbumContent(String albumContent) {
		this.albumContent = albumContent;
	}

	public String getAlbumByte() {
		return albumByte;
	}

	public void setAlbumByte(String albumByte) {
		this.albumByte = albumByte;
	}

	public Date getAlbumDate() {
		return albumDate;
	}

	public void setAlbumDate(Date albumDate) {
		this.albumDate = albumDate;
	}

	public String getAlbumOriginName() {
		return albumOriginName;
	}

	public void setAlbumOriginName(String albumOriginName) {
		this.albumOriginName = albumOriginName;
	}

	public String getAlbumStoreName() {
		return albumStoreName;
	}

	public void setAlbumStoreName(String albumStoreName) {
		this.albumStoreName = albumStoreName;
	}
}