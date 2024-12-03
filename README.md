# Commerce Microservice Application using spring Framework

## Application Architecture
![micro-services-global-architecture](https://github.com/user-attachments/assets/e2a069d1-74e1-4e98-b533-746bb32794d5)

## Application Data Modelling
![commerce spring microservice](https://github.com/user-attachments/assets/f1052b75-0595-4b4c-89f8-03e3b706ffa3)

## Docker Compose Containers

For this project/application we are going for dockerized images as the main service providers. This will help us manage all the services from one file. For running and managing this application install docker desktop and cli in your device. Then run the following command to start all the containers:

```shell
# This command is used to start Docker containers in detached mode.
docker compose up -d
```
To stop the services of docker compose:

```shell
# Shuts down all the running containers.
docker compose down
```

> [!NOTE]
> To run individual services which is recommended if you have a old computer just like I do use this following syntax.

```shell
docker compose up <service name>
# OR
docker compose up -d <service name>
```

```shell
docker compose down <service name>
```