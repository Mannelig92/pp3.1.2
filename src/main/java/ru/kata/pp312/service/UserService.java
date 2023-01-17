package ru.kata.pp312.service;


import ru.kata.pp312.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user); //���������� �����

    void removeUserById(long id); //�������� ������

    List<User> getAllUsers(); //����� ���� ������

    void editUser(User user);

    User getUser(long id);
}
