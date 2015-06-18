# Start service to test standalone 
mvn jetty:run

# Generate beans from schema
1. CD to project directory 
2. xjc schema/AiravataMessage.xsd -p org.airavata.client.message -d src/main/java/