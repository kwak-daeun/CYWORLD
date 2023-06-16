package album.dto;

public class Album {

	private int albumNo;			// 사진첩 번호
	private String albumTitle;		// 사진첩 제목
	private String albumContent;	// 사진첩 내용
	private String albumByte;		// 사진첩 크기
	private String albumDate;		// 사진첩 저장 일자
	
	public Album() {}

	@Override
	public String toString() {
		return "Album [albumNo=" + albumNo + ", albumTitle=" + albumTitle + ", albumContent=" + albumContent
				+ ", albumByte=" + albumByte + ", albumDate=" + albumDate + "]";
	}
	
	public Album(int albumNo, String albumTitle, String albumContent, String albumByte, String albumDate) {
		super();
		this.albumNo = albumNo;
		this.albumTitle = albumTitle;
		this.albumContent = albumContent;
		this.albumByte = albumByte;
		this.albumDate = albumDate;
	}

	public int getAlbumNo() {
		return albumNo;
	}

	public void setAlbumNo(int albumNo) {
		this.albumNo = albumNo;
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

	public String getAlbumDate() {
		return albumDate;
	}

	public void setAlbumDate(String albumDate) {
		this.albumDate = albumDate;
	}
}