FROM openjdk:8-jdk-alpine
ENV APP_HOME /usr/app
COPY target/test-0.0.2.jar $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh","-c","exec java -jar test-0.0.2.jar"]