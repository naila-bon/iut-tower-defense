# Rapport d'Exécution des Tests Unitaires - IUT Tower Defense

## Résumé Exécution

| Métrique | Valeur |
|----------|--------|
| **Tests Exécutés** | 33 |
| **Tests Réussis** | 33  |
| **Tests Échoués** | 0 |
| **Erreurs** | 0 |

---

## Détail par Module

### 1. **game.effect.EffectTest** → 3 tests 
- Création de SunSpot
- Création de StarDust
- Création d'effet avec coordonnées identiques

### 2. **game.enemy.AlienTest** → 3 tests 
- Création d'Alien
- Vérification de la position
- Avancement sur le chemin

### 3. **game.enemy.AsteroidTest** → 3 tests 
- Création d'Asteroid
- Vérification de la position
- Avancement sur le chemin

### 4. **game.enemy.CometTest** → 3 tests 
- Création de Comet
- Vérification de la position
- Avancement sur le chemin

### 5. **game.path.CoordinateTest** → 5 tests 
- Création d'une coordonnée
- Getter X
- Getter Y
- Méthode toString()
- Modification des coordonnées

### 6. **game.path.PathPointsTest** → 3 tests 
- Création d'un PathPoints
- Récupération de la position initiale
- Calcul de distance à un point du chemin

### 7. **game.tower.BlackHoleTest** → 3 tests 
- Création du BlackHole
- Vérification de la position initiale
- Modification de la position

### 8. **game.tower.SunTest** → 3 tests 
- Création du Sun
- Vérification de la position initiale
- Modification de la position

### 9. **game.tower.TowerTest** → 2 tests 
- Vérification de la position 
- Comparaison des portées différentes

### 10. **GameTest** → 5 tests 
- Ajout d'un kill
- Ajout de kills multiples
- Ajout de points
- Accumulation des scores
- Initialisation des vies

---

## Structure du Code

Tous les tests suivent le **pattern Given-When-Then** :

```java
@Test
void testExample() {
    // Given
    Coordinate coord = new Coordinate(100, 200);
    
    // When
    int x = coord.getX();
    
    // Then
    assertEquals(100, x);
}
```


## Commandes Exécution

```bash
# Exécuter tous les tests
mvn clean test

# Exécuter les tests sans recompiler
mvn test

# Exécuter une classe de test spécifique
mvn test -Dtest=GameTest

# Générer rapport détaillé
mvn surefire-report:report
```
