package org.example.demo3.board;

import lombok.Data;

import java.util.List;

public class BoardResponse {

    @Data
    public static class DetailDTO {
        private Integer id;
        private String title;
        private String content;
        private List<ReplyDTO> replies; // FK로 DB에 만들어질수가 없다!!
        @Data
        class ReplyDTO {
            private Integer id;
            private String comment;
        }
    }
}
