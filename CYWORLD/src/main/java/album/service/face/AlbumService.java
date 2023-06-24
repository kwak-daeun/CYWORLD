package album.service.face;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import album.dto.Album;
import album.dto.AlbumFile;

public interface AlbumService {

	/**
	 * 사진첩 조회
	 * 
	 * @return
	 */
	public List<Album> albumList();
	
	/**
	 * 사진첩 상세 조회
	 * 
	 * @param detailAlbum
	 * @return
	 */
	public Album albumDetail(Album detailAlbum);

	/**
	 * 사진첩 작성
	 * 
	 * @param album
	 */
	public void albumWrite(Album album, MultipartFile file);

	/**
	 * 사진첩 선택 삭제
	 * 
	 * @param checkAlbum
	 */
	public void albumCheckDelete(List<Integer> checkAlbum);

	/**
	 * 사진첩 수정
	 * 
	 * @param album
	 */
	public void albumUpdate(Album album);

	/**
	 * 사진첩 첨부파일 조회
	 * 
	 * @param viewAlbum
	 * @return
	 */
	public AlbumFile getAttachFile(Album viewAlbum);
}