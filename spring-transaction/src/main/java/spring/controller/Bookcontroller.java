package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.service.Bookservice;

/**
 * @author cc
 * @date 2022年09月23日 19:17
 */
@Controller
public class Bookcontroller {
    @Autowired
    private Bookservice bookservice;

        public void buybook(Integer userId,Integer bookId){
            bookservice.buybook(userId,bookId);
        }

}
