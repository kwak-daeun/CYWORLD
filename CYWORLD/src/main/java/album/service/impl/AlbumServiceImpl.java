package album.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import album.dao.face.AlbumDao;
import album.dto.Album;
import album.dto.AlbumFile;
import album.service.face.AlbumService;

@Service
public class AlbumServiceImpl implements AlbumService {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// DAO 객체
	@Autowired private AlbumDao albumDao;

	// Context 객체
	@Autowired private ServletContext context;

	// context 보다 서버 주소값을 저장하기
	
	// 사진첩 조회
	@Override
	public List<Album> albumList() {
		logger.info("AlbumServiceImpl albumList 확인");
		
		return albumDao.albumList();
	}
	
	// 사진첩 상세 조회
	@Override
	public Album albumDetail(Album detailAlbum) {
		logger.info("AlbumServiceImpl albumDetail 확인");
		
		return albumDao.albumDetail(detailAlbum);
	}

	// 사진첩 작성
	@Override
	public void albumWrite(Album album, MultipartFile file) {
		logger.info("AlbumServiceImpl albumWrite 확인");
		
		albumDao.albumWrite(album);
		
		// 첨부파일 처리

		// 빈 파일일 경우
		if( file.getSize() <= 0 ) {
			return;
		}

		// 파일이 저장될 경로
		String storedPath = context.getRealPath("upload");
		File storedFolder = new File( storedPath );
		if( !storedFolder.exists() ) {
			storedFolder.mkdir();
		}

		// 파일이 저장될 이름
		String albumOriginName = file.getOriginalFilename();
		String albumStoredName = albumOriginName + UUID.randomUUID().toString().split("-")[4];

		// 저장할 파일의 정보 객체
		File dest = new File( storedFolder, albumStoredName );

		try {
			file.transferTo(dest);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//--------------------------------------------

		// 첨부파일 정보 DB 기록
		AlbumFile albumFile = new AlbumFile();
		albumFile.setAlbumNo( album.getAlbumNo() );
		albumFile.setAlbumOriginName(albumOriginName);
		albumFile.setAlbumStoredName(albumStoredName);

		albumDao.albumFileWrite(albumFile);
	}

	// 사진첩 수정
	@Override
	public void albumUpdate(Album album) {
		logger.info("AlbumServiceImpl albumUpdate 확인");
		
		albumDao.albumUpdate(album);
	}
	
	// 사진첩 선택 삭제
	@Override
	public void albumCheckDelete(List<Integer> checkAlbum) {
		logger.info("AlbumServiceImpl albumCheckDelete 확인");
		
		albumDao.albumCheckDelete(checkAlbum);
	}
}