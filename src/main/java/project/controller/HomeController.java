package project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.entity.dto.UserDto;


@RequestMapping("/")
@RestController
public class HomeController {


    @GetMapping("")
    public ResponseEntity<UserDto> mae(){
        UserDto userDto = new UserDto();
        userDto.setUserName("useName");
        return ResponseEntity.ok(userDto);
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
