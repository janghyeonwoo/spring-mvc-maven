package project.repository;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import project.entity.Board;

import java.util.List;

import static project.entity.QBoard.board;

@Repository
@RequiredArgsConstructor
public class BoardRepo {


    private final JPAQueryFactory jpaQueryFactory;

    public List<Board> getBoard(){
        return jpaQueryFactory.select(board)
                .from(board)
                .where(
                        eqContent("ct"),
                        eqUser("us")
                )
                .fetch();
    }

    private BooleanExpression eqContent(String content){
        return board.content.eq(content);
    }

    private BooleanExpression eqUser(String user){
        return board.user.eq(user);
    }



}
