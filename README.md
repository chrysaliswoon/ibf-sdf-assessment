## Assessment Tasks

### Task 1

- [X] Generate a Maven project
- [X] Create a remote git repo.
- [X] Add link to the Maven project to a remote git repo
- [X] Perform an initial commit and push of your project

### Task 2

**HTTP Folder**

- [X] Main: Web server's main class
- [X] HttpServer: Main web server class
- [X] HttpClientConnection: Class handles the request and response comm. between the server and the client (browser)

**Root**
- [X] Main: Starting class to execute the HTTP server with the 'java -jar' option

### Task 3

Web server should accept the following command line options when starting:

- [] 
```
--port <port number>
```

if port is not specified, it will default to port 3000

- [] --docRoot <colon delimited list of directories>: one or more directories where the HTML, CSS and JS files and images are stored. If not specified, default to static directory in the current path
- [] java -cp