# Horizonite Extractor (Forge 1.20.1)

## Vereisten
- Java 17 (niet 21)
- ForgeGradle wrapper (meegeleverd)
- Blue Skies JAR in `libs/blue_skies-1.20.1-1.3.31.jar`

## Snelstart (Codespaces)
```bash
unzip horizonite-extractor-full.zip -d .
rm horizonite-extractor-full.zip
mkdir -p libs
# Upload hier je blue_skies-1.20.1-1.3.31.jar
chmod +x gradlew
./gradlew build
```
De jar staat in `build/libs/`.

## Hopper/Conveyor IO
- Boven: **input vullen**
- Zijkanten: **input extractie**
- Onder: **output extractie**

De oven erft logica + GUI van Blue Skies' Horizonite Forge.
