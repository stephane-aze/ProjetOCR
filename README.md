# OCR

## Informations du projet
Projet r�alis� en kotlin (avec gradle), assurez-vous que votre environnement soit compatible avec ce projet.
Avec un fichier principal app.kt qui se base sur le fichier OCR.txt � la racine du projet.
Quelques tests ont �t� r�alis� en JUnit.Pour les tests il y a un fichier OCR-test.txt.
## Remarques || Reflexion
J'ai d�cid� de cr�er des tables pour qu'ils correspondent au contexte(exemple: entr�e du fichier, figure d'un nombre).
J'ai aussi s�par� en plusieurs fichiers comme kotlin est un peu diff�rent du java, o� j'ai nomm� un fichier app.kt qui est le fichier principal avec son main et aussi un fichier parameters.kt qui contient quelques param�tres tel qu'une map.
J'ai choisi de faire une map avec comme cl� figure et value int.


## User Story 1 [X]
 

```
    _  _     _  _  _  _  _ 
  | _| _||_||_ |_   ||_||_|
  ||_  _|  | _||_|  ||_| _|
  
```
qui donne comme r�sultat: "123456789" 


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