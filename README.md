# Open Learn API
The Open Learn API is responsible for the server side layer of the Open Learn Platform.

The README helps new and existing contributors with set up.

## Database
The underlying database layer is a MYSQL db instance running on AWS. 
Currently there is only one db instance set up, which is used as a shared development db.

### How to Connect to the Dev DB Server

1) [Download and Install MYSQL Workbench](https://dev.mysql.com/downloads/workbench/)

2) Launch MySQL Workbench

3) Create New DB Connection (Database -> Manage Connections -> New)
* Connection Name: <Whatever-you-want-to-call-it>
* Host: <Contact-Project-Owners>
* Port: <Contact-Project-Owners>   
* Username: <Contact-Project-Owners>

4) Click "Test Connection" button and input the password (<Contact-Project-Owners>)
5) If successful, the connection is all set up
6) Open connection (Database -> Connect to Database -> Select Connection Name you just created -> Ok)