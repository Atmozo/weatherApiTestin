# Weather API Test Suite

API test automation project using REST Assured and TestNG.

## APIs Tested
- **Dogs API** (`dog.ceo/api`) - breed listings and images
- **JSONPlaceholder** (`jsonplaceholder.typicode.com`) - CRUD user operations
- **OpenWeatherMap** (`api.openweathermap.org`) - weather station management (requires paid API key)

## Stack
- Java 21
- REST Assured 5.4.0
- TestNG 7.10.2
- Allure Reports 2.27.0
- Maven

## Setup
1. Clone the repo
2. Copy `.env.example` to `.env` and fill in your API keys:
```
cp .env.example .env
```
3. Install dependencies:
```
mvn clean install -DskipTests
```

## Running Tests
```bash
# All tests
mvn clean test

# Specific suite
mvn test -Dtest="Tests.Dogs.test"
mvn test -Dtest="Tests.ReqRes.ReqResTests"
mvn test -Dtest="Tests.WeatherApi.test"

# Multiple suites
mvn test -Dtest="Tests.Dogs.test,Tests.ReqRes.ReqResTests"
```

## Environment Variables
See `.env.example` for required variables. Never commit `.env`.

## Project Structure
```
src/test/java/
├── Common/          # Shared utilities, builders, test data
├── Tests/
│   ├── Dogs/        # Dog API tests
│   ├── ReqRes/      # User API tests
│   └── WeatherApi/  # Weather station tests
```
