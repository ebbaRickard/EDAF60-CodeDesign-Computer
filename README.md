# EDAF60 project
## Preparatory questions
**1. Det finns ett antal klasser och gränssnitt i programkoden ovan och det behövs ytterligare några för att kunna implementera programmet. Vilka klasser saknas och vilka är gränssnitt respektive klasser?**

Se UML-diagram

**2. Klassen Program har till synes metoden add för att lägga till en instruktion till programmet. Vilken standardklass skulle man kunna utvidga för att slippa implementera metoden själv? Är det lämpligt att göra så?**

Arraylist, det är inte lämpligt eftersom vi isåfall måste implementera alla metoder i superklassen.

**3. Klasserna skall fördelas på minst två paket. Vilka paket bör finnas och hur fördelas klasserna? (Under föreläsning 7 kommer vi att prata mer om paketindelning, men fundera gärna redan nu igenom vilka klasser som ‘hör ihop’ i detta projekt).**

Allting med Word ligger i ett package, och resten ligger i ett annat package.

**4. Studera designmönstret Command. Var och hur bör det användas i uppgiften.**

De olika instruktionerna (Add, Mul etc) är commands som implementerar interfacet Instruction.

**5. Studera designmönstret Template method. Mönstret skall användas för att undvika duplicerad kod i likartade klasser. Var kan detta bli aktuellt?**

De olika fabrikerna (ByteWordFactory etc) ärver från en abstract klass WordFactory. På samma sätt ärver de
olika typerna av Word från en abstrakt klass Word. Det kan också användas för våra instruktioner, tex genom att
introducera en BinaryOp klass.

**6. Hur kan vi hantera olika slags ord på ett enhetligt sätt? Vi skall bara hantera en slags ord åt gången, men vill inte ha några restriktioner för vilken slags ord vi vill kunna hantera.**

Genom att ärva från en abstrakt Word klass.

**7. När man exekverar Add-instruktionen i exemplen ovan skall man utföra en addition av två tal. I vilken klass skall den faktiska additionen utföras?**

I Word klassen

**8. Vad bör hända om någon gör följande felaktiga anrop?**
run("factorial(5) med olika slags ord", new Factorial("5", lwf), bwf);


Vi returnerar ett felmeddelande när programmet laddas (eller körs).