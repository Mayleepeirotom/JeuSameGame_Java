### VARIABLES ###

JC = javac
JCFLAGS = -encoding UTF-8 -implicit:none

JVM = java
JVMFLAGS = 

### REGLES ESSENTIELLES ###

Main.class : Main.java AccueilSameGame.class
	${JC} ${JCFLAGS} Main.java

AccueilSameGame.class : AccueilSameGame.java FenetreDeBase.class BoutonSamegame.class BoutonAleatoire.class BoutonChoix.class BoutonQuitterFin.class BoutonRejouerFin.class ChargerGrilleDepuisFichier.class LancerJeuAleatoire.class
	${JC} ${JCFLAGS} AccueilSameGame.java

SameGame.class : SameGame.java Grille.class InitGame.class
	${JC} ${JCFLAGS} SameGame.java

FenetreDeBase.class : FenetreDeBase.java ComposantFond.class
	${JC} ${JCFLAGS} FenetreDeBase.java

FenetreFinDePartie.class : FenetreFinDePartie.java FenetreDeBase.class SuperpositionFinDePartie.class
	${JC} ${JCFLAGS} FenetreFinDePartie.java

ComposantFond.class : ComposantFond.java
	${JC} ${JCFLAGS} ComposantFond.java

BoutonSamegame.class : BoutonSamegame.java
	${JC} ${JCFLAGS} BoutonSamegame.java

BoutonAleatoire.class : BoutonAleatoire.java
	${JC} ${JCFLAGS} BoutonAleatoire.java

BoutonChoix.class : BoutonChoix.java
	${JC} ${JCFLAGS} BoutonChoix.java

BoutonQuitterFin.class : BoutonQuitterFin.java
	${JC} ${JCFLAGS} BoutonQuitterFin.java

BoutonRejouerFin.class : BoutonRejouerFin.java
	${JC} ${JCFLAGS} BoutonRejouerFin.java

ChargerGrilleDepuisFichier.class : ChargerGrilleDepuisFichier.java LireGrilleDepuisFichier.class
	${JC} ${JCFLAGS} ChargerGrilleDepuisFichier.java

LireGrilleDepuisFichier.class : LireGrilleDepuisFichier.java SetBloc.class Grille.class
	${JC} ${JCFLAGS} LireGrilleDepuisFichier.java

LancerJeuAleatoire.class : LancerJeuAleatoire.java GenererGrilleAleatoire.class
	${JC} ${JCFLAGS} LancerJeuAleatoire.java

GenererGrilleAleatoire.class : GenererGrilleAleatoire.java SetBloc.class Grille.class
	${JC} ${JCFLAGS} GenererGrilleAleatoire.java

SetBloc.class : SetBloc.java Grille.class
	${JC} ${JCFLAGS} SetBloc.java

Grille.class : Grille.java
	${JC} ${JCFLAGS} Grille.java

BaseScorePanel.class : BaseScorePanel.java
	${JC} ${JCFLAGS} BaseScorePanel.java

ScorePanel.class : ScorePanel.java BaseScorePanel.class
	${JC} ${JCFLAGS} ScorePanel.java

InitGame.class : InitGame.java AccueilSameGame.class ScorePanel.class InitGrille.class Grille.class
	${JC} ${JCFLAGS} InitGame.java

InitGrille.class : InitGrille.java Grille.class ScorePanel.class SurvolerBloc.class
	${JC} ${JCFLAGS} InitGrille.java

SurvolerBloc.class : SurvolerBloc.java Grille.class SurvolerGroupe.class
	${JC} ${JCFLAGS} SurvolerBloc.java

SurvolerGroupe.class : SurvolerGroupe.java Grille.class
	${JC} ${JCFLAGS} SurvolerGroupe.java

TailleGroupe.class : TailleGroupe.java Grille.class
	${JC} ${JCFLAGS} TailleGroupe.java

EstGroupeValide.class : EstGroupeValide.java Grille.class
	${JC} ${JCFLAGS} EstGroupeValide.java

SupprimerGroupe.class : SupprimerGroupe.java Grille.class SetBloc.class
	${JC} ${JCFLAGS} SupprimerGroupe.java

SupprimerBloc.class : SupprimerBloc.java SetBloc.class
	${JC} ${JCFLAGS} SupprimerBloc.java

DetecterEtSupprimerGroupe.class : DetecterEtSupprimerGroupe.java Grille.class
	${JC} ${JCFLAGS} DetecterEtSupprimerGroupe.java

SuperpositionFinDePartie.class : SuperpositionFinDePartie.java
	${JC} ${JCFLAGS} SuperpositionFinDePartie.java

RaffraichirGrille.class : RaffraichirGrille.java Grille.class SurvolerBloc.class GetCouleur.class
	${JC} ${JCFLAGS} RaffraichirGrille.java

FinDePartie.class : FinDePartie.java Grille.class
	${JC} ${JCFLAGS} FinDePartie.java

FaireTomberLesBlocs.class : FaireTomberLesBlocs.java Grille.class DeplacerBloc.class
	${JC} ${JCFLAGS} FaireTomberLesBlocs.java

DeplacerBloc.class : DeplacerBloc.java SetBloc.class Grille.class
	${JC} ${JCFLAGS} DeplacerBloc.java

DecalerColonnes.class : DecalerColonnes.java Grille.class DeplacerBloc.class SupprimerBloc.class
	${JC} ${JCFLAGS} DecalerColonnes.java

GetCouleur.class : GetCouleur.java
	${JC} ${JCFLAGS} GetCouleur.java

AfficherFinDePartie.class : AfficherFinDePartie.java
	${JC} ${JCFLAGS} AfficherFinDePartie.java

PanneauBoutonsFinDePartie.class : PanneauBoutonsFinDePartie.java BoutonSamegame.class
	${JC} ${JCFLAGS} PanneauBoutonsFinDePartie.java

GrilleBoutonController.class : GrilleBoutonController.java Grille.class ScorePanel.class BoutonSamegame.class
	${JC} ${JCFLAGS} GrilleBoutonController.java

### REGLES OPTIONNELLES ###

run : Main.class
	${JVM} ${JVMFLAGS} Main

clean :
	-rm -f *.class

mrproper : clean Main.class

### BUTS FACTICES ###

.PHONY : run clean mrproper
