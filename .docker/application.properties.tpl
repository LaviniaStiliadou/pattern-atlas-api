server.port={{.Env.API_PORT}}
spring.profiles.active=default,test
spring.datasource.initialization-mode=always
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://{{.Env.JDBC_DATABASE_URL}}:{{.Env.JDBC_DATABASE_PORT}}/{{.Env.JDBC_DATABASE_NAME}}
spring.datasource.username={{.Env.JDBC_DATABASE_USERNAME}}
spring.datasource.password={{.Env.JDBC_DATABASE_PASSWORD}}
logging.level.io.github.patternatlas.api=info
logging.level.org.springframework.security={{.Env.SECURITY_LOGLEVEL}}
spring.jpa.show-sql=false
spring.jpa.generate-ddl=true
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.properties.hibernate.show_sql=false
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true
spring.liquibase.enabled=true
spring.liquibase.change-log=file:patternatlas.xml
spring.liquibase.password={{.Env.DB_INIT_PASSWORD}}
spring.liquibase.user={{.Env.DB_INIT_USER}}
spring.liquibase.url=jdbc:postgresql://{{.Env.JDBC_DATABASE_URL}}:{{.Env.JDBC_DATABASE_PORT}}/{{.Env.JDBC_DATABASE_NAME}}
security.oauth2.resource.jwk.key-set-uri={{.Env.JWK_URI}}