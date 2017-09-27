# Simple Rest Service

This project creates a very simple RESTful web service in Java. The implementation is
done using [Jersey][1] as the JAX-RS implementation and [Jackson][2] for marshalling/unmarshalling
POJOs (Plain Old Java Object) into JSON.

## Running the Application

This project creates a single war file which can be deployed on any servlet container. The project
also makes use of the [Apache Tomcat Maven plugin][3] and can be tested by executing the maven goal:
`tomcat7:run`. This will deploy the war file on an embedded tomcat (within Maven) instance and
run it on port 8080 on the localhost.

## Testing

Once the applciation is deployed, either through a separate servlet container or by using the Maven
Apache Tomcat7 plugin as described in *Running the Application*, visit one of these links to test
out the service methods:

* <http://localhost:8080/Simple/hello>
* <http://localhost:8080/Simple/echo?param=myValueInJSON>


[1]: https://jersey.github.io/
[2]: https://github.com/FasterXML/jackson
[3]: http://tomcat.apache.org/maven-plugin-2.0/tomcat7-maven-plugin/