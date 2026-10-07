

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

    IO.println("Concatenando com booleano: ".concat(""+teste.startsWith("Testando")));
    IO.println("Concatenando com booleano: ".concat(""+teste.startsWith("Concatenando")));

    String[] pedacos = teste.split(" ");
    IO.println(pedacos.length);

    for (String pedaco : pedacos) {
        IO.println(pedaco);
    }
    String nome = "Refresco";
    String testeequals = IO.readln("Digite:");
    IO.println(nome == testeequals);
    IO.println(nome.equals(testeequals));//case-sensitive
    IO.println(nome.equalsIgnoreCase(testeequals));//ignora case-sensitive
}
