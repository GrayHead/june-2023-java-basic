package com.okten.homeworks.lesson4.expml;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb",
                "logintodb",
                "passtodb");


        PreparedStatement preparedStatement = connection.prepareStatement("select * from cities");
        ResultSet resultSet = preparedStatement.executeQuery();


        List<City> cities = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            cities.add(new City(id, name));
        }


        //....

        cities.stream().filter(city -> city.getId() > 466).collect(Collectors.toList()).forEach(city -> System.out.println(city));
        connection.close();


    }

}

@Data
@AllArgsConstructor
@NoArgsConstructor
class City {
    private int id;
    private String name;
}
