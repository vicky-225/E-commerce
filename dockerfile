# Use the official Tomcat image
FROM tomcat:9.0

# Copy your WAR file into the webapps directory
COPY JtSpringProject-0.0.1-SNAPSHOT /usr/local/tomcat/webapps/

# Expose the default Tomcat port
EXPOSE 8081

# Start Tomcat
CMD ["catalina.sh", "run"]
