# Mizu Nexus
*Android TV 11 Launcher & Cloud OS Gateway*

Mizu Nexus es el launcher oficial que transforma cualquier Android TV 11 (API 30) en una puerta de entrada al **Mizu Cloud OS**: un sistema operativo 100 % web que arranca en segundos, funciona sin conexi�n tras la primera carga y se controla solo con el mando a distancia.

| Caracter�sticas clave |
|-----------------------|
| ? **Launcher nativo** Kotlin + Jetpack Leanback  |
| ? **WebView 118** con Service Worker para PWA offline  |
| ? **Navegaci�n TV-first** (D-pad, OK, Back)  |
| ? **Sin hardware nueva** � pensado para pr�ximos 5-10 a�os  |
| ? **Repositorio abierto** � AGPL-3.0 License  |

## ?? Primer arranque
1. Instala \pp-debug.apk\ en tu Android TV 11.  
2. Al abrir Nexus se lanza autom�ticamente el **Mizu Cloud OS** (PWA).  
3. Despu�s del primer load todo queda cacheado; funciona incluso sin red.

## ??? Desarrollo
\\\ash
# clonar y ejecutar
git clone https://github.com/mizulegendsstudios/mizu_nexus.git
./gradlew assembleDebug
\\\

## ?? Stack
- **minSdk 30** | **targetSdk 34**  
- **WebView** + **Service Worker**  
- **Vector drawables** y **Leanback** para TV

## ??? Roadmap
- [ ] Integraci�n Widevine L1 para streaming 4 K  
- [ ] Tema din�mico seg�n wallpaper  
- [ ] OTA dentro del Cloud OS  

> Built with ?? by [Mizu Legends Studios](https://github.com/mizulegendsstudios)

