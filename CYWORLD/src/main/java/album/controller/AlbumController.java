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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
		
//		//첨부파일 모델값 전달
//		AlbumFile albumFile = albumService.getAttachFile(viewAlbum);
//		model.addAttribute("albumFile", albumFile);
//
//		logger.info("albumList : {}", albumFile);
	}
	
	
	// 사진첩 조회
//	@RequestMapping("/albumDetail")
//	public String albumDetail(Album detailAlbum, Model model) {
//		logger.info("AlbumController Detail 확인");
//		
//		if(detailAlbum.getAlbumNo() < 0) {
//			return "redirect:/album/albumList";
//		}
//		
//		detailAlbum = albumService.albumDetail(detailAlbum);
//		
//		model.addAttribute("detailAlbum", detailAlbum);
//		
//		return "album/albumDetail";
//	}
	
	// 사진첩 조회
	@RequestMapping("/albumDetail")
	public ModelAndView albumDetail(Album detailAlbum,  Model model) {
		logger.info("AlbumController Detail 확인");
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/album/albumDetail");
		mav.addObject("detailAlbum", albumService.albumDetail(detailAlbum));
		
		return mav;
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
	
	@GetMapping("/albumUpdate")
	public void albumUpdateGet() {
		logger.info("AlbumController Update GET 확인");
	}
	
	// 사진첩 수정
	@PostMapping("/albumUpdate")
	@ResponseBody
	public Map<String, Object> albumUpdate(Album album) {
		logger.info("AlbumController Update 확인");
		Map<String, Object> map = new HashMap<>();
		
		try {
			albumService.albumUpdate(album);
			
			map.put("map", album);
			map.put("m", true);
		} catch(Exception e) {
			map.put("message", "오류 : " + e.getCause());
			map.put("m", false);
			
			return map;
		}
		return map;
	}
	
	// 사진첩 삭제
	@RequestMapping("/albumDelete")
	public void albumDelete() {
		logger.info("AlbumController Delete 확인");
	}
	
	// 사진첩 선택 삭제
	@RequestMapping("/albumCheckDelete")
	@ResponseBody
	public List<Integer> albumCheckDelete(@RequestParam(value="checkAlbum") List<Integer> checkAlbum) {
		logger.info("AlbumController CheckDelete 확인");
		
		albumService.albumCheckDelete(checkAlbum);
		
		return checkAlbum;
	}
}