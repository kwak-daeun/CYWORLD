package album.dao.face;

import java.util.List;

import album.dto.Album;
import album.dto.AlbumFile;

public interface AlbumDao {

	/**
	 * 사진첩 조회
	 * 
	 * @return
	 */
	public List<Album> albumList();

	/**
	 * 사진첩 작성
	 * 
	 * @param album
	 */
	public void albumWrite(Album album);

	/**
	 * 사진첩 첨부파일
	 * 
	 * @param albumFile
	 */
	public void albumFileWrite(AlbumFile albumFile);
}