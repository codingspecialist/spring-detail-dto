package org.example.demo3.board;

import lombok.RequiredArgsConstructor;
import org.example.demo3.reply.Reply;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    // BoardResponse.DetailDTO 로 바꿔서 응답
    public Board 상세보기(int id){
        Board board = boardRepository.mFindById(id).orElseThrow(() -> new RuntimeException("게시글 못찾음"));
        return board;
    }

}
