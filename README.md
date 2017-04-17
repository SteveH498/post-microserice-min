# post-microservice-min
Most minimal version of a Spring Boot microservice handling simple post requests.


Push to Cloud Foundry
```
cf push <APP_NAME>
```

Create DB backing service
```
cf create-service postgresql v9.4-container <SERVICE_NAME>
```

Bind backing service to app
```
cf bind-service <APP_NAME> <SERVICE_NAME>
```
