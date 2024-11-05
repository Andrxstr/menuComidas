package apiMenu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;
import java.sql.Connection;
    @Component
    public class DatabaseConnectionTester implements CommandLineRunner {
        private final DataSource dataSource;

        public DatabaseConnectionTester(DataSource dataSource) {
            this.dataSource = dataSource;
        }

        @Override
        public void run(String... args) throws Exception {
            try (Connection connection = dataSource.getConnection()) {
                System.out.println("Conexión a la base de datos establecida correctamente: " + connection.getCatalog());
            } catch (Exception e) {
                System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            }
        }
    }

