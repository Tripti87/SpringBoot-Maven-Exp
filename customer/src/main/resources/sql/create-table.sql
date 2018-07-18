DROP TABLE customers IF EXISTS;
DROP TABLE addresses IF EXISTS;

CREATE TABLE customers (
  id  VARCHAR(255),
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  email VARCHAR(255),
  phone VARCHAR(255),
  addressId VARCHAR(255),
  status VARCHAR(255)
);

CREATE TABLE addresses (
  id  VARCHAR(255),
  city VARCHAR(255),
  state VARCHAR(255)
);