package org.example.demo3.board;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.demo3.reply.Reply;

import java.util.List;

@Table(name = "board_tb")
@NoArgsConstructor
@Data // getter, setter, toString
@Entity
public class Board {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String title;
    //@JsonIgnore
    private String content;

    @JsonIgnoreProperties({"board", "comment"})
    @OneToMany(mappedBy = "board")
    private List<Reply> replies; // FK로 DB에 만들어질수가 없다!!

    @Builder
    public Board(Integer id, String title) {
        this.id = id;
        this.title = title;
    }
}
