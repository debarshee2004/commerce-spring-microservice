# Commerce Microservice Application using Spring Framework

## Application Architecture
![image](https://github.com/user-attachments/assets/30a2d5b9-989e-49ea-914f-9ace3197173b)

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
> To run individual services, which is recommended, if you have an old computer just like I do, use the following syntax. Replace the `<service name>` with the required service name _(refer to [docker-compose.yml](docker-compose.yml) file for the service names)_ you want to run in isolation.

```shell
docker compose up <service name>
# OR
docker compose up -d <service name>
```

```shell
docker compose down <service name>
```
