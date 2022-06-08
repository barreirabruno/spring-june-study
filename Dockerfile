FROM adoptopenjdk/openjdk11:alpine
ARG JAR_FILE=/out/artifacts/JuneStudyB_jar/JuneStudyB.jar
COPY  ${JAR_FILE} JuneStudyB.jar
ENTRYPOINT ["java", "-jar", "JuneStudyB.jar"]