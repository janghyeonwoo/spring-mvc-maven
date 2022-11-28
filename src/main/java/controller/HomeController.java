package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.BoardRepository;

@RequestMapping("/")
@RestController
public class HomeController {

    @Autowired
    BoardRepository boardRepository;

    @GetMapping("")
    public String home(){
        System.out.println("============================");
        boardRepository.findAll();
        System.out.println("============================");

        return "ss";
    }


}
