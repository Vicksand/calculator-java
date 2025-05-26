📊 Analiză Metrici și Revizuire Cod
✅ 1. LOC (Lines of Code)
Fișier	LOC
Calculator.java	148
Start.java	29
Total	177

Notă: Linie de cod = toate liniile semnificative, excluzând spații goale și comentarii.

✅ 2. Complexitate
🔧 Metoda evaluateExpression(String expression)
Complexitate ciclomatică: 10
Decizii: if (6), try-catch (1), for (2), return condiționat (1)

Complexitate cognitivă: 13

Ramificații multiple

Înălțimea de imbricare ridicată (nesting)

Cod greu de urmărit din cauza tratărilor manuale ale expresiilor și listelor

🔧 Metoda Calculate(List<Float>, List<String>)
Complexitate ciclomatică: 12
Multiple ramificații și recursivitate (6 x if, 1 x else, 4 x return)

Complexitate cognitivă: 16

Cod recursiv

Nivel ridicat de imbricare

Repetiție în tratamentul fiecărei operații

Fără separare clară a responsabilităților

✅ 3. Revizuire informală (Code Review)
Fișier	Linie	Observație
Calculator.java	4	Declarația import java.util.Scanner; apare greșit în interiorul clasei.
Calculator.java	7	Clasa Start ar trebui să fie într-un fișier separat Start.java.
Calculator.java	32	Denumirea metodei evaluatedExpression este greșită – ar trebui să fie evaluateExpression.
Calculator.java	40	Folosirea directă a 0 + expression este neclară – ar trebui explicată sau encapsulată.
Calculator.java	43-49	Se pot unifica verificările simbolurilor printr-o buclă sau mapare.
Calculator.java	64	Lipsă validare expresii incomplete (ex: 2+).
Calculator.java	73	Nu se tratează împărțirea la zero – poate duce la excepție sau NaN.
Calculator.java	82-145	Cod foarte duplicat; același tipar este repetat pentru toate operațiile.
Calculator.java	General	Metoda Calculate este recursivă, dar fără limită de adâncime – risc de StackOverflow.
Calculator.java	General	Nu există teste unitare – greu de validat corectitudinea.
Calculator.java	General	Nu se respectă principiul SRP (Single Responsibility Principle).

✅ 4. Recomandări de îmbunătățire
Separă clasele în fișiere diferite (Start, Calculator, Operations)

Refactorizează metoda Calculate pentru a elimina recursivitatea și duplicarea codului

Adaugă validări suplimentare (expresii invalide, împărțire la zero)

Adaugă teste unitare (folosește JUnit)

Utilizează un parser matematic dedicat în loc de parsare manuală

Respectă principiile OOP pentru modularitate și mentenabilitate

Adaugă Javadoc pentru metodele publice

