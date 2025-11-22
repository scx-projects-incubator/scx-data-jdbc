package cool.scx.data.jdbc;

import dev.scx.data.context.TransactionContext;
import dev.scx.data.exception.DataAccessException;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCTransactionContext implements TransactionContext {

    private final Connection connection;

    public JDBCTransactionContext(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void commit() throws DataAccessException {
        try {
            connection.commit();
        } catch (SQLException e) {
            throw new DataAccessException(e);
        }
    }

    @Override
    public void rollback() throws DataAccessException {
        try {
            connection.rollback();
        } catch (SQLException e) {
            throw new DataAccessException(e);
        }
    }

}
