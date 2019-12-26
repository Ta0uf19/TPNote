### Dépendances

* _H2 Database_ : un système de gestion de base de données relationnelle chargé en mémoire

* _Spring_ : Spring est un framwork J2EE MVC

* _JPA_ : Java Persistance API est une interface de programmation permettent d'organiser les données relationnales avec des annotations

* Thymeleaf : Moteur de template

* Hibernate : Permet une connexion et une relation avec la bdd plus facilement

* DevTools : offre des outils en plus pour le developpement

__________________
Sprint Boot va utiliser notre base de donnée H2 comme une base de donnée principale
en rajoutant ça dans les propriétés de l'application
Création d'une table par l'API JPA, lorsqu'on a rajouter le model Address

A QUOI SERT @Autowired?

Injection des dépendances


	
Etape 13 

	Q1 @GetMapping("/greeting")
	
	Q2 return "greeting";
	
	Q3 @RequestParam(name="nameGET", required=false, defaultValue="World")
	
Etape 17

	La table adresse a été créé
	
Etape 18

	Hibernate permet grâce aux annotations d'acceder a la base de donnée et vue que la table n'éxistait pas il l'a créée
	
Etape 20

	Oui on voit tous le contenus de la table adresse ajouté dans le fichier Data.sql
	
Etape 23

	C’est une annotation qui nous permet de faire l’injection de dépendances entre les beans de l’application
	
Etape 30 

 	ajout de dépendance :
 	<dependency>
	    <groupId>org.webjars</groupId>
	   	<artifactId>bootstrap</artifactId>
		<version>3.3.6</version>
	</dependency>

	<dependency>
	    <groupId>org.webjars</groupId>
	    <artifactId>bootstrap-datepicker</artifactId>
	    <version>1.0.1</version>
	</dependency>

	<dependency>
	    <groupId>org.webjars</groupId>
	    <artifactId>jquery</artifactId>
	    <version>1.9.1</version>
	</dependency>
	
Etape 6 P2
	
	Oui pour l'api Darksky il faut une clé
	
	https://api.darksky.net/forecast/clé/lat,lon
	
	Il faut utiliser un GET
	
	https://api.darksky.net/forecast/clé/lat,lon?option=val
	
	temperature	55.62
	
	dans le daily
	

Lien github

https://github.com/ta0uf19/TPnote