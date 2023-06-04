FROM openjdk:11

VOLUME /tmp

COPY /build/libs/*.jar api.jar

ENTRYPOINT ["java", "-jar", "/api.jar"]