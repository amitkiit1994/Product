# Product
This is a Web application built with spring boot and thymeleaf and containerized with docker

# Run the application from command line
1. Traverse to the cloned directory
2. mvn clean
3. mvn package verify
4. java -jar target/*.jar

# Run the application with docker
1. docker pull amitkiit1994/learning
2. docker run -d -t -p 8080:8080 --name product amitkiit1994/learning:latest

Hit localhost:8080/products

API Information:
GET: localhost:8080/products/api/products/
POST: localhost:8080/products/api/products/
Request payload:
  
    {
        "prodName": "Poco F2",
        "prodDesc": "Poco from Xiaomi",
        "categoryItem": 2
    }
DELETE: localhost:8080/products/api/products/{prodid}
PUT: localhost:8080/products/api/products/{prodid}

