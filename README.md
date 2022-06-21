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

- [] 
```
--docRoot <colon delimited list of directories>
```

one or more directories where the HTML, CSS and JS files and images are stored. If not specified, default to static directory in the current path

- [] 
```
java -cp
```

start the server on port 3000; docRoot directory is ./target

- []
```
java -cp ./myserver.jar --port 8080
```

start the server on port 8080; docRoot directory is ./target

- []
```
 java -cp ./myserver.jar --docRoot ./target:/opt/tmp/www
```

start the server on port 3000; the docRoot directories will be ./target and /opt/tmp/www

- []
```
 java -cp ./myserver.jar --port 8080 --docRoot 
 ./target:/opt/tmp/www 
```

start the server on port 8080; docRoot directories will be ./target and /opt/tmp/www

### Task 4

When HTTP server starts, perform the following:

- [] Open a TCP connection and listen on the port from the port option
- [] Check each of the docRoot path; for each path verify that
  - [] path exists
  - [] path is a directory
  - [] path is readable by the server

- [] If any of the above conditions fail, print the failure reason on the console, stop the server and exit the program with System.exit(1).

### Task 5

- [] Create a thread pool with 3 threads
- [] Server will listen on the specified port
- [] Server will accept incoming connections from the browser
- [] When new connection is established, this connection should be handled by a thread from the threadpool.
- [] Main control thread (server) should go back to waiting for new incoming connections


### Task 6

Client thread (handling the client connection) should perform the following tasks:
- [] Read the first line from the incoming request and perfom one of the following actions:


### Task 7

- [X] Create directory called static at the root of project folder

- [] Write a HTML document called index.html with the following content:
  - [X] Any PNG image. This PNG image must be in the static folder. Reference the image as <img href="/mypic.png"> 
  - [X] Header line (h1) with any text
  - [X] Link to another HTML document in static directory
  - [X] Any text resources (e.g. CSS, JS) referenced by index.html should also be placed in the static directory
  - [X] Image, text and link must be positioned in the center (horizontally and vertically) of the browser's viewport(window)
  - [X] Image should remain at the center when the browser's window is resized
  
- [] Run HTTP server and test if can access the HTML document from the browser:
  - [] http://localhost:<port>
  - [] http://localhost:<port>/index.html