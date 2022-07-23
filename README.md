# jwt Example

## What is JWT?

JWT stands for JSON Web Token. JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed. The client will need to authenticate with the server using the credentials only once. During this time the server validates the credentials and returns the client a JSON Web Token(JWT). For all future requests the client can authenticate itself to the server using this JSON Web Token(JWT) and so does not need to send the credentials like username and password.


## Workflow of JWT 

During the first request the client sends a POST request with username and password. Upon successful authentication the server generates the JWT sends this JWT to the client. This JWT can contain a payload of data. On all subsequent requests the client sends this JWT token in the header. Using this token the server authenticates the user. So we don't need the client to send the user name and password to the server during each request for authentication, but only once after which the server issues a JWT to the client. A JWT payload can contain things like user ID so that when the client again sends the JWT, you can be sure that it is issued by you, and you can see to whom it was issued.

## Structure of JWT

JWT has the following format -header.payload.signature.

## How to get token by Postman

Url: http://localhost:8080/authenticate
Method: POST
{
    "username":"javainuse",
    "password":"password"
}

## How to Access any endpoint

URL:http://localhost:8080/user
Method:Get
At header add Authorization key 
Authorization : token


 


 

