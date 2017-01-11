1.Jhipster1: {
	https://www.youtube.com/watch?v=m0eZcfLHQyg
	1.First we clone jhipster-registry from github: {
		- git clone https://github.com/jhipster/jhipster-registry.git
		- cd jhipster-registry
		- ./mvnw
	}
	2.Next, we create a new jhipster app of type "Microservice Application" with gradle build system. {
		- mkdir mymicroserviceapp
		- cd mymicroserviceapp
		- yo jhipster
	}
	3.Next, we call the entity subgenerator "yo jhipster:entity <entity-name>"
		- Here we need to define the entity: fields, relations.
	4.Now we create the gateway application project. We must select project type "Microservice gateway"
	5.Now when we call the entity subgenerator on the gateway we must answer "yes" to "Generate this entity from an existing microservice" and we must provide the project root path to the microservice project.
		- Here we do not need to define the entity any more.
	6.Now we can run the gateway with gradle and requests to /<serviceName>/api/entity on the gateway will be routed seamlessly to the microservice.
}