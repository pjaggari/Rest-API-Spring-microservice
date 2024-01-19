A REST client that sends HTTP requests to the project’s controller layer.
A controller layer that handles the incoming requests and delegates them to the appropriate service layer.
A service layer that contains the business logic and interacts with the database layer and the Cloud Vendor Information Service.
A database layer that performs CRUD operations on the database using repositories.
A database that stores the data of the project.
A Cloud Vendor API that provides information about the cloud vendor’s services and resources.
A Cloud Vendor Information Service that consumes the Cloud Vendor API and provides a simplified interface for the service layer.
