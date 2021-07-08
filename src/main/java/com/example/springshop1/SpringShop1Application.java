package com.example.springshop1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringShop1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringShop1Application.class, args);
    }

    //USER - пользователь
    //ROLE - Роль - Менеджер(Контролирование количества товаров, Просмотр покупателей),
    // Покупатель(заказ товара), если успеем добавим Администратора
    //PRODUCT - Товар(если успеем, то добавление файлов(например фото товара))
    //REVIEWS - Отзывы
    //Cart - корзина
    //Двухфакторная авторизация

    //https://tproger.ru/articles/ngrok-tutorial/ - выкладка бэкенда в общий доступ(для тестирования)

    //1) Добавить кнопку перехода из корзины в main-view
    //2) Переделать логику работы с корзиной на работу с бд
    //3) Добавить сущность Order, а также написать скрипты на инициализацию этой таблицы

    //24.06.2021
    //1) Легкий старт с гугл апи https://developers.google.com/gmail/api/quickstart/java
}
