public class Sistema {

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double nota1 = 8.0;
        double nota2 = 7.0;

        double media = calcularMedia(nota1, nota2);
        String situacao = verificarSituacao(media);

        exibirResultado(nomeAluno, media, situacao);
    }

    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }

    public static String verificarSituacao(double media) {
        if (media >= 6.0) {
            return "Aprovado";
        }
        return "Reprovado";
    }

    public static void exibirResultado(String nome, double media, String situacao) {
        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + media);
        System.out.println(situacao);
    }
}