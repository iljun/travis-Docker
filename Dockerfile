FROM openjdk:8u201-jdk-alpine
MAINTAINER ethan Won <sumusb34@gmail.com>
ADD /build/libs/travis-Docker.jar /app/travis-Docker.jar
EXPOSE 8080
CMD ["java","-jar","app/travis-Docker.jar"]