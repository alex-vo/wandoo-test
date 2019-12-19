This repo contains 2 projects - client and server. Directory client-dist contains pre-built files needed for frontend of the application. To run the app go to the directory ```server``` and run:
```
./gradlew bootRun
```

After running this command the app will be available at http://localhost:8080/. It is possible to login as admin by providing username 'admin' and any non-empty password. Mailcatcher web UI will be available at http://localhost:1080/.
This program assumes there are docker and docker-compose installed on the host machine. Docker is needed to setup the ```mailcatcher``` container to intercept emails.

Command
```
./gradlew clean
```
will clean up project files and turn down the mailcatcher container.

Adding 'development' profile will initialize the app with some predefined data:
```
./gradlew bootRun -Pprofile=development
```
In this case it is possible to login as customer straight away with email 'cs@cs.lv' and any non-empty password.