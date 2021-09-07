#### Sign-Up
```
    POST /api/authentication/sign-up   HTTP/1.1
    HOST: localhost:8080
    Content-Type: application/json

{
    "name":"user",
    "username":"user",
    "password":"user"
}
```

#### Sign-In
```
    POST /api/authentication/sign-in   HTTP/1.1
    HOST: localhost:8080
    Content-Type: application/json
    
    {
        "username":"user",
        "password":"user"
    }
```

#### Make-Admin
```
    PUT /api/internal/make-admin/{username}  HTTP/1.1
    HOST: localhost:8080
    AuthorizationL Bearer InternalAPIKey123!
```
