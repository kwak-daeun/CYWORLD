package album.dao.face;

import java.util.List;

import album.dto.Album;

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
	public void albumFile(Album albumFile);
}