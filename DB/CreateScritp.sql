create user inmouser with encrypted password '123456';
create database inmodb with owner vuelosuser;

create user {nombre_usuario} with encrypted password '{contraseña}';
create database {nombre_db} with owner {nombre_usuario};

grant all privileges on database {nombre_db} to {nombre_usuario};