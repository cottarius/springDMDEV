package ru.cotarius.springDMDEV.database.repository;

import ru.cotarius.springDMDEV.pool.ConnectionPool;

public class CompanyRepository {
    private final ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
