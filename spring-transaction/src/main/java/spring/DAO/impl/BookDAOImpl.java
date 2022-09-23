package spring.DAO.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import spring.DAO.BookDAO;
import org.springframework.stereotype.Repository;

/**
 * @author cc
 * @date 2022年09月23日 19:17
 */
@Repository
public class BookDAOImpl implements BookDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void updateBalance(Integer userId, Integer price) {
        String sql = "update t_user set balance = balance - ? where user_id = ?";
        jdbcTemplate.update(sql,price,userId);

    }

    @Override
    public void updateStock(Integer bookId) {
        String sql ="update t_book set stock = stock -1 where book_id =?";
        jdbcTemplate.update(sql,bookId);
    }

    @Override
    public Integer getPrice(Integer bookId) {
        String sql ="select price from t_book where book_id =?";
        return jdbcTemplate.queryForObject(sql,Integer.class,bookId);
    }
}
