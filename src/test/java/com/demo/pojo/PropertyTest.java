package com.demo.pojo;

import jakarta.servlet.annotation.WebServlet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FruitProperty.class)
public class PropertyTest {
    @Autowired
    FruitProperty fruitProperty;

    @Test
    public void test(){
        List<Fruit> fruitData = fruitProperty.getList();

        if (fruitData != null) {
            assertThat(fruitData.get(0).getName(), is("banana"));
            assertThat(fruitData.get(0).getColor(), is("yellow"));

            assertThat(fruitData.get(1).getName(), is("apple"));
            assertThat(fruitData.get(1).getColor(), is("red"));

            assertThat(fruitData.get(2).getName(), is("watermelon"));
            assertThat(fruitData.get(2).getColor(), is("green"));
        }
    }
}