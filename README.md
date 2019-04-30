# Annotation-and-AutoWiring
Java annotation and Spring auto-wiring


What is spring auto-wiring?
For dependency injection the spring uses auto wiring. Ie the spring will look for a class that matches a given property. Once the spring will find a match, spring will inject it automatically.

Auto wiring injection types
1. Constructor injection
2. Setter injection
3. Field injection

Development process for constructor injection
1. Define the dependency interface and the class.
2. Create constructor in your class for injections
3. Configure the dependency injection with @Autowired annotation

Setter injection
Inject dependencies by calling setter methods of your class

Development process
1. Create a setter method in your lass for injections
2. Configure the dependency injection with the @Autowired Annotation.
