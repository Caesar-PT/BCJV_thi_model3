package service;

import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductService implements IProductService {

    protected Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_management", "root", "123456789");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void insertProduct(Product product) {
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("insert into product (name, price, amount, color, description, id_category) value (?, ?, ?, ?, ?, ?);");
            statement.setString(1, product.getName());
            statement.setInt(2, product.getPrice());
            statement.setInt(3, product.getAmount());
            statement.setString(4, product.getColor());
            statement.setString(5, product.getDescription());
            statement.setInt(6, product.getIdCategory());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Product> getAllProduct() {
        Connection connection = getConnection();
        List<Product> list = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement("select * from product;");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id_product");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int amount = resultSet.getInt("amount");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                int idCategory = resultSet.getInt("id_category");

                list.add(new Product(id, name, price, amount, color, description, idCategory));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean delProduct(int id) {
        Connection connection = getConnection();
        boolean del = false;
        try {
            PreparedStatement statement = connection.prepareStatement("delete from product where id_product=?;");
            statement.setInt(1, id);
            del = statement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return del;
    }

    @Override
    public boolean updateProduct(Product product) {
        Connection connection = getConnection();
        boolean update = false;
        try {
            PreparedStatement statement = connection.prepareStatement("update product set name=?, price=?, amount=?, color=?, description=?, id_category=? where id_product=?;");
            statement.setString(1, product.getName());
            statement.setInt(2, product.getPrice());
            statement.setInt(3, product.getAmount());
            statement.setString(4, product.getColor());
            statement.setString(5, product.getDescription());
            statement.setInt(6, product.getIdCategory());
            statement.setInt(7, product.getId());
            update = statement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return update;
    }

    @Override
    public List<Product> findByName(String name) {
        Connection connection = getConnection();
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from product where name like ?;");
            statement.setString(1, "%"+name+"%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id_product");
                String name1 = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int amount = resultSet.getInt("amount");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                int idCategory = resultSet.getInt("id_category");

                productList.add(new Product(id, name1, price, amount, color, description, idCategory));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public Product selectProduct(int id) {
        Connection connection = getConnection();
        Product product = null;
        try {
            PreparedStatement statement = connection.prepareStatement("select * from product where id_product=?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                int amount = resultSet.getInt("amount");
                String color = resultSet.getString("color");
                String description = resultSet.getString("description");
                int idCategory = resultSet.getInt("id_category");

                product = new Product(id, name, price, amount, color, description, idCategory);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;

    }

}
