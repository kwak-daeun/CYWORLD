package album.service.face;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import album.dto.Album;

public interface AlbumService {

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
	public void albumWrite(Album album, MultipartFile file);

}