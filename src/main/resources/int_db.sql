create database collectivite_agricole_db;

create user collectivite_agricole_user with password '123456';


GRANT ALL ON SCHEMA public TO collectivite_agricole_user;

GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO collectivite_agricole_user;

GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO collectivite_agricole_user;

GRANT ALL ON SCHEMA public TO collectivite_agricole_user;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO collectivite_agricole_user;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO collectivite_agricole_user;

ALTER DEFAULT PRIVILEGES IN SCHEMA public
    GRANT ALL ON TABLES TO collectivite_agricole_user;

ALTER DEFAULT PRIVILEGES IN SCHEMA public
    GRANT ALL ON SEQUENCES TO collectivite_agricole_user;