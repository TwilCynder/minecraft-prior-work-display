all:
	./gradlew build
	cp ./build/libs/testmod-1.0.jar ~/AppData/Roaming/.minecraft/mods/
