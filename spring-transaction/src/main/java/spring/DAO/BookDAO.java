package spring.DAO;

public interface BookDAO {
    void updateBalance(Integer userId, Integer price);

    void updateStock(Integer bookId);

    Integer getPrice(Integer bookId);
}
