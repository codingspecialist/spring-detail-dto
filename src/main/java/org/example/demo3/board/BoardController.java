package org.example.demo3.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/board/{id}")
    public @ResponseBody Board detail(@PathVariable("id") Integer id){
        Board board = boardService.상세보기(id);
        return board; // 모든 필드를 getter를 호출하면서 json으로 변환
    }
}
