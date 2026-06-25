# Part 2 - LLM Self-Learning Chat

Date: 2026-06-25

Tool used: ChatGPT in Chrome.

Public share link: https://chatgpt.com/share/6a3d4321-ec0c-83eb-b1f5-e9a2d3d26fd3

The learning record below documents the prompt and the study conclusions used
for the assignment.

## Prompt

אני עובד על תרגיל בקורס כלי פיתוח בנושא כתיבת בדיקות יחידה ב-Java עם Gradle ו-JUnit.
תסביר לי בעברית, בצורה מסודרת וברורה, מה זה Unit Testing, למה משתמשים בו, איך
כותבים בדיקות ב-JUnit 5, מה ההבדל בין assertEquals/assertTrue/assertFalse/assertThrows/assertNotNull,
איך בוחרים מקרי קצה, ואיך יודעים שהבדיקות מספיקות ומכסות את כל מסלולי הפונקציות.
תן גם דוגמה קצרה לפונקציות כמו add, isPrime, factorial, reverse, palindrome,
fibonacci, average, filterEvens, mostCommonWord.

## Summary Of The Learning Conversation

בדיקות יחידה הן בדיקות קטנות וממוקדות שבודקות פונקציה או יחידת קוד אחת בנפרד.
המטרה היא לוודא שהפונקציה מחזירה את הערך הצפוי עבור קלטים שונים, וששינויים עתידיים
לא שוברים התנהגות קיימת.

ב-JUnit 5 כותבים מחלקת בדיקות תחת `src/test/java`, מסמנים כל בדיקה עם `@Test`,
ומשתמשים בפונקציות assert כדי להשוות בין התוצאה בפועל לבין התוצאה המצופה.

פונקציות assert מרכזיות:

- `assertEquals(expected, actual)` בודקת ששני ערכים שווים.
- `assertTrue(condition)` בודקת שתנאי בוליאני הוא אמת.
- `assertFalse(condition)` בודקת שתנאי בוליאני הוא שקר.
- `assertThrows(Exception.class, () -> code)` בודקת שקוד זורק חריגה צפויה.
- `assertNotNull(value)` בודקת שהערך אינו `null`.

בחירת מקרי קצה נעשית לפי תנאי הפונקציה:

- ערכים קטנים או גבוליים, כמו `0`, `1`, מספר שלילי, מערך ריק או מחרוזת ריקה.
- ערכים שמפעילים ענפי `if`, למשל מספר ראשוני מול מספר פריק.
- קלטים מיוחדים, למשל אותיות גדולות/קטנות, רווחים וסימני פיסוק.
- מקרי חריגה, למשל factorial של מספר שלילי או average של מערך ריק.

כדי לדעת שהבדיקות מספיקות, עוברים על כל פונקציה ועל כל תנאי פנימי בקוד, ובודקים
שלכל מסלול יש לפחות בדיקה אחת: הצלחה רגילה, כשל רגיל, קלט גבולי וחריגה אם קיימת.
בנוסף מריצים `./gradlew test` כדי לוודא שכל הבדיקות עוברות.

## Example Test Ideas

- `add`: מספרים חיוביים, שליליים ואפס.
- `isPrime`: מספר קטן מ-2, מספר ראשוני, מספר פריק, ריבוע של מספר ראשוני.
- `factorial`: `0`, `1`, מספר חיובי, מספר שלילי שצריך לזרוק חריגה.
- `reverse`: מחרוזת רגילה, מחרוזת ריקה, מחרוזת עם רווחים.
- `isPalindrome`: מחרוזת עם אותיות גדולות/קטנות, רווחים וסימני פיסוק.
- `fibonacciUpTo`: גבול `0`, גבול `1`, גבול רגיל, קלט שלילי.
- `average`: מערך רגיל, מערך עם שליליים, איבר יחיד, מערך ריק.
- `filterEvens`: רשימה מעורבת, רשימה ללא זוגיים, רשימה ריקה.
- `mostCommonWord`: טקסט עם אותיות גדולות/קטנות וסימני פיסוק.
