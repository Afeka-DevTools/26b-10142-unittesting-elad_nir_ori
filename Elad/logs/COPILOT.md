# COPILOT - תיעוד סיוע LLM לכתיבת הבדיקות

## כלי

ChatGPT ו-Codex

## קישור לשיחת ChatGPT

https://chatgpt.com/share/6a3d3dbb-53f0-83eb-83df-2adb7436892e

## מטרת השיחה

לקבל הצעה למבנה בדיקות עבור `App.java`, להבין אילו מקרי בדיקה חשובים לכל מתודה, ולוודא שימוש נכון ב-Assertions של JUnit 5.

## הפרומפט שנשלח

```text
ענה בעברית בלבד.
אני עובד על תרגיל Java Gradle של בדיקות יחידה. בקובץ App.java יש מחלקה org.example.App עם המתודות הסטטיות הבאות:
- add(int a, int b)
- isPrime(int n)
- reverse(String s)
- factorial(int n), שזורקת IllegalArgumentException עבור מספר שלילי
- isPalindrome(String s), שמתעלמת מרווחים, סימני פיסוק ואותיות גדולות/קטנות
- fibonacciUpTo(int n), שזורקת IllegalArgumentException עבור מספר שלילי
- charFrequency(String input)
- isAnagram(String s1, String s2), שמתעלמת מרווחים ואותיות גדולות/קטנות
- average(int[] arr), שזורקת IllegalArgumentException עבור מערך ריק
- filterEvens(List<Integer> list)
- mostCommonWord(String text)

אני צריך לכתוב AppTest.java עם JUnit 5, להשתמש ב-assertEquals, assertTrue, assertFalse ו-assertThrows, ולכסות לכל פונקציה מקרה תקין, מקרי גבול וחריגות כאשר רלוונטי.
הצע לי מבנה בדיקות מלא, הסבר למה כל קבוצת בדיקות חשובה, והוסף דוגמאות קוד קצרות שמתאימות לקובץ AppTest.java.
```

## החלטות בדיקה

לאחר בדיקת `App.java`, נכתבו בדיקות לכל המתודות הציבוריות. ההחלטות המרכזיות:

- עבור `add` נבדקו מספרים חיוביים, שליליים ואפס.
- עבור `isPrime` נבדקו ערכים מתחת ל-2, מספרים ראשוניים, מספרים פריקים וריבוע של מספר ראשוני.
- עבור `reverse` נבדקו מחרוזת רגילה, מחרוזת ריקה ותו יחיד.
- עבור `factorial` נבדקו `0`, `1`, ערך רגיל ומספר שלילי שצריך לזרוק חריגה.
- עבור `isPalindrome` נבדקה התעלמות מאותיות גדולות, רווחים וסימני פיסוק, וגם מחרוזת שאינה פלינדרום.
- עבור `fibonacciUpTo` נבדקו גבולות `0` ו-`1`, רצף עד `10`, וקלט שלילי.
- עבור `charFrequency` נבדקה ספירה מדויקת, רגישות לאותיות גדולות/קטנות ומחרוזת ריקה.
- עבור `isAnagram` נבדקה התעלמות מרווחים ואותיות גדולות/קטנות, וגם מקרים שאינם אנגרמות.
- עבור `average` נבדקו מערכים רגילים, שליליים, מעורבים ומערך ריק.
- עבור `filterEvens` נבדקו שמירת סדר, רשימה ללא זוגיים ורשימה ריקה.
- עבור `mostCommonWord` נבדקה התעלמות מאותיות גדולות וסימני פיסוק.

## תוצאה בפועל

הקובץ `app/src/test/java/org/example/AppTest.java` נכתב מחדש ומכיל סט בדיקות מלא עבור כל המתודות ב-`App.java`.

הבדיקות הורצו בהצלחה עם:

```bash
JAVA_HOME=/tmp/jdk-21.0.11+10/Contents/Home ./gradlew test
```

תוצאת ההרצה:

```text
BUILD SUCCESSFUL
```
