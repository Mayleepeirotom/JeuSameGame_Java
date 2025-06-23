### VARIABLES ###

JC       = javac
JCFLAGS  = -encoding UTF-8 -implicit:none

JVM      = java
JVMFLAGS = 

### CIBLE PAR DÉFAUT ###

.PHONY: all
all: Main.class AccueilSameGame.class SameGame.class InitGame.class InitGrille.class \
     Grille.class SetBloc.class DeplacerBloc.class SupprimerBloc.class TailleGroupe.class \
     SurvolerGroupe.class SurvolerBloc.class EstGroupeValide.class SupprimerGroupe.class \
     DetecterEtSupprimerGroupe.class FaireTomberLesBlocs.class DecalerColonnes.class \
     FinDePartie.class BaseScorePanel.class ScorePanel.class FenetreDeBase.class \
     ComposantFond.class PanneauBoutonsFinDePartie.class BoutonSamegame.class \
     BoutonAleatoire.class BoutonChoix.class BoutonQuitterFin.class BoutonRejouerFin.class \
     ChargerGrilleDepuisFichier.class LireGrilleDepuisFichier.class \
     GenererGrilleAleatoire.class LancerJeuAleatoire.class \
     SuperpositionFinDePartie.class AfficherFinDePartie.class \
     RaffraichirGrille.class GetCouleur.class GrilleBoutonController.class

### RÈGLES ESSENTIELLES ###

Main.class : Main.java AccueilSameGame.class
	$(JC) $(JCFLAGS) Main.java

AccueilSameGame.class : AccueilSameGame.java FenetreDeBase.class \
                       BoutonSamegame.class BoutonAleatoire.class \
                       BoutonChoix.class BoutonRejouerFin.class \
                       BoutonQuitterFin.class ChargerGrilleDepuisFichier.class \
                       LancerJeuAleatoire.class
	$(JC) $(JCFLAGS) AccueilSameGame.java

SameGame.class : SameGame.java InitGame.class Grille.class
	$(JC) $(JCFLAGS) SameGame.java

InitGame.class : InitGame.java FenetreDeBase.class InitGrille.class ScorePanel.class
	$(JC) $(JCFLAGS) InitGame.java

InitGrille.class : InitGrille.java Grille.class ScorePanel.class \
                   SurvolerBloc.class RaffraichirGrille.class \
                   GrilleBoutonController.class
	$(JC) $(JCFLAGS) InitGrille.java

Grille.class : Grille.java
	$(JC) $(JCFLAGS) Grille.java

SetBloc.class : SetBloc.java Grille.class
	$(JC) $(JCFLAGS) SetBloc.java

DeplacerBloc.class : DeplacerBloc.java Grille.class SetBloc.class
	$(JC) $(JCFLAGS) DeplacerBloc.java

SupprimerBloc.class : SupprimerBloc.java SetBloc.class
	$(JC) $(JCFLAGS) SupprimerBloc.java

### LOGIQUE DES GROUPES ###

TailleGroupe.class : TailleGroupe.java Grille.class
	$(JC) $(JCFLAGS) TailleGroupe.java

SurvolerGroupe.class : SurvolerGroupe.java Grille.class
	$(JC) $(JCFLAGS) SurvolerGroupe.java

SurvolerBloc.class : SurvolerBloc.java Grille.class SurvolerGroupe.class
	$(JC) $(JCFLAGS) SurvolerBloc.java

EstGroupeValide.class : EstGroupeValide.java Grille.class TailleGroupe.class
	$(JC) $(JCFLAGS) EstGroupeValide.java

SupprimerGroupe.class : SupprimerGroupe.java Grille.class SetBloc.class
	$(JC) $(JCFLAGS) SupprimerGroupe.java

DetecterEtSupprimerGroupe.class : DetecterEtSupprimerGroupe.java \
                                  Grille.class SupprimerGroupe.class \
                                  FaireTomberLesBlocs.class DecalerColonnes.class
	$(JC) $(JCFLAGS) DetecterEtSupprimerGroupe.java

FaireTomberLesBlocs.class : FaireTomberLesBlocs.java Grille.class DeplacerBloc.class
	$(JC) $(JCFLAGS) FaireTomberLesBlocs.java

DecalerColonnes.class : DecalerColonnes.java Grille.class DeplacerBloc.class \
                       SupprimerBloc.class
	$(JC) $(JCFLAGS) DecalerColonnes.java

FinDePartie.class : FinDePartie.java Grille.class TailleGroupe.class
	$(JC) $(JCFLAGS) FinDePartie.java

### SCORE ET UI ###

BaseScorePanel.class : BaseScorePanel.java
	$(JC) $(JCFLAGS) BaseScorePanel.java

ScorePanel.class : ScorePanel.java BaseScorePanel.class
	$(JC) $(JCFLAGS) ScorePanel.java

FenetreDeBase.class : FenetreDeBase.java ComposantFond.class
	$(JC) $(JCFLAGS) FenetreDeBase.java

ComposantFond.class : ComposantFond.java
	$(JC) $(JCFLAGS) ComposantFond.java

PanneauBoutonsFinDePartie.class : PanneauBoutonsFinDePartie.java \
                                  BoutonRejouerFin.class BoutonQuitterFin.class \
                                  BoutonSamegame.class
	$(JC) $(JCFLAGS) PanneauBoutonsFinDePartie.java

BoutonSamegame.class : BoutonSamegame.java
	$(JC) $(JCFLAGS) BoutonSamegame.java

BoutonAleatoire.class : BoutonAleatoire.java BoutonSamegame.class \
                        LancerJeuAleatoire.class
	$(JC) $(JCFLAGS) BoutonAleatoire.java

BoutonChoix.class : BoutonChoix.java BoutonSamegame.class \
                    ChargerGrilleDepuisFichier.class
	$(JC) $(JCFLAGS) BoutonChoix.java

BoutonRejouerFin.class : BoutonRejouerFin.java BoutonSamegame.class
	$(JC) $(JCFLAGS) BoutonRejouerFin.java

BoutonQuitterFin.class : BoutonQuitterFin.java BoutonSamegame.class
	$(JC) $(JCFLAGS) BoutonQuitterFin.java

### CHARGEMENT ET GÉNÉRATION DE GRILLE ###

LireGrilleDepuisFichier.class : LireGrilleDepuisFichier.java \
                                Grille.class SetBloc.class
	$(JC) $(JCFLAGS) LireGrilleDepuisFichier.java

ChargerGrilleDepuisFichier.class : ChargerGrilleDepuisFichier.java \
                                   LireGrilleDepuisFichier.class SameGame.class
	$(JC) $(JCFLAGS) ChargerGrilleDepuisFichier.java

GenererGrilleAleatoire.class : GenererGrilleAleatoire.java \
                              Grille.class SetBloc.class
	$(JC) $(JCFLAGS) GenererGrilleAleatoire.java

LancerJeuAleatoire.class : LancerJeuAleatoire.java GenererGrilleAleatoire.class
	$(JC) $(JCFLAGS) LancerJeuAleatoire.java

### FIN DE PARTIE ###

SuperpositionFinDePartie.class : SuperpositionFinDePartie.java \
                                 PanneauBoutonsFinDePartie.class ComposantFond.class
	$(JC) $(JCFLAGS) SuperpositionFinDePartie.java

AfficherFinDePartie.class : AfficherFinDePartie.java SuperpositionFinDePartie.class
	$(JC) $(JCFLAGS) AfficherFinDePartie.java

### RAFRAICHISSEMENT ###

RaffraichirGrille.class : RaffraichirGrille.java Grille.class SurvolerBloc.class GetCouleur.class
	$(JC) $(JCFLAGS) RaffraichirGrille.java

GetCouleur.class : GetCouleur.java
	$(JC) $(JCFLAGS) GetCouleur.java

GrilleBoutonController.class : GrilleBoutonController.java Grille.class \
                               ScorePanel.class RaffraichirGrille.class \
                               EstGroupeValide.class DetecterEtSupprimerGroupe.class \
                               FaireTomberLesBlocs.class DecalerColonnes.class \
                               SurvolerBloc.class AfficherFinDePartie.class
	$(JC) $(JCFLAGS) GrilleBoutonController.java

### RÈGLES OPTIONNELLES ###

.PHONY: run clean mrproper
run : all
	$(JVM) $(JVMFLAGS) Main

clean :
	-rm -f *.class

mrproper : clean
	-rm -f doc/*

### FIN ###
