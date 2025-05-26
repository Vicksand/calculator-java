 Analiză Metrici și Revizuire Cod

### 1. LOC (Lines of Code)
Total LOC: **276**  
(Suma tuturor fișierelor `.java` din proiect)

---

### 2. Complexitate

#### evaluatedExpression
- Complexitate ciclomatică: **10**
- Complexitate cognitivă: **13**
- Observație: Metodă prea lungă și aglomerată; conține multe ramificații și operații fără modularizare.

#### Calculate
- Complexitate ciclomatică: **6**
- Complexitate cognitivă: **9**
- Observație: Codul include multe `if` și `else`, ceea ce reduce lizibilitatea. Poate fi împărțit în metode mai mici.

---

### 3. Revizuire informală (Code Review)

| Fișier | Linie | Observație |
|--------|-------|------------|
| Calculator.java | 15 | Numele metodei `evaluatedExpression` este greșit gramatical – ar trebui să fie `evaluateExpression`. |
| Calculator.java | 26 | Cod duplicat la verificarea operatorilor. Se poate extrage într-o metodă separată. |
| Calculator.java | 38 | Lipsă tratare excepții. Dacă expresia e invalidă, aplicația poate crăpa. |
| Calculator.java | 46 | Folosirea excesivă a `if-else` reduce lizibilitatea. Se recomandă `switch` sau strategii OOP. |
| Calculator.java | 67 | Lipsă validare pentru împărțirea la zero. |
| Calculator.java | General | Codul nu are teste unitare sau clase de test, ceea ce reduce testabilitatea și mentenabilitatea. |

---

### 4. Concluzii

- Codul funcționează, dar este lipsit de modularitate și testabilitate.
- Este recomandat să se refactorizeze metodele lungi și să se adauge teste unitare.
- Respectarea principiului SRP (Single Responsibility Principle) ar îmbunătăți mult claritatea codului.

