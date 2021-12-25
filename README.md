# test-task 2.0
Spring cloud config server repos:

* profile default: https://github.com/ahsel21/spring-cloud-config-properties 
* profile dev: https://github.com/ahsel21/spring-cloud-config-properties-dev

##Запуск:
В каждом модуле выполнить:

     gradle build
    ./gradlew bootBuildImage
Затем из основной директории:

    docker-compose up

В браузере открыть:

    http://localhost:8080