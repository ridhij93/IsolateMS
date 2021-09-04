# IsolateMS

  This repository contains the results of running a refactoring tool on monolithic applications to produce cleaner microservices. We include results for 5 publicly available monolithic applications:
  1. DayTrader
  2. PlantsByWebsphere
  3. Petclinic
  4. Mayocats
  5. AcmeAir

The result for each of these applications include:
 1. graph_clustering.json: Contains the total number of classes, microservices, and each class' assiociation to a microservice. Some classes are exceptions and are not a part of any microservice. This file is provided as an input to the tool.
 2. MethodDependencies.json: Contains methods and their corresponding callers and callees for each class. It records calls internal to as well as external to a class. 
 3. ClassDetails.json: Stores basic details about each class analyzed (and a part of the microservice) such as class name, microservice it belongs to, number of fields, methods, their arguments, access spscifier, return type, constructors, their arguments and whether the class is an interface.
 4. class_subgraphs.json: Contains disconnected-subgraph details for each class. The details include all methods and associated fields that are accessed by these methods. It also contains the caller-callee information for each disconnected-subgraph and the target microservice it can be relocated to. The relocation microservice is left empty if the disconnected subgraph cannot be moved. 
 5. MovableSubgraphs.json: Contains filtered disconnected-subgraph objects from class_subgraphs.json that can be relocated.
