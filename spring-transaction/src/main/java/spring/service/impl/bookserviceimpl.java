package spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import spring.DAO.BookDAO;
import spring.service.Bookservice;

import java.util.concurrent.TimeUnit;

/**
 * @author cc
 * @date 2022年09月23日 19:17
 */
@Service
@Transactional
public class bookserviceimpl implements Bookservice {
    @Autowired
    private BookDAO bookDAO;
    @Override
    @Transactional(
//            readOnly = true 当事务中只有查询操作
//            timeout = 3,noRollbackFor = ArithmeticException.class,noRollbackForClassName = ("")

//                    isolation = Isolation.DEFAULT
            propagation = Propagation.REQUIRES_NEW
    )

    public void buybook(Integer userId, Integer bookId) {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //查询图书价格
       Integer price = bookDAO.getPrice(bookId);
        //更新图书库存
        bookDAO.updateStock(bookId);
//        更新用户余额
        bookDAO.updateBalance(userId,price);
    }
}
