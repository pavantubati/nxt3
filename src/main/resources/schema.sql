CREATE TABLE hotel(
    hotelId INT PRIMARY KEY AUTO_INCREMENT,
    hotelName VARCHAR(255),
    location VARCHAR(255),
    rating INT 
);

CREATE TABLE room(
    roomId INT PRIMARY KEY AUTO_INCREMENT,
    roomNumber VARCHAR(255),
    type VARCHAR(255),
    price DOUBLE,
    hotelId INT,
    FOREIGN KEY(hotelId) REFERENCES hotel(hotelId)
);