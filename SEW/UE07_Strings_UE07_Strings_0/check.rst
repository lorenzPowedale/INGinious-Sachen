

(a) Schreibe die Methode:
    
    .. code:: java
    
        public static String repeat(String text, int count)
    
    Die Methode soll den Text ``text`` ``count``-mal hintereinander hängen.
    
    - Die Methode soll einen Leerstring liefern, wenn ``count ≤ 0`` ist.
    
    - Beispiel: ``System.out.println(repeat("ab", 3)); // Ausgabe: ababab``


(a) Schreibe die Methode:
    
    .. code:: java
    
        public static String reverse (String s)
    
    Die Methode soll den String ``s`` umdrehen.
    
    - Beispiel: ``System.out.println(reverse("abc")); // Ausgabe: cba``


(a) Schreibe die Methode:
    
    .. code:: java
    
        public static String removeNonLetters(String s)
    
    Die Methode soll alle Zeichen aus dem String ``s`` herauslöschrn, die keine Buchstaben sind.
    
    - Tipp: Mittels der Methode ``Character.isLetter(char ch)`` kann überprüft werden, ob das Zeichen ``ch`` ein Letter ist.
    - Beispiele:
    
      - ``Character.isLetter('ü') → true``
    
      - ``Character.isLetter('+') → false``


(a) Schreibe die Methode:
    
    .. code:: java
    
        public static boolean isWordPalindrom(String word)
    
    
    Die Methode testet, ob ``word`` ein Wortpalindrom ist.
    
    - Ein Wortpalindrom ist ein Wort, das rückwärts und vorwärts gelesen das selbe Wort ergibt.
    
    - Die Groß-/Kleinschreibung ist dabei irrelevant.
    
    - Beispiele:
    
      - ``isWordPalindrom("Lagerregal") → true``
    
      - ``isWordPalindrom("hugo") → false``
    
    Die Methode ``reverse(String)`` wird dir zur Verfügung gestellt.


(a) Schreibe die Methode:
    
    .. code:: java
    
        public static boolean isPalindrom(String s)
    
    Die Methode testet, ob ``s`` ein Satzpalindrom ist.
    
    - Erweitere dazu die Methode isWordPalindrom.
    
    - Ignoriere alle Zeichen, die keine Letters sind. (Tipp: **removeNonLetters**)
    
    - Beispiel: ``isPalindrom("Die Liebe ist Sieger; stets rege ist sie bei Leid.") → true``
    
    Die Methoden ``reverse(String)``, ``isWordPalindrom(String)`` und ``removeNonLetters(String)`` werden dir zur Verfügung gestellt.


(a) Schreibe die Methode:
    
    .. code:: java
    
        public static String getRandomPassword(int length)
    
    Die Methode soll ein „starkes“ Passwort mit Zufallszeichen erzeugen.
    
    - Das Passwort soll ``length`` Zeichen haben.
    
    - Es soll aus den Zeichen `"a-zA-Z0-9"` bestehen.
    
    - Jedoch ohne dem kleinen `'L'` bzw. dem großen `'O'`, da diese Zeichen schlecht von 1 bzw 0 unterschieden werden können.
    
    - Tipp: Ein (langes) Passwort mit Zufallszeichen ist ziemlich unknackbar.
