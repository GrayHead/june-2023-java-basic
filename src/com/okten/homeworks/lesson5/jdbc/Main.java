package com.okten.homeworks.lesson5.jdbc;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {


        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world",
                "root",
                "rootroot");


        PreparedStatement preparedStatement = connection.prepareStatement("select * from city where city.CountryCode =?");
        preparedStatement.setString(1, "AFG");
        ResultSet resultSet = preparedStatement.executeQuery();


        List<City> cities = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString("Name");
            String countryCode = resultSet.getString("CountryCode");
            String district = resultSet.getString("District");
            int population = resultSet.getInt("Population");
            cities.add(new City(id, name, countryCode, district, population));

        }

        cities.stream().forEach(System.out::println);


        connection.close();
    }
}


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
class City {
    int id;
    String name;
    String countryCode;
    String district;
    int population;


}
