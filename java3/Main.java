public class Main {

    public static void main(String[] args) {
        String inputText = "java kode? test";
        String resultText = modifyText(inputText);
        System.out.println(resultText);
    }
    public static String modifyText(String text) {
        StringBuilder modifiedText = new StringBuilder();
        String[] words = text.split("(?<=\\W)|(\\s+)");
        for (String word : words) {
            if (word.matches("\\w+")) { 
                char firstChar = word.charAt(0); 
                String modifiedWord = word.substring(1) + firstChar + "ауч"; 
                modifiedText.append(modifiedWord); 
            } else {
                modifiedText.append(word); 
            }
        }
        return modifiedText.toString(); 
    }
}