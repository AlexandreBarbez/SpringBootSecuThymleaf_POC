# Janus

## launch config

### Local run :   
Il suffit de compiler le projet et de créer le livrable
> mvn package   

et de lancer la commande 
> java -jar target/janus-0.0.1-SNAPSHOT.jar

Pour configurer cela dans eclipse : run config -> java application -> main class = org.halx.janus.App && program arguments = java -jar target/janus-0.0.1-SNAPSHOT.jar

Pour la dockerisation :  
- Creer l'image docker en local:  
> docker build -t halx/janus . 
- La push sur le registry dockerhub :  
> docker tag halx/janus halx/janus  
> docker login (avoir acces au repo privé)   
> docker push halx/janus   
- Upload les sources necessaires (decrit dans le dockerfile, actuellement target/janus.java)   
- Utiliser docker-compose  pour run le docker-compose.yml:   
> docker-compose up -d
- Si on veut juste restart le container (dans le cadre d'un update du livrable)
> docker-compose restart

Pour debug, ou juste accéder au conteneur : 
> docker exec -it nomDuContainer /bin/bash (ou /bin/sh si c'est pas dispo) 

Accéder à janus.alexandrebarbez.com et Enjoy !
