FROM tomcat:9.0

# Clean the default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the WAR file into Tomcat's webapps directory
COPY target/JtSpringProject-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Expose port
EXPOSE 8080
