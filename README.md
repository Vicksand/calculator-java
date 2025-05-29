

## 📊 Analiză Metrici și Revizuire Cod

### ✅ 1. LOC (Lines of Code)

| Fișier         | LOC  |
|----------------|------|
| Calculator.java | 134  |
| Start.java      | 19   |
| **Total**       | **153** |

*Notă: Linie de cod fara License(este un text)cu o sa fie total 170*

---

### ✅ 2. Complexitate

####  Metoda `evaluateExpression(String expression)`
- **Complexitate ciclomatică**: `6`  
- **Complexitate cognitivă**: `12`  
- Observație: Metodă lungă, aglomerată cu verificări multiple și conversii; poate fi împărțită în funcții auxiliare.

####  Metoda `Calculate(List<Float>, List<String>)`
- **Complexitate ciclomatică**: `10`  
- **Complexitate cognitivă**: `17`  
- Observație: Recursivitate profundă, multe ramificații, cod duplicat pentru fiecare operator.

---

### ✅ 3. Revizuire informală (Code Review)

| Fișier         | Linie | Observație                                                                 |
|----------------|-------|----------------------------------------------------------------------------|
| Calculator.java | 11    |  Importul Scanner este greșit poziționat (apărea în versiunea anterioară).|
| Calculator.java | 28    | Separarea simbolurilor matematice este bine realizată în clasa Operations.|
| Calculator.java | 34-47 | Cod repetitiv pentru identificarea operatorilor; poate fi extras într-o metodă utilitară. |
| Calculator.java | 72    |  Returnarea mesajului "ERROR" este prea generic. |
| Calculator.java | 76-134 | Metodă recursivă complexă, greu de întreținut. Recomand refactorizare într-un algoritm  iterativ.|
| Start.java       | 9   |Se creează un nou Scanner în fiecare iterație – neeficient.                  |
| Start.java       | 18 |Lipsă validare pentru expresii invalide (ex: litere, simboluri nepermise).   |

---





---


