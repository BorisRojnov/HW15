public class Main {
    //todo Напишите код который распечатает букву и ее код для всех букв русского алфавита формат вывода:
    // А-123
    // Б-321...
    // Коды даны для примера и не соответствуют действительности. Учитывайте, что нужно распечатать коды букв в двух регистрах!
    static final String RUSSIAN_ALPHABET_UPPER = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    static final String RUSSIAN_ALPHABET_LOWER = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static void main(String[] args) {
        //todo код писать тут
        for(int i = 0; i < RUSSIAN_ALPHABET_UPPER.length(); i++) {
            System.out.print(RUSSIAN_ALPHABET_UPPER.charAt(i) + " - " +
                    ((int)(RUSSIAN_ALPHABET_UPPER.charAt(i))) + "\n");

            System.out.println(RUSSIAN_ALPHABET_LOWER.charAt(i) + " - " +
                    ((int)(RUSSIAN_ALPHABET_LOWER.charAt(i))) + "\n");
        }
    }
}