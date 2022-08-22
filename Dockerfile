# FROM adoptopenjdk/openjdk11
FROM bellsoft/liberica-openjdk-alpine-musl:11.0.15-10
RUN addgroup --system spring && adduser --system spring --ingroup spring
USER spring:spring
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} app.war
ENV JAVA_TOOL_OPTIONS="-XX:MinRAMPercentage=50 -XX:MaxRAMPercentage=80 -XX:+PrintFlagsFinal"
ENTRYPOINT ["java", "-jar", "/app.war"]