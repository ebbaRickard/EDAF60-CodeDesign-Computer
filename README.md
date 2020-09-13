# EDAF60 project

1. Se UML-diagram
2. Arraylist, det är inte lämpligt eftersom vi isåfall måste implementera alla metoder i superklassen.
3. Allting med Word ligger i ett package, och resten ligger i ett annat package.
4. De olika instruktionerna (Add, Mul etc) är commands som implementerar interfacet Instruction.
5. De olika fabrikerna (ByteWordFactory etc) ärver från en abstract klass WordFactory. På samma sätt ärver de
olika typerna av Word från en abstrakt klass Word. Det kan också användas för våra instruktioner, tex genom att
introducera en BinaryOp klass.
6. Genom att ärva från en abstrakt Word klass.
7. I Word klassen
8. Vi returnerar ett felmeddelande när programmet laddas (eller körs).