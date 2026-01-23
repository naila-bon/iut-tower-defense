# Tower Defense – TDD, BDD et Refactoring

**Auteur :** Naila Bon  
**Projet :** iut-tower-defense  
**Date :** Janvier 2025 

---

## 1. Introduction

Ce projet consiste en la reprise et l'amélioration d'un jeu de type Tower Defense existant. L'objectif principal était d'appliquer les bonnes pratiques de développement logiciel, afin d'améliorer la qualité, la maintenabilité et l'extensibilité du code.

---

## 2. Architecture du projet

### 2.1 Structure Maven

La première étape a consisté à migrer le projet vers une architecture Maven standard, permettant une meilleure organisation et une gestion automatisée des dépendances et des tests.

```
iut-tower-defense/
├── pom.xml
├── src/
│   ├── main/
│   │   ├── java/game/
│   │   │   ├── effect/        # Effets visuels et animations
│   │   │   ├── enemy/         # Classes des ennemis
│   │   │   ├── panel/         # Interface graphique
│   │   │   ├── path/          # Chemins des ennemis
│   │   │   ├── tower/         # Classes des tours
│   │   │   ├── util/          # Utilitaires (ImageLoader...)
│   │   │   └── Game.java      # Point d'entrée
│   │   └── resources/         # Images et ressources
│   └── test/
│       └── java/              # Tests unitaires
└── target/                    # Compilation Maven
```


### 2.2 Organisation modulaire

L'architecture repose sur une séparation claire des responsabilités :

- **Package `tower`** : contient toutes les classes de tours, chacune encapsulant sa logique de tir, portée et dégâts
- **Package `enemy`** : définit les différents types d'ennemis avec leurs caractéristiques (vie, vitesse, résistances)
- **Package `effect`** : gère les effets visuels (projectiles, explosions, animations)
- **Package `path`** : définit les chemins que suivent les ennemis
- **Package `panel`** : gère l'interface utilisateur et le rendu graphique
- **Package `util`** : classes utilitaires réutilisables (chargement d'images, constantes...)

Cette structure modulaire facilite grandement l'ajout de nouvelles fonctionnalités et la maintenance du code.

---

## 3. Démarche de développement et évolution du projet

### 3.1 Phase 1 : Initialisation Maven

**Problématique :** Le projet initial ne disposait pas d'une structure standardisée, rendant difficile la gestion des dépendances et l'exécution automatisée des tests.

**Solution adoptée :**
- Migration vers Maven avec création du fichier `pom.xml`
- Réorganisation des fichiers sources selon la convention Maven

**Avantages obtenus :**
- Build automatisé : `mvn clean package`
- Exécution simplifiée : `mvn exec:java`

### 3.2 Phase 2 : Mise en place des tests unitaires

Les tests ont été écrits **avant** les modifications du code, pour s'assurer de ne rien "casser" à l'ajout de fonction.

**Tests implémentés :**
- Tests des tours : validation des dégâts, portée, cadence de tir
- Tests des ennemis : vérification des points de vie, vitesse, comportement
- Tests d'interaction : simulation des combats tour vs ennemi
- Tests de régression : s'assurer que le code existant fonctionne toujours

**Exécution des tests :**
```bash
mvn test
```

### 3.3 Phase 3 : Ajout d'une nouvelle tour

L'ajout d'une nouvelle tour a commencé avec l'écriture des tests associés. Le fait de rajouter la tour après avoir écrit des tests a assurer d'avoir une nouvelle tour fonctionnelle avec une couverture de tests complète, intégrée sans casser le code existant.


### 3.4 Phase 4 : Refactoring de la logique d'interaction

Dans la version initiale, la logique d'interaction entre les tours et les ennemis était dispersée et dupliquée à plusieurs endroits du code. Cela posait plusieurs problèmes :
- Code dupliqué difficile à maintenir
- Risque d'incohérence entre les différentes tours
- Difficulté à ajouter de nouvelles mécaniques de jeu

**Solution de refactoring :**
La logique d'interaction a été centralisée dans la classe `Tower`. Chaque tour hérite maintenant d'une méthode commune pour gérer les interactions avec les ennemis.

**Validation :** Les tests unitaires existants ont permis de s'assurer qu'aucune régression n'a été introduite lors du refactoring.


---

**Ressources :**
- Dépôt GitHub : https://github.com/naila-bon/iut-tower-defense
- Projet de base : https://gitlab.com/ludopradel/iut-tower-defense
- Consignes : [Consigne.md](https://github.com/naila-bon/iut-tower-defense/blob/main/Consigne.md)
- Rapport de tests: [RAPPORT_TESTS.md](https://github.com/naila-bon/iut-tower-defense/blob/main/RAPPORT_TESTS.md)
