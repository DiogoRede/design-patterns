package behavioral.facade.src;

class Email {
    public void enviarConfirmacao(String produto) {
        System.out.println("Enviando e-mail de confirmação para " + produto);
    }
}