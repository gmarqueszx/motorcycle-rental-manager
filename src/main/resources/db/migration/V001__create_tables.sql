CREATE SEQUENCE motorcycle_seq
START WITH 1
INCREMENT BY 50;

CREATE SEQUENCE deliveryman_seq
START WITH 1
INCREMENT BY 50;

CREATE SEQUENCE rental_seq
START WITH 1
INCREMENT BY 50;

CREATE TABLE motorcycle (
    id BIGINT DEFAULT nextval('motorcycle_seq') PRIMARY KEY,
    year INTEGER NOT NULL,
    model VARCHAR(30) NOT NULL,
    license_plate VARCHAR(8) NOT NULL UNIQUE,
    available BOOLEAN NOT NULL DEFAULT TRUE
);

ALTER SEQUENCE motorcycle_seq OWNED BY motorcycle.id;

CREATE TABLE deliveryman (
    id BIGINT DEFAULT nextval('deliveryman_seq') PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    cpf VARCHAR(15) NOT NULL UNIQUE,
    date_of_birth DATE NOT NULL,
    cnh_number VARCHAR(12) NOT NULL UNIQUE,
    cnh_type VARCHAR(4) NOT NULL,
    cnh_image_url VARCHAR NOT NULL
);

ALTER SEQUENCE deliveryman_seq OWNED BY deliveryman.id;

CREATE TABLE rental(
    id BIGINT DEFAULT nextval('rental_seq') PRIMARY KEY,
    motorcycle_id BIGINT NOT NULL ,
    deliveryman_id BIGINT NOT NULL ,
    contract_date TIMESTAMPTZ,
    rental_start TIMESTAMPTZ,
    expected_end TIMESTAMPTZ,
    return_date TIMESTAMPTZ,
    rental_plan VARCHAR(15),
    CONSTRAINT fk_rental_motorcycle FOREIGN KEY (motorcycle_id) REFERENCES motorcycle(id),
    CONSTRAINT fk_rental_deliveryman_id FOREIGN KEY (deliveryman_id) REFERENCES deliveryman(id)
);

ALTER SEQUENCE rental_seq OWNED BY rental.id;