import java.util.Scanner;

public class Main {
    static final String VALID_CHARACTERS = " -АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    static final String SPACE = " ";

    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.
        System.out.println("Введите ФИО: ");
        String fullName = new Scanner(System.in).nextLine().trim();
        System.out.println(correctForm(fullName));
    }

    public static String correctForm(String name){
        boolean valid = true;
        int spaceCout = 0;

        for(int i = 0; i < name.length(); i++){
            if(SPACE.contains(String.valueOf(name.charAt(i)))){
                spaceCout++;
            }

            if(!VALID_CHARACTERS.contains(String.valueOf((name.charAt(i))))){
                valid = false;
                break;
            }
        }

        if(valid && spaceCout == 2){
            String firstName = (name.substring(0, name.indexOf(" "))).trim();
            String lastName = (name.substring(name.indexOf(" "), name.lastIndexOf(" ")).trim()) ;
            String surName = (name.substring(name.lastIndexOf(" ")).trim());

            return "Фамилия: " + firstName + "\n"
                    + "Имя: " + lastName + "\n"
                    + "Отчество: " + surName;
        }
        return "Введенная строка не является ФИО";
    }
}