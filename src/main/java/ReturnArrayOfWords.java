public class ReturnArrayOfWords {

    /*14.Напишите метод, который принимает на вход предложение и возвращает
    слова из этого предложения в виде массива слов
    Test Data:
    “QA for Everyone” → {“QA”, “for”, “Everyone”}
    “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */

    public String [] returnArrayOfWords(String str){
        if (!str.isEmpty()){
            return str.split(" ");

        }

        return new String[0];
    }
}
