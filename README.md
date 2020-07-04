# OCR

## Informations du projet
Projet réalisé en kotlin (avec gradle), assurez-vous que votre environnement soit compatible avec ce projet.
Avec un fichier principal app.kt qui se base sur le fichier OCR.txt à la racine du projet.
Quelques tests ont été réalisé en JUnit.Pour les tests il y a un fichier OCR-test.txt.
## Remarques || Reflexion
J'ai décidé de créer des tables pour qu'ils correspondent au contexte(exemple: entrée du fichier, figure d'un nombre).
J'ai aussi séparé en plusieurs fichiers comme kotlin est un peu différent du java, où j'ai nommé un fichier app.kt qui est le fichier principal avec son main et aussi un fichier parameters.kt qui contient quelques paramètres tel qu'une map.
J'ai choisi de faire une map avec comme clé figure et value int.


## User Story 1 [X]
 

```
    _  _     _  _  _  _  _ 
  | _| _||_||_ |_   ||_||_|
  ||_  _|  | _||_|  ||_| _|
  
```
qui donne comme résultat: "123456789" 


## User Story 2 [X]


calcul du checksum :  
((1*p1) + (2*p2) + (3*p3) + ... + (9*p9)) mod 11 == 0  


## User Story 3 [X]
	
  
457508000  
664371495 ERR  


## User Story 4 [X]


```
    _  _     _  _  _  _  _ 
  | _|  |  | _||_   ||_|| |
  ||_  _|  | _||_|  ||_| _|
  
```

457508000    
664371495 ERR   
12?13678? ILL  