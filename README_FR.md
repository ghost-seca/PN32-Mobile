# PN532 Mobile — prototype Android

Projet source initial pour préparer une application Android de diagnostic d'un lecteur PN532 relié en USB OTG via un adaptateur USB-série CP2102.

## État actuel
Cette archive est un squelette de projet Android et une première base de compilation. Elle ne constitue pas encore une application NFC complète : la détection USB, l'initialisation UART du PN532, la lecture des cartes et les fonctions MIFARE/NTAG restent à développer et à tester sur le matériel réel.

## Matériel visé
- Téléphone Android avec USB OTG
- Adaptateur USB-série CP2102 (VID `10C4`, PID `EA60`)
- Module PN532 configuré en UART/HSU
- Liaison TX/RX croisée et masse commune

## Compilation
Le workflow GitHub Actions `.github/workflows/build-apk.yml` permet de lancer une compilation de diagnostic depuis l'onglet Actions du dépôt.

## Précautions
Vérifier la tension logique du module et de l'adaptateur. Ne pas appliquer 5 V sur une entrée logique 3,3 V.
