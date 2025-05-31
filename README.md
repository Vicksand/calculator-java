

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













## 📊 Analiză Metrici și Revizuire Cod
Pentru determinarea indicilor LOC cat si a complexitatii ciclomatica şi cognitive am utilizat 2 instrumente:
- CLOC.
- PMD

### ✅ 1. LOC (Lines of Code)
C:\Users\user\Desktop\Clon\New folder\calculator-java>cloc .
       3 text files.
       2 unique files.
       2 files ignored.

github.com/AlDanial/cloc v 2.04  T=0.04 s (46.7 files/s, 4996.5 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             2             61              5            148
-------------------------------------------------------------------------------
SUM:                             2             61              5            148
-------------------------------------------------------------------------------

Am utilizat instrumental CLOC pentru calcularea indicilor LOC, executand command cloc . in directoriul proiectului.


### ✅ 2. Complexitate

####  Metoda `evaluateExpression(String expression)`
- **Complexitate ciclomatică**: `12`  
- **Complexitate cognitivă**: `15`  
- Observație: Metodă lungă, aglomerată cu verificări multiple și conversii; poate fi împărțită în funcții auxiliare.

####  Metoda `Calculate(List<Float>, List<String>)`
- **Complexitate ciclomatică**: `12`  
- **Complexitate cognitivă**: `23`  
- Observație: Recursivitate profundă, multe ramificații, cod duplicat pentru fiecare operator.


C:\Users\user\Desktop\Clon\New folder\calculator-java>pmd check -d . -R complexity-rules.xml -f text
[WARN] Warning at complexity-rules.xml:5:3
 3|   <description>Custom ruleset for complexity analysis</description>
 4|   <rule ref="category/java/design.xml">
 5|   <properties>
      ^^^^^^^^^^^ Unexpected element 'properties' in rule, expecting one of 'exclude', 'priority', this will be ignored
 6|     <property name="reportLevel" value="10"/>
 7|   </properties>
[WARN] Progressbar rendering conflicts with reporting to STDOUT. No progressbar will be shown. Try running with argument -r <file> to output the report to a file instead.
[WARN] Removed misconfigured rule: LoosePackageCoupling cause: No packages or classes specified
[WARN] This analysis could be faster, please consider using Incremental Analysis: https://docs.pmd-code.org/pmd-doc-7.13.0/pmd_userdocs_incremental_analysis.html
.\Calculator.java:4:    UseUtilityClass:        This utility class has a non-private constructor
.\Calculator.java:6:    MutableStaticState:     Do not use non-final non-private static fields
.\Calculator.java:8:    ClassWithOnlyPrivateConstructorsShouldBeFinal:  This class has only private constructors and may be final
.\Calculator.java:28:   CognitiveComplexity:    The method 'evaluateExpression(String)' has a cognitive complexity of 15, current threshold is 15
.\Calculator.java:28:   CyclomaticComplexity:   The method 'evaluateExpression(String)' has a cyclomatic complexity of 12.
.\Calculator.java:63:   AvoidCatchingGenericException:  Avoid catching generic exceptions such as NullPointerException, RuntimeException, Exception in try-catch block
.\Calculator.java:74:   NcssCount:      The method 'Calculate(List<Float>, List<String>)' has a NCSS line count of 67.
.\Calculator.java:74:   CognitiveComplexity:    The method 'Calculate(List<Float>, List<String>)' has a cognitive complexity of 23, current threshold is 15
.\Calculator.java:74:   CyclomaticComplexity:   The method 'Calculate(List<Float>, List<String>)' has a cyclomatic complexity of 12.
.\Calculator.java:74:   NPathComplexity:        The method 'Calculate(List<Float>, List<String>)' has an NPath complexity of 512, current threshold is 200
.\Start.java:3: UseUtilityClass:        This utility class has a non-private constructor
LoosePackageCoupling    -       No packages or classes specified

---

### ✅ 3. Revizuire informală (Code Review)
Ca urmarea a revizuirii codului utilizand checkstyle am depistat urmatoarele probleme:

| Fișier         | Linie | Observație                                                                 |
|----------------|-------|----------------------------------------------------------------------------|
| Calculator.java | 19    |  Linia de cod are o lungime mai mare de 80.|
| Calculator.java | 74    |  Linia de cod are o lungime mai mare de 80.|
| Calculator.java | 83    |  Linia de cod are o lungime mai mare de 80.|
| Calculator.java | 84    |  Linia de cod are o lungime mai mare de 80.|
| Calculator.java | 88    |  Linia de cod are o lungime mai mare de 80.|
| Calculator.java | 98    |  Linia de cod are o lungime mai mare de 80.|
| Calculator.java | 28    | Separarea simbolurilor matematice este bine realizată în clasa Operations.|
| Calculator.java | 34-47 | Cod repetitiv pentru identificarea operatorilor; poate fi extras într-o metodă utilitară. |
| Calculator.java | 72    |  Returnarea mesajului "ERROR" este prea generic. |
| Calculator.java | 76-134 | Metodă recursivă complexă, greu de întreținut. Recomand refactorizare într-un algoritm  iterativ.|

| Start.java       | 9   |Se creează un nou Scanner în fiecare iterație – neeficient.                  |
| Start.java       | 18 |Lipsă validare pentru expresii invalide (ex: litere, simboluri nepermise).   |

---





---



