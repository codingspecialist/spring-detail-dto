package org.example.demo3.reply;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.demo3.board.Board;

@Table(name = "reply_tb")
@NoArgsConstructor
@Data // getter, setter, toString
@Entity
public class Reply {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY)
    private Board board;
}
