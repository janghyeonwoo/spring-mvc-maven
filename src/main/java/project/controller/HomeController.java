package project.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.entity.Board;
import project.repository.BoardRepo;
import project.repository.BoardRepository;

import java.util.List;


@RequestMapping("/")
@RequiredArgsConstructor
@RestController
public class HomeController {

    private final BoardRepo boardRepo;
    private final BoardRepository boardRepository;

    @GetMapping("")
    public ResponseEntity<String> mae(){
        boardRepository.findAll();
        return ResponseEntity.ok("aa");
    }

    @GetMapping("/board/list")
    public ResponseEntity<List<Board>> getBoardList(){
        return ResponseEntity.ok(boardRepo.getBoard());
    }
//
//    @Autowired
//    BoardRepository boardRepository;
//
//    @GetMapping("/test")
//    public String home(){
//        System.out.println("============================");
//        boardRepository.findAll();
//        System.out.println("============================");
//
//        return "ss";
//    }
//
//    @GetMapping("")
//    public String home2(){
//        System.out.println("============================");
//        boardRepository.findAll();
//        System.out.println("============================");
//
//        return "ss";
//    }


}
