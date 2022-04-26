CREATE TABLE employee (
   id serial PRIMARY KEY,
   name VARCHAR(200) NOT NULL,
   email VARCHAR(200) NOT NULL,
   mobile VARCHAR(200) NOT NULL,
   location VARCHAR(200) NOT NULL
)
CREATE TABLE department (
   id serial PRIMARY KEY,
   title VARCHAR(200) NOT NULL
)



