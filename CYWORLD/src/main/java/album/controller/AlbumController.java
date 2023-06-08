package album.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import album.dto.Album;
import album.dto.AlbumFile;
import album.service.face.AlbumService;

@Controller
@RequestMapping("/album")
public class AlbumController {

	// 로그 객체
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// 서비스 객체
	@Autowired private AlbumService albumService;
	
	// 테스트
	@RequestMapping("/album")
	public void main() {
		logger.info("album 확인");
	}
	
	// 사진첩 메인
	@RequestMapping("/albumList")
	public void albumList(Album viewAlbum, Model model) {
		logger.info("AlbumController albumList 확인");
		
		List<Album> albumList = albumService.albumList();
		
		for( Album a : albumList )
		
		logger.info("albumList : {}", a);
		
		model.addAttribute("albumList", albumList);
		
		//첨부파일 모델값 전달
//		AlbumFile albumFile = albumService.getAttachFile(viewAlbum);
//		model.addAttribute("viewAlbumFile", viewAlbum);
	}
	
	// 사진첩 조회
	@RequestMapping("/albumDetail")
	public void albumDetail() {
		logger.info("AlbumController Detail 확인");
	}
	
	// 사진첩 작성 GET
	@GetMapping("/albumWrite")
	public void albumWriteGET() {
		logger.info("AlbumController Write GET 확인");
	}
	
	// 사진첩 작성 POST
	@PostMapping("/albumWrite")
	public String albumWritePOST(Album album, MultipartFile file) {
		logger.info("AlbumController Write POST 확인");
		
		// 서비스 객체 연결, 게시판 작성
		albumService.albumWrite(album, file);
		
		logger.info("albumWrite album : {}", album);
		logger.info("albumWrite file : {}", file);
			
		return "redirect:/album/albumList";
	}
	
	// 사진첩 수정
	@RequestMapping("/albumUpdate")
	public void albumUpdate() {
		logger.info("AlbumController Update 확인");
	}
	
	// 사진첩 삭제
	@RequestMapping("/albumDelete")
	public void albumDelete() {
		logger.info("AlbumController Delete 확인");
	}
	
	// 사진첩 선택 삭제
	@RequestMapping("/albumCheckDelete")
	public void albumCheckDelete() {
		logger.info("AlbumController CheckDelete 확인");
	}
}