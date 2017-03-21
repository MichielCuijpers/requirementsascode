# requirementsascode
As long as a requirement is still under discussion, it makes sense to have a lightweight documentation of it outside the code, maybe as part of a backlog or a lightweight specification.
As soon as a requirement is implemented, the code itself becomes the most reliable "source of truth" for the requirement and its realization.

With requirementsascode,  you can represent your user journeys as executable specifications in your application source code.  The form of the representation is similar to [user goal level use case](https://en.wikipedia.org/wiki/Use_case#Goal_levels) narratives.

Additionally, you can specify cross-cutting concerns, e.g. for measuring performance.

# documentation
* [hello world examples](https://github.com/bertilmuth/requirementsascode/tree/master/requirementsascodeexamples/helloworld)
* [cross-cutting concerns examples](https://github.com/bertilmuth/requirementsascode/tree/master/requirementsascodeexamples/crosscuttingconcerns)
* [javadoc](https://github.com/bertilmuth/requirementsascode/releases/download/v0.3.0/requirementsascodecore-0.3.0-javadoc.jar)

Note that the API is likely to change.

# getting started
* At least Java 8 is required, download and install it if necessary.
* To use the framework, download the [requirementsascodecore jar](https://github.com/bertilmuth/requirementsascode/releases/download/v0.3.0/requirementsascodecore-0.3.0.jar) and save it in a local folder.
* If you want to try out the Hello World examples, download the [helloworld jar](https://github.com/bertilmuth/requirementsascode/releases/download/v0.3.0/helloworld-0.3.0.jar) and save it in the same folder.
* To run the first Hello World example, switch to the folder in a console and enter: 

Windows:
``` java
java -cp "helloworld-0.3.0.jar;requirementsascodecore-0.3.0.jar" helloworld.HelloWorld01_PrintHelloUserExample
```
Unix:
``` java
java -cp "helloworld-0.3.0.jar:requirementsascodecore-0.3.0.jar" helloworld.HelloWorld01_PrintHelloUserExample
```
The same principle applies to all example projects: you need to put the example jar
on the classpath, and the requirementsascodecore jar.

Note that if you want to use the shoppingappjavafx example in Eclipse, you should use
the e(fx)clipse plugin.

Build tool support will be available in the future.

# subprojects
* [requirementsascodecore](https://github.com/bertilmuth/requirementsascode/tree/master/requirementsascodecore): the core library to be used, with no third-party dependencies.
* [requirementsascodeexamples](https://github.com/bertilmuth/requirementsascode/tree/master/requirementsascodeexamples): example projects illustrating the use of requirementsascodecore.

# benefits
* Perform impact analysis of changes: how does a change to a requirement affect the software components?
* Always up-to-date traceability from requirements to code (inside the code)
* Clear separation between requirements and realization, making technological changes easier
* Clear separation between user interface and backend, making it easier to test the application without user interface, and vary or change the user interface

In the future it will also be possible to generate always up-to-date documentation from the code 
that documents how the application really works.

# related topics
* The work of Ivar Jacobson on Use Cases. As an example, have a look at [Use Case 2.0](https://www.ivarjacobson.com/publications/white-papers/use-case-ebook).
* The work of Alistair Cockburn on Use Cases, specifically the different goal levels. Look [here](http://alistair.cockburn.us/Use+case+fundamentals) to get started, or read the book "Writing Effective Use Cases".
* Behavior Driven Development ([BDD](https://dannorth.net/introducing-bdd/)): There are similarities in the purpose of BDD and requirementsascode. Both try to provide a "ubiquitous language" to be spoken by both business people and developers. While the focus of BDD is more on specific examples (that may or may not be executed by automated tests), the focus of requirementsascode is on implementation of requirements in production code. While examples and tests focus on the specific state or behavior resulting from a specific input to the software, the requirements describe the software's behavior in more general terms. 
* The Boundary Control Entity Pattern ([BCE](http://epf.eclipse.org/wikis/openup/core.tech.common.extend_supp/guidances/guidelines/entity_control_boundary_pattern_C4047897.html)): The UseCaseRunner in requirementsascode plays the role of the Control class in BCE, but it is configured by an underlying UseCaseModel.
* Robert C. Martin's [Clean Architecture](https://8thlight.com/blog/uncle-bob/2012/08/13/the-clean-architecture.html) and the architectures it is based upon.
