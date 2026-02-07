package es.mde.et.madoc.panacea_backend.utils;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseUtils implements CommandLineRunner {

    private final DataSource dataSource;

    public DataBaseUtils(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void run(String... args) throws Exception {
        try (Connection conn = dataSource.getConnection()) {
            if (conn.isValid(2)) {
                System.out.println("✅ Base de datos OK");
            } else {
                System.out.println("❌ Base de datos NO responde");
            }
        }
    }
}