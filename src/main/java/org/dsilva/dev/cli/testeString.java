

void main() {
    String teste;

    teste = "Testando métodos da Classe STRING ";

    IO.println("toUpperCase:                        " + teste.toUpperCase());
    IO.println("toLowerCase:                        " + teste.toLowerCase());
    IO.println("repeat:                             " + teste.repeat(3));
    IO.println("length:                             " + teste.length());
    IO.println("charAt(0):                          " + teste.charAt(0));
    IO.println("charAt(1):                          " + teste.charAt(1));
    IO.println("charAt(22):                         " + teste.charAt(22));
    IO.println("toLowerCase().replace(' ', '-'):    " + teste.toLowerCase().replace(' ', '-'));
    IO.println("contains('Testando'):               " + teste.contains("Testando"));
    IO.println("contains('Classe'):                 " + teste.contains("Classe"));
    IO.println("contains('string'):                 " + teste.contains("string"));
    IO.println("startsWith('Testando'):             "  + teste.startsWith("Testando"));
    IO.println("concat('Concatenando'):             " + teste.concat("Concatenando"));
    IO.println("endsWith('Classe'):                 " + teste.endsWith("Classe"));
    IO.println("endsWith('STRING'):                 " + teste.endsWith("STRING"));
    IO.println("substring(0,8):                     " + teste.substring(0,8));
    IO.println("substring(11):                      " + teste.substring(11));
}
