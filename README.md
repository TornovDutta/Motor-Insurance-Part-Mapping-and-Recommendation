# Car Management System

## 📌 Overview
This is a **Spring Boot-based Car Management System** that provides REST APIs to perform CRUD (Create, Read, Update, Delete) operations on car records. It uses **Spring Boot, Spring Data JPA, and H2 Database** for efficient management.

## 🛠️ Technologies Used
- **Spring Boot** - Backend Framework
- **Spring Data JPA** - ORM for database interaction
- **H2 Database** - In-memory database for development
- **Lombok** - Reduces boilerplate code
- **Postman** - API Testing

## 📂 Project Structure
```
src/
 ├── main/
 │   ├── java/org/example/decode/
 │   │   ├── controller/CarController.java
 │   │   ├── model/Car.java
 │   │   ├── repository/CarRepo.java
 │   │   ├── service/CarService.java
 │   ├── resources/
 │   │   ├── application.properties
```

## ⚙️ Installation & Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/TornovDutta/Motor-Insurance-Part-Mapping-and-Recommendation.git
   ```
2. Navigate to the project directory:
   ```sh
   cd car-management-system
   ```
3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

## 🚀 API Endpoints
| Method | Endpoint           | Description |
|--------|-------------------|-------------|
| GET    | `/car/{id}`        | Fetch a car by ID |
| GET    | `/car/all`         | Get all cars |
| POST   | `/car/add`         | Add a new car |
| PUT    | `/car/update/{id}` | Update an existing car |
| DELETE | `/car/delete/{id}` | Delete a car by ID |
| POST   | `/car/loadDemo`    | Load demo data |

## 🔹 Sample JSON Data
```json
{
  "number": "ABC123",
  "name": "Toyota Corolla",
  "partNo": 98765,
  "claimNo": "CLM2025",
  "total": 25000
}
```

## 📝 License
This project is licensed under the MIT License.

---
🎯 *Happy Coding!* 🚀

