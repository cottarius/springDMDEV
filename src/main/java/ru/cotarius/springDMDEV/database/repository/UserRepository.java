package ru.cotarius.springDMDEV.database.repository;

import ru.cotarius.springDMDEV.pool.ConnectionPool;

public class UserRepository {
    private final ConnectionPool connectionPool;

    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
