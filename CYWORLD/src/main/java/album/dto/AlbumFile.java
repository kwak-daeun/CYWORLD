package album.dto;

public class AlbumFile {

    private int AlbumFileNo;		// 사진첩 파일 번호
    private int AlbumNo;			// 사진첩 번호
	private String AlbumOriginName;	// 사진첩 원본 이름
	private String AlbumStoredName;	// 사진첩 저장 이름
	
	public AlbumFile() {}
	
	@Override
	public String toString() {
		return "AlbumFile [AlbumFileNo=" + AlbumFileNo + ", AlbumNo=" + AlbumNo + ", AlbumOriginName=" + AlbumOriginName
				+ ", AlbumStoredName=" + AlbumStoredName + "]";
	}

	public AlbumFile(int albumFileNo, int albumNo, String albumOriginName, String albumStoredName) {
		super();
		AlbumFileNo = albumFileNo;
		AlbumNo = albumNo;
		AlbumOriginName = albumOriginName;
		AlbumStoredName = albumStoredName;
	}

	public int getAlbumFileNo() {
		return AlbumFileNo;
	}

	public void setAlbumFileNo(int albumFileNo) {
		AlbumFileNo = albumFileNo;
	}

	public int getAlbumNo() {
		return AlbumNo;
	}

	public void setAlbumNo(int albumNo) {
		AlbumNo = albumNo;
	}

	public String getAlbumOriginName() {
		return AlbumOriginName;
	}

	public void setAlbumOriginName(String albumOriginName) {
		AlbumOriginName = albumOriginName;
	}

	public String getAlbumStoredName() {
		return AlbumStoredName;
	}

	public void setAlbumStoredName(String albumStoredName) {
		AlbumStoredName = albumStoredName;
	}
}