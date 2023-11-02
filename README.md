# cloud_labs
Studying cloud technologies

Implementing university labs  
Using **Java 17**, **MySQL 8**, **Spring Boot 2.7.5**

Deployed via Azure App Service  
Try it [here](https://best-party-animators.azurewebsites.net/api/non-secure)*  
**resource can be unavailable due to Azure subscription*

Download
--------
* [Java 17](https://www.oracle.com/cis/java/technologies/downloads/#java17)
* MySQL 8:
    * Visit [official website](https://dev.mysql.com/downloads/installer/)(Windows)
    * Run `sudo apt install mysql-client`(Linux)
    * Run `brew install mysql`(macOS)
 
***

Usage
-----
* Create database "party_animators"
* Run *scheme.sql* to create tables and insert data
* Set new user(default *root*) and password(default is none) in *applications.yml*
* Also set database source url. Should look like following: `jdbc:mysql://localhost:3306/party_animators`
* Run *SpringBootApp.java*
* Execute POST request to `http://localhost:8080/api/non-secure` in order to create new user. Use Postman, Insomnia etc.
* Paste user credentials to access API

Gallery
-------
* Example of using POST request in Insomnia:
<img width="1143" alt="Screenshot 2023-11-02 at 18 57 43" src="https://github.com/StasDen/cloud_labs/assets/93178776/ff846bd3-957f-4322-8af7-4fe7363173e4">

* One of project pages:
<img width="1552" alt="Screenshot 2023-11-02 at 19 32 34" src="https://github.com/StasDen/cloud_labs/assets/93178776/5552f032-86d7-4516-a747-1c9b55c8da9d">

