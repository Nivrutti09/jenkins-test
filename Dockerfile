#docker build -t ibzplexus-gen .
FROM tomcat:8-jre8

ADD target/cicd-test.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
