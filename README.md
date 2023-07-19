# Secure Client Server Environment
## About
This project was a small test to understand how HTTPS could be implemented.<br>
It is used to send a message securely from a client to a server

## Technology
- RESTful Java API using a Springboot framework
- Maven runs the API
- Python client script to send the request using the **requests** library
- Using a self-signed certificate, the API accepts an HTTPS post request on https://localhost/?message=secret
